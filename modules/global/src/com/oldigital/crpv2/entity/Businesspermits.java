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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import com.haulmont.cuba.core.entity.BaseIntIdentityIdEntity;
import com.haulmont.cuba.core.entity.Versioned;
import com.haulmont.cuba.core.entity.SoftDelete;
import com.haulmont.cuba.core.entity.Updatable;
import com.haulmont.cuba.core.entity.Creatable;

@DesignSupport("{'imported':true}")
@NamePattern("%s|description")
@Table(name = "businesspermits")
@Entity(name = "crpv2$Businesspermits")
public class Businesspermits extends BaseIntIdentityIdEntity implements Versioned, SoftDelete, Updatable, Creatable {
    private static final long serialVersionUID = 199799186597286764L;

    @Column(name = "status")
    protected String status;

    @Column(name = "`amountPaid`")
    protected Integer amountPaid;

    @Temporal(TemporalType.DATE)
    @Column(name = "`expiryDate`")
    protected Date expiryDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "`creationDate`")
    protected Date creationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`permitPayer`")
    protected Persons permitPayer;

    @Column(name = "description")
    protected String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`businessID`")
    protected Businesses businessID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`activityCode`")
    protected Activitycodes activityCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`propertyRegisterID`")
    protected Propertyregister propertyRegisterID;

    @Column(name = "`numberOfEmployees`")
    protected Integer numberOfEmployees;

    @Column(name = "`certificateNo`")
    protected Integer certificateNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`rcptNumber`")
    protected Revenuecollectiontransactions rcptNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`invoiceNumber`")
    protected Invoices invoiceNumber;

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


    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setAmountPaid(Integer amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Integer getAmountPaid() {
        return amountPaid;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setPermitPayer(Persons permitPayer) {
        this.permitPayer = permitPayer;
    }

    public Persons getPermitPayer() {
        return permitPayer;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setBusinessID(Businesses businessID) {
        this.businessID = businessID;
    }

    public Businesses getBusinessID() {
        return businessID;
    }

    public void setActivityCode(Activitycodes activityCode) {
        this.activityCode = activityCode;
    }

    public Activitycodes getActivityCode() {
        return activityCode;
    }

    public void setPropertyRegisterID(Propertyregister propertyRegisterID) {
        this.propertyRegisterID = propertyRegisterID;
    }

    public Propertyregister getPropertyRegisterID() {
        return propertyRegisterID;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setCertificateNo(Integer certificateNo) {
        this.certificateNo = certificateNo;
    }

    public Integer getCertificateNo() {
        return certificateNo;
    }

    public void setRcptNumber(Revenuecollectiontransactions rcptNumber) {
        this.rcptNumber = rcptNumber;
    }

    public Revenuecollectiontransactions getRcptNumber() {
        return rcptNumber;
    }

    public void setInvoiceNumber(Invoices invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Invoices getInvoiceNumber() {
        return invoiceNumber;
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