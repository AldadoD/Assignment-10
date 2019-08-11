package com.aldado.service.demography;

import com.aldado.domain.demography.Gender;
import com.aldado.domain.demography.Race;
import com.aldado.factory.demography.GenderFactory;
import com.aldado.repository.demography.GenderRepository;
import com.aldado.repository.demography.Impl.GenderRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class GenderServiceTest {

    private GenderRepository repository;
    private Gender gender;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.getGender("Male");
    }


    @Test
    public void d_getAll() {
        Collection<Gender> gender = this.repository.getAll();
        System.out.println("In getAll, all = " + gender);
    }
}