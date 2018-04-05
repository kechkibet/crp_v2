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
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.oldigital.crpv2.entity.enums.LandInterest;

@DesignSupport("{'imported':true}")
@Table(name = "propertyregister")
@Entity(name = "crpv2$Propertyregister")
public class Propertyregister extends BaseIntIdentityIdEntity implements Versioned, SoftDelete, Updatable, Creatable {
    private static final long serialVersionUID = 1931689327329128227L;

    @Column(name = "`gpsLongitude`")
    protected String gpsLongitude;

    @Column(name = "`gpsLatitude`")
    protected String gpsLatitude;

    @Column(name = "`gpsAltitude`")
    protected String gpsAltitude;

    @Column(name = "`lrNumber`")
    protected String lrNumber;

    @Column(name = "`physicalLocation`")
    protected String physicalLocation;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "`valuationRoll`")
    protected Valuationrolls valuationRoll;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`subCounty`")
    protected Subcounties subCounty;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`uploadTitleDeed`")
    protected FileDescriptor uploadTitleDeed;

    @Column(name = "`sizeInHa`")
    protected Integer sizeInHa;

    @Column(name = "interest")
    protected Integer interest;

    @Temporal(TemporalType.DATE)
    @Column(name = "`leaseStartDate`")
    protected Date leaseStartDate;

    @Column(name = "`leaseExpiry`")
    protected Integer leaseExpiry;

    @Column(name = "status")
    protected Boolean status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`uploadStampDuty`")
    protected FileDescriptor uploadStampDuty;

    @Column(name = "`sellingValue`")
    protected Integer sellingValue;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "`ratePayer`")
    protected Persons ratePayer;

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

    public LandInterest getInterest() {
        return interest == null ? null : LandInterest.fromId(interest);
    }

    public void setInterest(LandInterest interest) {
        this.interest = interest == null ? null : interest.getId();
    }


    public FileDescriptor getUploadTitleDeed() {
        return uploadTitleDeed;
    }

    public void setUploadTitleDeed(FileDescriptor uploadTitleDeed) {
        this.uploadTitleDeed = uploadTitleDeed;
    }


    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


    public FileDescriptor getUploadStampDuty() {
        return uploadStampDuty;
    }

    public void setUploadStampDuty(FileDescriptor uploadStampDuty) {
        this.uploadStampDuty = uploadStampDuty;
    }


    @Override
    public Boolean isDeleted() {
        return deleteTs != null;
    }


    public void setGpsLongitude(String gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

    public String getGpsLongitude() {
        return gpsLongitude;
    }

    public void setGpsLatitude(String gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

    public String getGpsLatitude() {
        return gpsLatitude;
    }

    public void setGpsAltitude(String gpsAltitude) {
        this.gpsAltitude = gpsAltitude;
    }

    public String getGpsAltitude() {
        return gpsAltitude;
    }

    public void setLrNumber(String lrNumber) {
        this.lrNumber = lrNumber;
    }

    public String getLrNumber() {
        return lrNumber;
    }

    public void setPhysicalLocation(String physicalLocation) {
        this.physicalLocation = physicalLocation;
    }

    public String getPhysicalLocation() {
        return physicalLocation;
    }

    public void setValuationRoll(Valuationrolls valuationRoll) {
        this.valuationRoll = valuationRoll;
    }

    public Valuationrolls getValuationRoll() {
        return valuationRoll;
    }

    public void setSubCounty(Subcounties subCounty) {
        this.subCounty = subCounty;
    }

    public Subcounties getSubCounty() {
        return subCounty;
    }

    public void setSizeInHa(Integer sizeInHa) {
        this.sizeInHa = sizeInHa;
    }

    public Integer getSizeInHa() {
        return sizeInHa;
    }

    public void setLeaseStartDate(Date leaseStartDate) {
        this.leaseStartDate = leaseStartDate;
    }

    public Date getLeaseStartDate() {
        return leaseStartDate;
    }

    public void setLeaseExpiry(Integer leaseExpiry) {
        this.leaseExpiry = leaseExpiry;
    }

    public Integer getLeaseExpiry() {
        return leaseExpiry;
    }

    public void setSellingValue(Integer sellingValue) {
        this.sellingValue = sellingValue;
    }

    public Integer getSellingValue() {
        return sellingValue;
    }

    public void setRatePayer(Persons ratePayer) {
        this.ratePayer = ratePayer;
    }

    public Persons getRatePayer() {
        return ratePayer;
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