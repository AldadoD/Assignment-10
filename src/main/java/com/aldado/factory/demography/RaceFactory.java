package com.aldado.factory.demography;

import com.aldado.domain.demography.Race;
import com.aldado.util.Misc;

public class RaceFactory {

    public static Race getRace(String race){
        return new Race.Builder()
                .id("1111")
//              .id(Misc.generateId())
                .descr(race)
                .build();
    }
}
