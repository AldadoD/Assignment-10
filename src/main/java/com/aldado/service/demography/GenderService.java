package com.aldado.service.demography;

import com.aldado.domain.demography.Gender;
import com.aldado.service.AService;

import java.util.Collection;

public interface GenderService extends AService<String, Gender> {
    Collection<Gender> getAll();
}
