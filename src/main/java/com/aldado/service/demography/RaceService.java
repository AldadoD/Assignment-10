package com.aldado.service.demography;

import com.aldado.domain.demography.Race;
import com.aldado.service.AService;

import java.util.Collection;

public interface RaceService extends AService<String, Race> {
    Collection<Race> getAll();
}
