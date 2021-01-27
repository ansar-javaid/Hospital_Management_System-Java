package com.Hospital.Credentials;

public class UserCredentials {
    private String Email,Password,Phone;
    //Constructor for UserCredentials class-----------------------------------------------------------------------------
    public UserCredentials(String email, String password, String phone) {
        Email = email;
        Password = password;
        Phone = phone;
    }
    //Getter's----------------------------------------------------------------------------------------------------------
    public String getEmail() { return Email; }
    public String getPassword() { return Password; }
    public String getPhone() { return Phone; }
    //Setter's----------------------------------------------------------------------------------------------------------
    public void setPassword(String password) { Password = password; }
    //==================================================================================================================
}
