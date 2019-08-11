package com.aldado.factory.demography;

import com.aldado.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;


public class GenderFactoryTest {

    @Test
    public void buildGender() {
        Gender gender = GenderFactory.getGender("Male");
        Assert.assertEquals("Male", gender.getDescr());
        Assert.assertNotNull(gender.getId());
        System.out.println(gender);
        Assert.assertNotNull(gender);
    }
}
