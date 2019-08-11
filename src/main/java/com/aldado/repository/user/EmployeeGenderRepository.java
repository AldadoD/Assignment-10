package com.aldado.repository.user;

import com.aldado.domain.user.EmployeeGender;
import com.aldado.repository.ARepository;

import java.util.Collection;

public interface EmployeeGenderRepository extends ARepository<String, EmployeeGender> {

    Collection<EmployeeGender> getAll();
}
