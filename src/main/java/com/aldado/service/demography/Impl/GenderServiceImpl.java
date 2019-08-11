package com.aldado.service.demography.Impl;

import com.aldado.domain.demography.Gender;
import com.aldado.repository.demography.GenderRepository;
import com.aldado.repository.demography.Impl.GenderRepositoryImpl;
import com.aldado.service.demography.GenderService;

import java.util.Collection;

public class GenderServiceImpl implements GenderService {


    private static GenderServiceImpl service = null;
    private GenderRepository repository;

    private GenderServiceImpl(){
        this.repository = GenderRepositoryImpl.getRepository();
    }
    public static GenderServiceImpl getService(){
        if (service == null) service = new GenderServiceImpl();
        return service;
    }

    @Override
    public Gender create(String s, Gender gender) {
        return this.repository.create(s, gender);
    }

    @Override
    public Gender update(String s, Gender gender) {
        return this.repository.update(s, gender);
    }

    @Override
    public Gender delete(String id) {
        return this.repository.delete(id);
    }

    @Override
    public Gender read(String id) {
        return this.repository.read(id);
    }

    @Override
    public Collection<Gender> getAll() {
        return this.repository.getAll();
    }
}
