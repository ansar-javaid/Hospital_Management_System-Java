package com.Hospital.Core_Classes;

abstract public class PersonalDetails {
    private String Id,Name,Cnic,Address,Phone,Gender,Age;
    //Super Constructor for Doctor class--------------------------------------------------------------------------------
    public PersonalDetails(String id, String name, String cnic, String address) {
        this.Id = id;
        this.Name = name;
        this.Cnic = cnic;
        this.Address = address;
    }

    //Super Constructor for Patient class-------------------------------------------------------------------------------
    public PersonalDetails(String id, String name, String cnic, String phone, String address,String gender,String age) {
        this.Id = id;
        this.Name = name;
        this.Cnic = cnic;
        this.Address = address;
        this.Phone = phone;
        this.Gender = gender;
        this.Age = age;
    }
    //Getter's----------------------------------------------------------------------------------------------------------
    public String getId() { return Id; }
    public String getName() { return Name; }
    public String getCnic() { return Cnic; }
    public String getAddress() { return Address; }
    public String getPhone() { return Phone; }
    public String getGender() { return Gender; }
    public String getAge() { return Age; }
    //Setter's----------------------------------------------------------------------------------------------------------
    public void setAddress(String address) { Address = address; }
    public void setPhone(String phone) { Phone = phone; }
    public void setAge(String age) { Age = age; }
    public void setName(String name) { Name = name; }
    public void setCnic(String cnic) { Cnic = cnic; }
    //================================================================================================================\\
}
