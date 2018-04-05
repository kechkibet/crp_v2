package com.oldigital.crpv2.entity.enums;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ValuationMethod implements EnumClass<Integer> {

    Unimproved_Site_Value(1),
    Improved_Site_Value(2);

    private Integer id;

    ValuationMethod(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static ValuationMethod fromId(Integer id) {
        for (ValuationMethod at : ValuationMethod.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}