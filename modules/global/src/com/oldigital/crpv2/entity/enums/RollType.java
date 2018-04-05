package com.oldigital.crpv2.entity.enums;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum RollType implements EnumClass<Integer> {

    Private_Land(1),
    Public_Institutions(2),
    Government_Of_Kenya(3),
    Kenya_Railways(4),
    Other_organizations(5),
    This_Local_Authority(6),
    Other_Local_Authorities(7);

    private Integer id;

    RollType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static RollType fromId(Integer id) {
        for (RollType at : RollType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}