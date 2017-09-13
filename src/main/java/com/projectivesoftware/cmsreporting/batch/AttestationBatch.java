/*
 * Copyright (C) Imaging in Motion Associates LLC, 2015 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.projectivesoftware.cmsreporting.batch;

import com.projectivesoftware.cmsreporting.domain.Attestation;
import com.projectivesoftware.cmsreporting.domain.Provider;
import com.projectivesoftware.cmsreporting.service.AttestationRepository;
import com.projectivesoftware.cmsreporting.service.ProviderRepository;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.util.Assert;

import java.util.Optional;

@Configuration
public class AttestationBatch {

    private final String inputDirectory;

    private final String attestationFileName;

    private final ProviderRepository providerRepository;

    @Autowired
    public AttestationBatch(@Value("${com.projectivesoftware.cms-reporting-server.input.directory}") String inputDirectory,
                            @Value("${com.projectivesoftware.cms-reporting-server.input.mu-attestation-filename}") String attestationFileName,
                            ProviderRepository providerRepository) {
        Assert.notNull(inputDirectory, "inputDirectory must not be null!");
        Assert.notNull(attestationFileName, "attestationFileName must not be null!");
        this.inputDirectory = inputDirectory;
        this.attestationFileName = attestationFileName;
        this.providerRepository = providerRepository;
    }

    @Bean
    public FlatFileItemReader<Attestation> attestationFileReader(LineMapper<Attestation> attestationLineMapper) {
        FlatFileItemReader<Attestation> reader = new FlatFileItemReader<>();
        reader.setLineMapper(attestationLineMapper);
        FileSystemResource fileSystemResource = new FileSystemResource(inputDirectory + "/" + attestationFileName);
        reader.setResource(fileSystemResource);
        reader.setLinesToSkip(1);
        reader.setSaveState(false);

        try {
            reader.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return reader;
    }

    @Bean
    public LineMapper<Attestation> attestationLineMapper(DelimitedLineTokenizer attestationLineTokenizer) {
        DefaultLineMapper<Attestation> lineMapper = new DefaultLineMapper<>();
        lineMapper.setLineTokenizer(attestationLineTokenizer);
        lineMapper.setFieldSetMapper(fieldSet -> {
                Attestation attestation = new Attestation();
                attestation.setAttestationId(fieldSet.readLong("attestationId"));
                attestation.setCertificationNumber(fieldSet.readString("certificationNumber"));
                attestation.setVendorName(fieldSet.readString("vendorName"));
                attestation.setChpId(fieldSet.readString("chpId"));
                attestation.setProductName(fieldSet.readString("productName"));
                attestation.setProductVersion(fieldSet.readString("productVersion"));
                attestation.setProductClassification(fieldSet.readString("productClassification"));
                attestation.setProductSetting(fieldSet.readString("productSetting"));
                attestation.setProductCertificationYear(fieldSet.readString("productCertificationYear"));
                attestation.setAttestationMonth(fieldSet.readString("attestationMonth"));
                attestation.setAttestationYear(fieldSet.readString("attestationYear"));
                attestation.setBusinessStateTerritory(fieldSet.readString("businessStateTerritory"));
                attestation.setProviderType(fieldSet.readString("providerType"));
                attestation.setSpecialty(fieldSet.readString("specialty"));
                attestation.setProgramYear(fieldSet.readString("programYear"));
                attestation.setPaymentYear(fieldSet.readString("paymentYear"));
                attestation.setProviderStageNumber(fieldSet.readString("providerStageNumber"));
                attestation.setProgramType(fieldSet.readString("programType"));

                Optional<Provider> providerOptional = providerRepository.findById("".equals(fieldSet.readString("npi")) ? -1L : Long.parseLong(fieldSet.readString("npi")));
                Provider provider = providerOptional.orElse(null);
                Assert.notNull(provider, "provider must not be null!");
                attestation.setProvider(provider);

                attestation.setCcn("".equals(fieldSet.readString("ccn")) ? null : Long.parseLong(fieldSet.readString("ccn")));
                return attestation;
        });
        return lineMapper;
    }

    @Bean
    public DelimitedLineTokenizer attestationLineTokenizer() {
        DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
        String[] attestationFields = {
                "certificationNumber",
                "vendorName",
                "chpId",
                "productName",
                "productVersion",
                "productClassification",
                "productSetting",
                "productCertificationYear",
                "attestationMonth",
                "attestationYear",
                "businessStateTerritory",
                "providerType",
                "specialty",
                "programYear",
                "paymentYear",
                "providerStageNumber",
                "programType",
                "stage2Scheduled2014",
                "muDefinition2014",
                "attestationId",
                "npi",
                "ccn"
        };
        delimitedLineTokenizer.setNames(attestationFields);
        return delimitedLineTokenizer;
    }

    @Bean
    public RepositoryItemWriter<Attestation> attestationWriter(AttestationRepository attestationRepository) {
        RepositoryItemWriter<Attestation> writer = new RepositoryItemWriter<>();
        writer.setRepository(attestationRepository);
        writer.setMethodName("save");
        return writer;
    }
}
