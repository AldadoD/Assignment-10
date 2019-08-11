package com.aldado.repository.demography;

import com.aldado.domain.demography.Gender;
import com.aldado.repository.ARepository;

import java.util.Collection;

public interface GenderRepository extends ARepository<String, Gender> {

    Collection<Gender> getAll();
}
