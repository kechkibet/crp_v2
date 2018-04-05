package com.oldigital.crpv2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.global.DesignSupport;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import com.haulmont.cuba.core.entity.BaseIntIdentityIdEntity;
import com.haulmont.cuba.core.entity.Versioned;
import com.haulmont.cuba.core.entity.Updatable;
import com.haulmont.cuba.core.entity.Creatable;

@DesignSupport("{'imported':true}")
@NamePattern("%s|name")
@Table(name = "valuationrolls")
@Entity(name = "crpv2$Valuationrolls")
public class Valuationrolls extends BaseIntIdentityIdEntity implements Versioned, Updatable, Creatable {
    private static final long serialVersionUID = -3340448138144384554L;

    @Column(name = "`valuationCode`")
    protected Integer valuationCode;

    @Column(name = "name", nullable = false)
    protected String name;

    @Column(name = "`rollType`", nullable = false)
    protected String rollType;

    @Column(name = "`landUse`", nullable = false)
    protected String landUse;

    @Column(name = "`siteValue`")
    protected String siteValue;

    @Column(name = "`valuationMethod`")
    protected String valuationMethod;

    @Column(name = "`ratingMethod`")
    protected String ratingMethod;

    @Column(name = "`annualRate`")
    protected String annualRate;

    @Column(name = "`rentBasedOn`")
    protected String rentBasedOn;

    @Column(name = "exempt")
    protected String exempt;

    @Column(name = "`rateableValue`")
    protected String rateableValue;

    @Column(name = "`sizeInHa`")
    protected Integer sizeInHa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`subCounty`")
    protected Subcounties subCounty;

    @Column(name = "CREATE_TS")
    protected Date createTs;

    @Column(name = "CREATED_BY", length = 50)
    protected String createdBy;

    @Column(name = "UPDATE_TS")
    protected Date updateTs;

    @Column(name = "UPDATED_BY", length = 50)
    protected String updatedBy;

    @Version
    @Column(name = "VERSION")
    protected Integer version;

    public void setValuationCode(Integer valuationCode) {
        this.valuationCode = valuationCode;
    }

    public Integer getValuationCode() {
        return valuationCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollType(String rollType) {
        this.rollType = rollType;
    }

    public String getRollType() {
        return rollType;
    }

    public void setLandUse(String landUse) {
        this.landUse = landUse;
    }

    public String getLandUse() {
        return landUse;
    }

    public void setSiteValue(String siteValue) {
        this.siteValue = siteValue;
    }

    public String getSiteValue() {
        return siteValue;
    }

    public void setValuationMethod(String valuationMethod) {
        this.valuationMethod = valuationMethod;
    }

    public String getValuationMethod() {
        return valuationMethod;
    }

    public void setRatingMethod(String ratingMethod) {
        this.ratingMethod = ratingMethod;
    }

    public String getRatingMethod() {
        return ratingMethod;
    }

    public void setAnnualRate(String annualRate) {
        this.annualRate = annualRate;
    }

    public String getAnnualRate() {
        return annualRate;
    }

    public void setRentBasedOn(String rentBasedOn) {
        this.rentBasedOn = rentBasedOn;
    }

    public String getRentBasedOn() {
        return rentBasedOn;
    }

    public void setExempt(String exempt) {
        this.exempt = exempt;
    }

    public String getExempt() {
        return exempt;
    }

    public void setRateableValue(String rateableValue) {
        this.rateableValue = rateableValue;
    }

    public String getRateableValue() {
        return rateableValue;
    }

    public void setSizeInHa(Integer sizeInHa) {
        this.sizeInHa = sizeInHa;
    }

    public Integer getSizeInHa() {
        return sizeInHa;
    }

    public void setSubCounty(Subcounties subCounty) {
        this.subCounty = subCounty;
    }

    public Subcounties getSubCounty() {
        return subCounty;
    }

    @Override
    public void setCreateTs(Date createTs) {
        this.createTs = createTs;
    }

    @Override
    public Date getCreateTs() {
        return createTs;
    }

    @Override
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setUpdateTs(Date updateTs) {
        this.updateTs = updateTs;
    }

    @Override
    public Date getUpdateTs() {
        return updateTs;
    }

    @Override
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String getUpdatedBy() {
        return updatedBy;
    }

    @Override
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public Integer getVersion() {
        return version;
    }


}