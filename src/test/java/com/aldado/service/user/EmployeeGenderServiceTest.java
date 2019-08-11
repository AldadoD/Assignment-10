package com.aldado.service.user;

import com.aldado.domain.user.EmployeeGender;
import com.aldado.factory.user.EmployeeGenderFactory;
import com.aldado.repository.user.EmployeeGenderRepository;
import com.aldado.repository.user.Impl.EmployeeGenderRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class EmployeeGenderServiceTest {

    private EmployeeGenderRepository repository;
    private EmployeeGender employeeGender;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeGenderRepositoryImpl.getRepository();
        this.employeeGender = EmployeeGenderFactory.getEmployeeGender("3698");
    }


    @Test
    public void d_getAll() {
        Collection<EmployeeGender> employeeGender = this.repository.getAll();
        System.out.println("In getAll, all = " + employeeGender);
    }
}