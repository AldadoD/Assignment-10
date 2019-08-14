package com.aldado.controller.user;

import com.aldado.domain.demography.Gender;
import com.aldado.domain.demography.Race;
import com.aldado.domain.user.Employee;
import com.aldado.domain.user.EmployeeGender;
import com.aldado.factory.demography.GenderFactory;
import com.aldado.factory.demography.RaceFactory;
import com.aldado.factory.user.EmployeeFactory;
import com.aldado.factory.user.EmployeeGenderFactory;
import com.aldado.service.demography.GenderService;
import com.aldado.service.demography.Impl.GenderServiceImpl;
import com.aldado.service.demography.Impl.RaceServiceImpl;
import com.aldado.service.demography.RaceService;
import com.aldado.service.user.EmployeeGenderService;
import com.aldado.service.user.EmployeeService;
import com.aldado.service.user.Impl.EmployeeGenderServiceImpl;
import com.aldado.service.user.Impl.EmployeeServiceImpl;

public class EmployeeController {
    private EmployeeService employeeService = EmployeeServiceImpl.getService();
    private EmployeeGenderService employeeGenderService = EmployeeGenderServiceImpl.getService();
    private RaceService raceService = RaceServiceImpl.getService();
    private GenderService genderService = GenderServiceImpl.getService();

    public void create(String firstName, String lastName, String id, String genderId) {

        Employee employee = EmployeeFactory.getEmployee(firstName, lastName);
        employeeService.create("Aldado", employee);

        EmployeeGender employeeGender = EmployeeGenderFactory.getEmployeeGender("1");
        employeeGenderService.create("male", employeeGender);

        Race race = RaceFactory.getRace("Colored");
        raceService.create("Colored", race);

        Gender gender = GenderFactory.getGender("Male");
        genderService.create("1111", gender);

        System.out.println(employee);
    }


}
