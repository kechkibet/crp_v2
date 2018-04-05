package com.oldigital.crpv2.entity.enums;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum RatingMethod implements EnumClass<Integer> {

    Site_Value_Rate(1),
    Flat_Rate_by_Plot_Size(2),
    Graduated_Upon_Area(3),
    Based_on_use_of_Land(4);

    private Integer id;

    RatingMethod(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static RatingMethod fromId(Integer id) {
        for (RatingMethod at : RatingMethod.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}