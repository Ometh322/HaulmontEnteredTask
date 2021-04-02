package com.company.polyclinic.service;

import com.company.polyclinic.entity.Doctor;
import com.haulmont.cuba.core.global.DataManager;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(StatisticService.NAME)
public class StatisticServiceBean implements StatisticService {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(StatisticServiceBean.class);
    @Inject
    private DataManager dataManager;

    @Override
    public Doctor doctorStatistics(Doctor doctor) {
        Integer numOfRecipes = dataManager.loadValue("select count(s) from polyclinic_Recipe s " +
                "where s.doctor = :doctor", Integer.class)
                .parameter("doctor", doctor)
                .one();
        doctor.setNumOfRecipes(numOfRecipes);
        //log.info(doctor.getNumOfRecipes().toString());
        return dataManager.commit(doctor);
    }
}