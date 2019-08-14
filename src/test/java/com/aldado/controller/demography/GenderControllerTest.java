package com.aldado.controller.demography;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenderControllerTest {

    private GenderController genderController;

    @Before
    public void setUp() throws Exception{
        genderController = new GenderController();
    }

    @Test
    public void create() {

        genderController.create("");
        Assert.assertNotNull(genderController);
    }
}