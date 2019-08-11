package com.aldado.controller.user;

import com.aldado.domain.demography.Race;
import com.aldado.domain.user.EmployeeGender;
import com.aldado.factory.demography.RaceFactory;
import com.aldado.factory.user.EmployeeGenderFactory;
import com.aldado.service.demography.Impl.RaceServiceImpl;
import com.aldado.service.demography.RaceService;
import com.aldado.service.user.EmployeeGenderService;
import com.aldado.service.user.Impl.EmployeeGenderServiceImpl;

public class EmployeeGenderController {


    private EmployeeGenderService employeeGenderService = EmployeeGenderServiceImpl.getService();
    private RaceService raceService = RaceServiceImpl.getService();

    public void create(String genderId, String raceId) {

        EmployeeGender employeeGender = EmployeeGenderFactory.getEmployeeGender("3698");
        employeeGenderService.create("male", employeeGender);

        Race race = RaceFactory.getRace("Colored");
        raceService.create("Colored", race);

        System.out.println(employeeGender);
    }

}
