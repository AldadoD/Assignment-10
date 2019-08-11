package com.aldado.controller.user;

import org.junit.Before;
import org.junit.Test;

public class EmployeeGenderControllerTest {

    private EmployeeGenderController employeeGenderController;

    @Before
    public void setUp() throws Exception{
        employeeGenderController = new EmployeeGenderController();
    }

    @Test
    public void create() {

        employeeGenderController.create("1", "1111");
    }
}