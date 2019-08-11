package com.aldado.factory.user;

import com.aldado.domain.user.EmployeeGender;
import com.aldado.util.Misc;

public class EmployeeGenderFactory {

    public static EmployeeGender getEmployeeGender(String number){
        return new EmployeeGender.Builder()
                .genderId("1")
//              .genderId(Misc.generateId())
                .employeeNumber(number)
                .build();
    }
}

