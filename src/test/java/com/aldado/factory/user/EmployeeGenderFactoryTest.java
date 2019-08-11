package com.aldado.factory.user;

import com.aldado.domain.user.EmployeeGender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderFactoryTest {

    private String EmployeeGenderTest;

    @Before
    public void setUp() throws Exception {
        this.EmployeeGenderTest = "EmployeeGenderTest";
    }

    @Test
    public void buildEmployee() {
        EmployeeGender employeeGender = EmployeeGenderFactory.getEmployeeGender("3698");
        System.out.println(employeeGender);
        Assert.assertNotNull(employeeGender.getEmployeeNumber());
    }
}