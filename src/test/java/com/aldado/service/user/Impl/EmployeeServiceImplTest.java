package com.aldado.service.user.Impl;

import com.aldado.domain.user.Employee;
import com.aldado.factory.user.EmployeeFactory;
import com.aldado.repository.user.Impl.EmployeeRepositoryImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class EmployeeServiceImplTest {

    private EmployeeServiceImpl service = null;
    private EmployeeRepositoryImpl repository;
    private Employee employeeGender;

    private Employee getEmployee(){
        return  this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getRepository();
        this.employeeGender = EmployeeFactory.getEmployee("Aldado", "Dampies");

        repository.create(this.employeeGender.getEmployeeNumber(), this.employeeGender);
    }

    @Test
    public void create() {
        Employee employeeGender = new Employee.Builder()
                .employeeNumber("3698")
                .employeeFirstName("Aldado")
                .employeeLastName("Dampies")
                .build();

        Employee created = this.repository.create(employeeGender.getEmployeeNumber(), employeeGender);
        System.out.println("\n" + "In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, employeeGender);
    }

    @Test
    public void update() {
        String newEmpNumber = "Id updated";
        Employee updated = new Employee.Builder().copy(getEmployee()).employeeNumber(newEmpNumber).build();
        System.out.println("\n" + "In update, updated = " + updated);
        Assert.assertSame(newEmpNumber, updated.getEmployeeNumber());

    }

    @Test
    public void delete() {
        Employee employeeGender = getEmployee();
        System.out.println("\n" + "In Delete, delete = " + employeeGender);
        this.repository.delete(this.employeeGender.getEmployeeNumber());
        getAll();
        Assert.assertNotNull(employeeGender);
    }

    @Test
    public void read() {
        Employee employee = getEmployee();
        Employee read = this.repository.read(employeeGender.getEmployeeNumber());
        System.out.println("\n" + "In Read, read = "+ employee);
        Assert.assertSame(employeeGender, read);
    }

    @Test
    public void getAll() {
        Collection<Employee> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}