package com.aldado.service.user.Impl;

import com.aldado.domain.user.EmployeeGender;
import com.aldado.repository.user.EmployeeGenderRepository;
import com.aldado.repository.user.Impl.EmployeeGenderRepositoryImpl;
import com.aldado.service.user.EmployeeGenderService;

import java.util.Collection;

public class EmployeeGenderServiceImpl implements EmployeeGenderService {


    private static EmployeeGenderServiceImpl service = null;
    private EmployeeGenderRepository repository;

    private EmployeeGenderServiceImpl(){
        this.repository = EmployeeGenderRepositoryImpl.getRepository();
    }
    public static EmployeeGenderServiceImpl getService(){
        if (service == null) service = new EmployeeGenderServiceImpl();
        return service;
    }

    @Override
    public EmployeeGender create(String s, EmployeeGender employeeGender) {
        return this.repository.create(s, employeeGender);
    }

    @Override
    public EmployeeGender update(String s, EmployeeGender employeeGender) {
        return this.repository.update(s, employeeGender);
    }

    @Override
    public EmployeeGender delete(String id) {
        return this.repository.delete(id);
    }

    @Override
    public EmployeeGender read(String id) {
        return this.repository.read(id);
    }

    @Override
    public Collection<EmployeeGender> getAll() {
        return this.repository.getAll();
    }
}
