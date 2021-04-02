package com.company.polyclinic.web.screens.doctor;

import com.haulmont.cuba.gui.components.data.ValueSource;
import com.haulmont.cuba.gui.screen.*;
import com.company.polyclinic.entity.Doctor;

@UiController("polyclinic_Doctor.edit")
@UiDescriptor("doctor-edit.xml")
@EditedEntityContainer("doctorDc")
@LoadDataBeforeShow
public class DoctorEdit extends StandardEditor<Doctor> {
}