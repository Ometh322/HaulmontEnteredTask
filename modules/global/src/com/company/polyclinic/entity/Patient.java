package com.company.polyclinic.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseLongIdEntity;
import com.haulmont.cuba.core.entity.SoftDelete;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Table(name = "POLYCLINIC_PATIENT")
@Entity(name = "polyclinic_Patient")
@NamePattern("%s %s|firstName,lastName")
public class Patient extends BaseLongIdEntity implements SoftDelete {
    private static final long serialVersionUID = -6340522017823183906L;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "PATRONYMIC")
    private String patronymic;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @JoinTable(name = "POLYCLINIC_RECIPE_PATIENT_LINK",
            joinColumns = @JoinColumn(name = "PATIENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "RECIPE_ID"))
    @ManyToMany
    private List<Recipe> recipes;

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

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

}