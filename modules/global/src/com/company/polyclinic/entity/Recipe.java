package com.company.polyclinic.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseLongIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Table(name = "POLYCLINIC_RECIPE")
@Entity(name = "polyclinic_Recipe")
@NamePattern("%s|description")
public class Recipe extends BaseLongIdEntity implements HasUuid {
    private static final long serialVersionUID = 8186382834766287102L;

    @Column(name = "UUID")
    private UUID uuid;

    @JoinTable(name = "POLYCLINIC_RECIPE_PATIENT_LINK",
            joinColumns = @JoinColumn(name = "RECIPE_ID"),
            inverseJoinColumns = @JoinColumn(name = "PATIENT_ID"))
    @ManyToMany
    @OnDeleteInverse(DeletePolicy.DENY)
    private List<Patient> patient;

    @NotNull
    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "PRIORITY", nullable = false)
    @NotNull
    private Integer priority;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DOCTOR_ID")
    @OnDeleteInverse(DeletePolicy.DENY)
    @NotNull
    private Doctor doctor;


    @NotNull
    @Column(name = "START_DATE", nullable = false)
    private LocalDateTime startDate;

    @NotNull
    @Column(name = "DURATION", nullable = false)
    @Positive
    private Integer duration;

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setPatient(List<Patient> patient) {
        this.patient = patient;
    }

    public List<Patient> getPatient() {
        return patient;
    }


    public void setPriority(Priority priority) {
        this.priority = priority == null ? null : priority.getId();
    }

    public Priority getPriority() {
        return priority == null ? null : Priority.fromId(priority);
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @MetaProperty(related = {"startDate", "duration"})
    public LocalDateTime getEndDate(){
        return (startDate != null && duration != null) ? startDate.plusMonths(duration):null;
    }
}