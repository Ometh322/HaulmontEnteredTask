package com.company.polyclinic.web.screens.patient;

import com.haulmont.cuba.gui.screen.*;
import com.company.polyclinic.entity.Patient;

@UiController("polyclinic_Patient.browse")
@UiDescriptor("patient-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class PatientBrowse extends MasterDetailScreen<Patient> {
}