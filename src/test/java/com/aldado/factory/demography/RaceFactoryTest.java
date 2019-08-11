package com.aldado.factory.demography;

import com.aldado.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;


public class RaceFactoryTest {

    @Test
    public void buildGender() {
        Race race = RaceFactory.getRace("Colored");
        Assert.assertEquals("Colored", race.getDescr());
        Assert.assertNotNull(race.getId());
        System.out.println(race);
        Assert.assertNotNull(race);

    }
}