package com.oldigital.crpv2.entity.enums;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum RentBasedOn implements EnumClass<Integer> {

    Site_Value_Rate(1),
    Graduated_upon_Area(2),
    Based_on_use_of_Land(3),
    Flat_Rate(4),
    Not_Applicable(5);

    private Integer id;

    RentBasedOn(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static RentBasedOn fromId(Integer id) {
        for (RentBasedOn at : RentBasedOn.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}