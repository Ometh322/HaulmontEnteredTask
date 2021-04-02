package com.company.polyclinic.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseLongIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.SoftDelete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.Date;
import java.util.UUID;

@Table(name = "POLYCLINIC_DOCTOR")
@Entity(name = "polyclinic_Doctor")
@NamePattern("%s %s|specialization,lastName")
public class Doctor extends BaseLongIdEntity implements HasUuid, SoftDelete {
    private static final long serialVersionUID = 9074793404419414587L;

    @Column(name = "UUID")
    private UUID uuid;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "PATRONYMIC")
    private String patronymic;

    @Column(name = "SPECIALIZATION")
    private String specialization;

    @Column(name = "NUM_OF_RECIPES")
    @PositiveOrZero
    private Integer numOfRecipes;

    @Column(name = "DELETE_TS")
    private Date deleteTs;

    @Column(name = "DELETED_BY", length = 50)
    private String deletedBy;

    @Override
    public Boolean isDeleted() {
        return deleteTs != null;
    }

    @Override
    public String getDeletedBy() {
        return deletedBy;
    }

    @Override
    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    @Override
    public Date getDeleteTs() {
        return deleteTs;
    }

    @Override
    public void setDeleteTs(Date deleteTs) {
        this.deleteTs = deleteTs;
    }

    public void setNumOfRecipes(Integer numOfRecipes) {
        this.numOfRecipes = numOfRecipes;
    }

    public Integer getNumOfRecipes() {
        return numOfRecipes;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}