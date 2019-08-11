package com.aldado.factory.demography;

import com.aldado.domain.demography.Gender;
import com.aldado.util.Misc;

public class GenderFactory {

    public static Gender getGender(String gender){
        return new Gender.Builder()
                .id("1")
//              .id(Misc.generateId())
                .descr(gender)
                .build();
    }
}
