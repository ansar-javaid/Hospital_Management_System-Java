package com.Hospital.LoadData;

import com.Hospital.Core_Classes.DoctorAssociationWithPatient;
import com.Hospital.Core_Classes.Doctors;
import com.Hospital.Core_Classes.Patient;
import com.Hospital.Credentials.UserCredentials;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoadDataFromDisk {
    public List<Patient> patientList=new ArrayList<>();
    public List<Doctors> doctorsList=new ArrayList<>();
    public List<UserCredentials> userCredentialsList=new ArrayList<>();
    public List<DoctorAssociationWithPatient> association=new ArrayList<>();
    //==================================================================================================================
    public LoadDataFromDisk()
    {
        try { loadDoctors(); } catch (IOException e) { e.printStackTrace(); }
        try { loadPatients(); } catch (IOException e) { e.printStackTrace(); }
        try { loadCredentials(); } catch (IOException e) { e.printStackTrace(); }
        try { loadDoctorPatientAssociation(); } catch (IOException e) { e.printStackTrace(); }
    }
    //==================================================================================================================
    private void loadPatients() throws IOException {
            FileReader readPatients = new FileReader("Hospital Records\\Patient Record.csv");
            BufferedReader bufferPatients = new BufferedReader(readPatients);
            String line = "";
            while ((line = bufferPatients.readLine()) != null) {
                String[] separationCsvByColumn = line.split(",");
                patientList.add(new Patient(separationCsvByColumn[0], separationCsvByColumn[1], separationCsvByColumn[2], separationCsvByColumn[3], separationCsvByColumn[4],
                        separationCsvByColumn[5], separationCsvByColumn[6], separationCsvByColumn[7], separationCsvByColumn[8], separationCsvByColumn[9],separationCsvByColumn[10]));
            }
            readPatients.close();
    }
    //==================================================================================================================
    private void loadCredentials() throws IOException {
        FileReader readCredentials=new FileReader("user\\UserLogins.csv");
        BufferedReader bufferCredentials=new BufferedReader(readCredentials);
        String line="";
        while ((line=bufferCredentials.readLine())!=null)
        {
            String[] separationCsvByColumn=line.split(",");
            userCredentialsList.add(new UserCredentials(separationCsvByColumn[0],separationCsvByColumn[1],separationCsvByColumn[2]));
        }
        readCredentials.close();
    }
    //==================================================================================================================
    private void loadDoctors() throws IOException
    {
        FileReader readDoctors=new FileReader("Hospital Records\\Doctors Record.csv");
        BufferedReader bufferDoctor=new BufferedReader(readDoctors);
        String line="";
        while ((line= bufferDoctor.readLine())!=null)
        {
            String[] separationCsvByColumn=line.split(",");
            doctorsList.add(new Doctors(separationCsvByColumn[0],separationCsvByColumn[1],separationCsvByColumn[2],
                    separationCsvByColumn[3],separationCsvByColumn[4],separationCsvByColumn[5],separationCsvByColumn[6]));
        }
        readDoctors.close();
    }
    //==================================================================================================================
    private void loadDoctorPatientAssociation() throws IOException {
        FileReader readAssociation=new FileReader("Hospital Records\\Doctor association with patients.csv");
        BufferedReader bufferAssociation=new BufferedReader(readAssociation);
        String line="";
        while ((line= bufferAssociation.readLine())!=null)
        {
            String[] separationCsvByColumn=line.split(",");
            association.add(new DoctorAssociationWithPatient(separationCsvByColumn[0],separationCsvByColumn[1]));
        }
        readAssociation.close();
    }
    //==================================================================================================================
}
