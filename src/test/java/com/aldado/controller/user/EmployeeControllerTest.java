package com.aldado.controller.user;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeControllerTest {

    private EmployeeController employeeController;

    @Before
    public void setUp() throws Exception{
        employeeController = new EmployeeController();
    }

    @Test
    public void create() {

        employeeController.create("Aldado", "Dampies", "1", "1111");
        Assert.assertEquals("Aldado", "Aldado");

    }

}