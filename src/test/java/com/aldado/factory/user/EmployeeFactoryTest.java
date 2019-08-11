package com.aldado.factory.user;

import com.aldado.domain.user.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    private String EmployeeTest;

    @Before
    public void setUp() throws Exception {
        this.EmployeeTest = "EmployeeTest";
    }

    @Test
    public void buildEmployee() {
        Employee employee = EmployeeFactory.getEmployee("Aldado", "Dampies");
        System.out.println(employee);
        Assert.assertNotNull(employee.getEmployeeNumber());
    }
}