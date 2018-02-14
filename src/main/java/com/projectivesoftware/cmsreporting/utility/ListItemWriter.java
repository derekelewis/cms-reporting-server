/*
 * Copyright (C) Projective Software LLC, 2017 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.projectivesoftware.cmsreporting.utility;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class ListItemWriter<T> implements ItemWriter<List<T>> {

    private ItemWriter<T> wrapped;

    public ListItemWriter(ItemWriter<T> wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void write(List<? extends List<T>> items) throws Exception {
        for (List<T> subList : items) {
            wrapped.write(subList);
        }
    }
}
