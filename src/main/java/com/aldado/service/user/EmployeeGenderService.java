package com.aldado.service.user;

import com.aldado.domain.user.EmployeeGender;
import com.aldado.service.AService;

import java.util.Collection;

public interface EmployeeGenderService extends AService<String, EmployeeGender> {
        Collection<EmployeeGender> getAll();
}
