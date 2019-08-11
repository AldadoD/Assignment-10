package com.aldado.repository.user.Impl;

import com.aldado.domain.user.EmployeeGender;
import com.aldado.factory.user.EmployeeGenderFactory;
import com.aldado.repository.user.EmployeeGenderRepository;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.Collection;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeGenderRepositoryImplTest {

    private EmployeeGenderRepository employeeGenderRepository;
    private EmployeeGender employeeGender;

    private EmployeeGender getSavedEmployeeGender(){
        Collection<EmployeeGender> savedEmployeeGenders = this.employeeGenderRepository.getAll();
        return savedEmployeeGenders.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.employeeGenderRepository = EmployeeGenderRepositoryImpl.getRepository();
        this.employeeGender = EmployeeGenderFactory.getEmployeeGender("3698");

        employeeGenderRepository.create(this.employeeGender.getEmployeeNumber(), this.employeeGender);
    }

    @Test
    public void create() throws Exception {
        EmployeeGender employeeGender = new EmployeeGender.Builder()
                .employeeNumber("3698")
                .genderId("1111")
                .build();
        EmployeeGender created = this.employeeGenderRepository.create(employeeGender.getEmployeeNumber(), employeeGender);
        System.out.println("\n" + "In create, created = " + created);
        d_getAll();
        Assert.assertEquals(created, employeeGender);
    }

    @Test
    public void d_getAll() {
        Collection<EmployeeGender> all = this.employeeGenderRepository.getAll();
        System.out.println("\nIn getAll, all = " + all);
    }

    @Test
    public void update() {
        String newGender = "New employeeGender name created";
        EmployeeGender employeeGender = new EmployeeGender.Builder().copy(getSavedEmployeeGender()).employeeNumber("3698").build();
        System.out.println("\nIn update, about to be updated = " + employeeGender);
        EmployeeGender updated = this.employeeGenderRepository.update(employeeGender.getEmployeeNumber(), employeeGender);
        System.out.println("\nIn update, updated = " + updated);
        Assert.assertNotSame(newGender, updated.getEmployeeNumber());
        d_getAll();

    }

    @Test
    public void delete() {
        EmployeeGender savedEmployeeGender = getSavedEmployeeGender();
        System.out.println("\n" + "In Delete, about to be deleted = " + employeeGender);
        this.employeeGenderRepository.delete(savedEmployeeGender.getEmployeeNumber());
        System.out.println("\n" + "In Delete, Employee Gender deleted: ");
        d_getAll();
//        Assert.assertNotSame(employeeGender, savedEmployeeGender);
    }

    @Test
    public void read() {
        EmployeeGender savedEmployeeGender = getSavedEmployeeGender();
        System.out.println("\nIn Read, employeeGender number = " + savedEmployeeGender.getEmployeeNumber());
        EmployeeGender read = this.employeeGenderRepository.read(savedEmployeeGender.getEmployeeNumber());
        System.out.println("\nIn Read, read = " + read);
        d_getAll();
//        Assert.assertNotEquals(savedEmployeeGender, read);
    }
}