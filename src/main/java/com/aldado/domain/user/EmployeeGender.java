package com.aldado.domain.user;

import com.aldado.domain.demography.Gender;

public class EmployeeGender {
    private String employeeNumber, genderId;

    private EmployeeGender(){

    }

    public EmployeeGender(Builder builder) {
        this.employeeNumber = builder.employeeNumber;
        this.genderId = builder.genderId;

    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getGenderId() {
        return genderId;
    }

    @Override
    public String toString() {
        return "Employee Gender: "  +"\n\n" +
                "Employee Number - " + employeeNumber + "\n" +
                "Gender Id - " + genderId + "\n";
    }
    public static class Builder{
        private String employeeNumber, genderId;

        public Builder employeeNumber(String employeeNumber){
            this.employeeNumber = employeeNumber;

            return this;
        }
        public Builder genderId(String genderId){
            this.genderId = genderId;

            return this;
        }

        public EmployeeGender build(){
            return new EmployeeGender(this);
        }
        public Builder copy(EmployeeGender employeeGender){
            this.employeeNumber = employeeNumber;
            this.genderId = genderId;


            return this;
        }
    }

}
