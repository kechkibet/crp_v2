package com.oldigital.crpv2.entity.enums;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum LandInterest implements EnumClass<Integer> {

    FreeHold(10),
    LeaseHold(20);

    private Integer id;

    LandInterest(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static LandInterest fromId(Integer id) {
        for (LandInterest at : LandInterest.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}