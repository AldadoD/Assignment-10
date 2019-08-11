package com.aldado.repository.demography;

import com.aldado.domain.demography.Race;
import com.aldado.repository.ARepository;

import java.util.Collection;

public interface RaceRepository extends ARepository<String, Race> {

    Collection<Race> getAll();
}
