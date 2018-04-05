package com.oldigital.crpv2.entity.enums;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum PermitStatus implements EnumClass<String> {

    Unpaid("unpaid"),
    Paid("paid"),
    Approved("approved"),
    Printed("printed");

    private String id;

    PermitStatus(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static PermitStatus fromId(String id) {
        for (PermitStatus at : PermitStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}