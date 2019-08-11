package com.aldado.service.user;

import com.aldado.domain.user.Employee;
import com.aldado.service.AService;

import java.util.Collection;

public interface EmployeeService extends AService<String, Employee> {
    Collection<Employee> getAll();
}
