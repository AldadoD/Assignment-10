package com.aldado.controller.demography;

import com.aldado.domain.demography.Race;
import com.aldado.factory.demography.RaceFactory;
import com.aldado.service.demography.Impl.RaceServiceImpl;
import com.aldado.service.demography.RaceService;

import java.util.Collection;

public class RaceController {

    private RaceService raceService = RaceServiceImpl.getService();

    public void create(String raceId) {

        Race race = RaceFactory.getRace("Colored");
        raceService.create("1111", race);

        System.out.println(race);
    }
}
