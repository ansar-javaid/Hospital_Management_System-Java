package com.Hospital.Core_Classes;

public class Doctors extends  PersonalDetails {
    private String Specialization, Salary, Service;

    //Constructor for Doctor class--------------------------------------------------------------------------------------
    public Doctors(String id, String name, String cnic, String address, String specialization, String salary, String service) {
        super(id, name, cnic, address);
        Specialization = specialization;
        Salary = salary;
        Service = service;
    }

    // Getter's for Doctor Class----------------------------------------------------------------------------------------
    public String getSpecialization() { return Specialization; }
    public String getSalary() { return Salary; }
    public String getService() { return Service; }
    // Setter's for Doctor Class----------------------------------------------------------------------------------------
    public void setSpecialization(String specialization) { Specialization = specialization; }
    public void setSalary(String salary) { Salary = salary; }
    public void setService(String service) { Service = service; }
    //==================================================================================================================
}