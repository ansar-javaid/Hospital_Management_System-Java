package com.Hospital.Core_Classes;

public class Patient extends PersonalDetails{
    private String Covid,Admitted,Service,Time;
    //Constructor for Patient class-------------------------------------------------------------------------------------
    public Patient(String id, String name, String cnic, String phone, String address, String covid, String admitted, String service, String gender, String age,String time) {
        super(id, name, cnic, phone, address, gender, age);
        this.Covid = covid;
        this.Admitted = admitted;
        this.Service = service;
        this.Time = time;
    }
    // Getter's for Patient Class---------------------------------------------------------------------------------------
    public String getCovid() { return Covid; }
    public String getAdmitted() { return Admitted; }
    public String getService() { return Service; }
    public String getTime() { return Time; }
    //Setter's for Patient Class----------------------------------------------------------------------------------------
    public void setCovid(String covid) { Covid = covid; }
    public void setAdmitted(String admitted) { Admitted = admitted; }
    public void setService(String service) { Service = service; }
    //==================================================================================================================
}
