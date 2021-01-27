package com.Hospital.Core_Classes;

public class DoctorAssociationWithPatient {
    private String PatientID,DoctorID;
    //Constructor for DoctorAssociationWithPatient----------------------------------------------------------------------
    public DoctorAssociationWithPatient(String patientID, String doctorID) {
        PatientID = patientID;
        DoctorID = doctorID;
    }
    //Getter's for DoctorAssociationWithPatient-------------------------------------------------------------------------
    public String getPatientID() { return PatientID; }
    public String getDoctorID() { return DoctorID; }
    //==================================================================================================================
}

