package com.aldado.factory.user;

import com.aldado.domain.user.Employee;
import com.aldado.util.Misc;

public class EmployeeFactory {

    public static Employee getEmployee(String firstName, String lastName){
        return new Employee.Builder()
                .employeeNumber("3698")
//              .employeeNumber(Misc.generateId())
                .employeeFirstName(firstName)
                .employeeLastName(lastName)
                .build();
    }
}
