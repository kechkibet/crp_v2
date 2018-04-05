package com.oldigital.crpv2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.global.DesignSupport;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import com.haulmont.cuba.core.entity.BaseIntIdentityIdEntity;
import com.haulmont.cuba.core.entity.Versioned;
import com.haulmont.cuba.core.entity.SoftDelete;
import com.haulmont.cuba.core.entity.Updatable;
import com.haulmont.cuba.core.entity.Creatable;

@DesignSupport("{'imported':true}")
@Table(name = "propertycharges")
@Entity(name = "crpv2$Propertycharges")
public class Propertycharges extends BaseIntIdentityIdEntity implements Versioned, SoftDelete, Updatable, Creatable {
    private static final long serialVersionUID = 7265812037295360755L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "`propertyID`")
    protected Propertyregister propertyID;

    @Column(name = "`amountCharged`", nullable = false)
    protected String amountCharged;

    @Column(name = "`chargeType`", nullable = false)
    protected String chargeType;

    @Temporal(TemporalType.DATE)
    @Column(name = "`dateCharged`", nullable = false)
    protected Date dateCharged;

    @Column(name = "`cronJobID`")
    protected String cronJobID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`invoiceID`")
    protected Invoices invoiceID;

    @Column(name = "CREATE_TS")
    protected Date createTs;

    @Column(name = "CREATED_BY", length = 50)
    protected String createdBy;

    @Column(name = "DELETE_TS")
    protected Date deleteTs;

    @Column(name = "DELETED_BY", length = 50)
    protected String deletedBy;

    @Column(name = "UPDATE_TS")
    protected Date updateTs;

    @Column(name = "UPDATED_BY", length = 50)
    protected String updatedBy;

    @Version
    @Column(name = "VERSION")
    protected Integer version;

    @Override
    public Boolean isDeleted() {
        return deleteTs != null;
    }


    public void setPropertyID(Propertyregister propertyID) {
        this.propertyID = propertyID;
    }

    public Propertyregister getPropertyID() {
        return propertyID;
    }

    public void setAmountCharged(String amountCharged) {
        this.amountCharged = amountCharged;
    }

    public String getAmountCharged() {
        return amountCharged;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setDateCharged(Date dateCharged) {
        this.dateCharged = dateCharged;
    }

    public Date getDateCharged() {
        return dateCharged;
    }

    public void setCronJobID(String cronJobID) {
        this.cronJobID = cronJobID;
    }

    public String getCronJobID() {
        return cronJobID;
    }

    public void setInvoiceID(Invoices invoiceID) {
        this.invoiceID = invoiceID;
    }

    public Invoices getInvoiceID() {
        return invoiceID;
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
    public void setDeleteTs(Date deleteTs) {
        this.deleteTs = deleteTs;
    }

    @Override
    public Date getDeleteTs() {
        return deleteTs;
    }

    @Override
    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    @Override
    public String getDeletedBy() {
        return deletedBy;
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