package com.aldado.repository.user;

import com.aldado.domain.user.Employee;
import com.aldado.repository.ARepository;

import java.util.Collection;

public interface EmployeeRepository extends ARepository<String, Employee> {

    Collection<Employee> getAll();
}
