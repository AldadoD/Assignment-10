package com.aldado.controller.demography;

import com.aldado.domain.demography.Gender;
import com.aldado.factory.demography.GenderFactory;
import com.aldado.service.demography.GenderService;
import com.aldado.service.demography.Impl.GenderServiceImpl;

import java.util.Collection;

public class GenderController {

        private GenderService genderService = GenderServiceImpl.getService();

    public void create(String genderId) {

        Gender gender = GenderFactory.getGender("Male");
        genderService.create("1", gender);

        System.out.println(gender);
    }
}
