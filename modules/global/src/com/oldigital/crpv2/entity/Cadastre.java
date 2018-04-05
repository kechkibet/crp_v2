package com.oldigital.crpv2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "CRPV2_CADASTRE")
@Entity(name = "crpv2$Cadastre")
public class Cadastre extends StandardEntity {
    private static final long serialVersionUID = -7885141448276678162L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "POLYGON_GEOMETRY")
    protected String polygonGeometry;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPolygonGeometry(String polygonGeometry) {
        this.polygonGeometry = polygonGeometry;
    }

    public String getPolygonGeometry() {
        return polygonGeometry;
    }


}