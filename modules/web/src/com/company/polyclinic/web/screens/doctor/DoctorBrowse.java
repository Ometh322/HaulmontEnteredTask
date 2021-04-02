package com.company.polyclinic.web.screens.doctor;

import com.company.polyclinic.service.StatisticService;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.ActionsAwareDialogFacet;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.polyclinic.entity.Doctor;

import javax.inject.Inject;
import javax.mail.Session;
import javax.print.Doc;

@UiController("polyclinic_Doctor.browse")
@UiDescriptor("doctor-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class DoctorBrowse extends MasterDetailScreen<Doctor> {
    @Inject
    private ScreenBuilders screenBuilders;
    @Inject
    private StatisticService statisticService;
    @Inject
    private CollectionContainer<Doctor> doctorsDc;


    @Inject
    private Table<Doctor> table;
    @Subscribe("table.statisticsView")
    public void onTableStatisticsView(Action.ActionPerformedEvent event) {
           Doctor doctor = statisticService.doctorStatistics(getTable().getSingleSelected());
           doctorsDc.replaceItem(doctor);
           DoctorEdit doctorEdit = screenBuilders.editor(table)
                   .withOpenMode(OpenMode.DIALOG)
                   .withScreenClass(DoctorEdit.class)
                   .build();
           doctorEdit.setReadOnly(true);
           doctorEdit.show();

    }

//    @Subscribe("table.showStatistics")
//    public void onTableShowStatistics(Action.ActionPerformedEvent event) {
//        Doctor doctor = statisticService.doctorStatistics(getTable().getSingleSelected());
//        doctorsDc.replaceItem(doctor);
//    }

}