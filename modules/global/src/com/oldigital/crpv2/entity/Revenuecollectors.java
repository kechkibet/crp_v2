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
import com.haulmont.cuba.core.entity.SoftDelete;
import com.haulmont.cuba.core.entity.Updatable;
import com.haulmont.cuba.core.entity.Creatable;

@DesignSupport("{'imported':true}")
@NamePattern("%s|name")
@Table(name = "revenuecollectors")
@Entity(name = "crpv2$Revenuecollectors")
public class Revenuecollectors extends BaseIntIdentityIdEntity implements Versioned, SoftDelete, Updatable, Creatable {
    private static final long serialVersionUID = 2569825327144550766L;

    @Column(name = "name")
    protected String name;

    @Column(name = "`idNumber`")
    protected String idNumber;

    @Column(name = "`deviceSN`")
    protected String deviceSN;

    @Column(name = "`devicePIN`")
    protected Integer devicePIN;

    @Column(name = "`offlineCreditLimit`")
    protected Integer offlineCreditLimit;

    @Column(name = "`offlineRcptNumber`")
    protected Integer offlineRcptNumber;

    @Column(name = "`isBackOffice`")
    protected Boolean isBackOffice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`reconPerson`")
    protected Persons reconPerson;

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


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setDeviceSN(String deviceSN) {
        this.deviceSN = deviceSN;
    }

    public String getDeviceSN() {
        return deviceSN;
    }

    public void setDevicePIN(Integer devicePIN) {
        this.devicePIN = devicePIN;
    }

    public Integer getDevicePIN() {
        return devicePIN;
    }

    public void setOfflineCreditLimit(Integer offlineCreditLimit) {
        this.offlineCreditLimit = offlineCreditLimit;
    }

    public Integer getOfflineCreditLimit() {
        return offlineCreditLimit;
    }

    public void setOfflineRcptNumber(Integer offlineRcptNumber) {
        this.offlineRcptNumber = offlineRcptNumber;
    }

    public Integer getOfflineRcptNumber() {
        return offlineRcptNumber;
    }

    public void setIsBackOffice(Boolean isBackOffice) {
        this.isBackOffice = isBackOffice;
    }

    public Boolean getIsBackOffice() {
        return isBackOffice;
    }

    public void setReconPerson(Persons reconPerson) {
        this.reconPerson = reconPerson;
    }

    public Persons getReconPerson() {
        return reconPerson;
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