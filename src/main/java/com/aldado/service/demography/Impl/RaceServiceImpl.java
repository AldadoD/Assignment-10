package com.aldado.service.demography.Impl;

import com.aldado.domain.demography.Race;
import com.aldado.repository.demography.Impl.RaceRepositoryImpl;
import com.aldado.repository.demography.RaceRepository;
import com.aldado.service.demography.RaceService;

import java.util.Collection;

public class RaceServiceImpl implements RaceService {


    private static RaceServiceImpl service = null;
    private RaceRepository repository;

    private RaceServiceImpl(){
        this.repository = RaceRepositoryImpl.getRepository();
    }
    public static RaceServiceImpl getService(){
        if (service == null) service = new RaceServiceImpl();
        return service;
    }

    @Override
    public Race create(String s, Race race) {
        return this.repository.create(s, race);
    }

    @Override
    public Race update(String s, Race race) {
        return this.repository.update(s, race);
    }

    @Override
    public Race delete(String id) {
        return this.repository.delete(id);
    }

    @Override
    public Race read(String id) {
        return this.repository.read(id);
    }

    @Override
    public Collection<Race> getAll() {
        return this.repository.getAll();
    }
}
