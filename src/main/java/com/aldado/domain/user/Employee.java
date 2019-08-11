package com.aldado.domain.user;

import com.aldado.domain.demography.Gender;

public class Employee {

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    private String employeeNumber, employeeFirstName, employeeLastName;

    private Employee(){

    }
    public Employee(Builder builder){
        this.employeeNumber = builder.employeeNumber;
        this.employeeFirstName = builder.employeeFirstName;
        this.employeeLastName = builder.employeeLastName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    @Override
    public String toString() {
        return  "Employee: " + "\n\n" +
                "Employee Number - " + employeeNumber + "\n"+
                "Employee FirstName - " + employeeFirstName + "\n" +
                "Employee LastName - " + employeeLastName
                + "\n";
    }
    public static class Builder{
        private String employeeNumber, employeeFirstName, employeeLastName;

        public Builder employeeNumber(String employeeNumber){
            this.employeeNumber = employeeNumber;

            return this;
        }
        public Builder employeeFirstName(String employeeFirstName){
            this.employeeFirstName = employeeFirstName;

            return this;
        }
        public Builder employeeLastName(String employeeLastName){
            this.employeeLastName = employeeLastName;

            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
        public Builder copy(Employee employee){
            this.employeeNumber = employeeNumber;
            this.employeeFirstName = employeeFirstName;
            this.employeeLastName = employeeLastName;

            return this;
        }
    }
}
