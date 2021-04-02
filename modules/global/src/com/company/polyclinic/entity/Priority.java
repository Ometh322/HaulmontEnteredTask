package com.company.polyclinic.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Priority implements EnumClass<Integer> {

    NORMAL(10),
    CITO(20),
    STATIM(30);

    private Integer id;

    Priority(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Priority fromId(Integer id) {
        for (Priority at : Priority.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}