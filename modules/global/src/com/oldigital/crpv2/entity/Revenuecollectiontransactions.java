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
@Table(name = "revenuecollectiontransactions")
@Entity(name = "crpv2$Revenuecollectiontransactions")
public class Revenuecollectiontransactions extends BaseIntIdentityIdEntity implements Versioned, SoftDelete, Updatable, Creatable {
    private static final long serialVersionUID = 5553725375002102205L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`revenueStream`")
    protected Revenuestreams revenueStream;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`revenueCollector`")
    protected Revenuecollectors revenueCollector;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datetime")
    protected Date datetime;

    @Column(name = "description")
    protected String description;

    @Column(name = "`paymentMode`")
    protected String paymentMode;

    @Column(name = "`paymentID`")
    protected String paymentID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`revenueSection`")
    protected Revenuecategory revenueSection;

    @Column(name = "amount")
    protected Integer amount;

    @Column(name = "`offlineID`")
    protected String offlineID;

    @Column(name = "`citizenID`")
    protected Integer citizenID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`paymentModeID`")
    protected Paymentmodes paymentModeID;

    @Column(name = "`reconStatus`")
    protected Integer reconStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`reconFileID`")
    protected Reconfiles reconFileID;

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


    public void setRevenueStream(Revenuestreams revenueStream) {
        this.revenueStream = revenueStream;
    }

    public Revenuestreams getRevenueStream() {
        return revenueStream;
    }

    public void setRevenueCollector(Revenuecollectors revenueCollector) {
        this.revenueCollector = revenueCollector;
    }

    public Revenuecollectors getRevenueCollector() {
        return revenueCollector;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setRevenueSection(Revenuecategory revenueSection) {
        this.revenueSection = revenueSection;
    }

    public Revenuecategory getRevenueSection() {
        return revenueSection;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setOfflineID(String offlineID) {
        this.offlineID = offlineID;
    }

    public String getOfflineID() {
        return offlineID;
    }

    public void setCitizenID(Integer citizenID) {
        this.citizenID = citizenID;
    }

    public Integer getCitizenID() {
        return citizenID;
    }

    public void setPaymentModeID(Paymentmodes paymentModeID) {
        this.paymentModeID = paymentModeID;
    }

    public Paymentmodes getPaymentModeID() {
        return paymentModeID;
    }

    public void setReconStatus(Integer reconStatus) {
        this.reconStatus = reconStatus;
    }

    public Integer getReconStatus() {
        return reconStatus;
    }

    public void setReconFileID(Reconfiles reconFileID) {
        this.reconFileID = reconFileID;
    }

    public Reconfiles getReconFileID() {
        return reconFileID;
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