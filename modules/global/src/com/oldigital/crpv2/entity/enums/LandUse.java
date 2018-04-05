package com.oldigital.crpv2.entity.enums;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum LandUse implements EnumClass<Integer> {

    Residential(1),
    Commercial(2),
    Industrial(3),
    Agricultural(4),
    Mining_Extraction(5),
    Forestry(6),
    National_Park(7),
    Other(8);

    private Integer id;

    LandUse(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static LandUse fromId(Integer id) {
        for (LandUse at : LandUse.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}