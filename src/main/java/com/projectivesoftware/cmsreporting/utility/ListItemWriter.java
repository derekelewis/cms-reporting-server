/*
 * Copyright (c) Derek Lewis <derek.e.lewis@outlook.com>, 2021
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
