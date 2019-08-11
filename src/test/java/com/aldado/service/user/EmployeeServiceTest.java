package com.aldado.service.user;

import com.aldado.domain.user.Employee;
import com.aldado.factory.user.EmployeeFactory;
import com.aldado.repository.user.EmployeeRepository;
import com.aldado.repository.user.Impl.EmployeeRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeServiceTest {

    private EmployeeRepository repository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.getEmployee("Aldado", "Dampies");
    }


    @Test
    public void d_getAll() {
        Collection<Employee> employees = this.repository.getAll();
        System.out.println("In getAll, all = " + employees);
    }
}