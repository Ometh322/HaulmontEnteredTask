package com.company.polyclinic.service;

import com.company.polyclinic.entity.Doctor;
import com.company.polyclinic.entity.Recipe;

public interface StatisticService {
    String NAME = "polyclinic_StatisticService";

    Doctor doctorStatistics(Doctor doctor);
}