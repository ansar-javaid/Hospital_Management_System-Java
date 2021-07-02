package com.Hospital.LoadData;

import com.Hospital.Core_Classes.DoctorAssociationWithPatient;
import com.Hospital.Core_Classes.Doctors;
import com.Hospital.Core_Classes.Patient;
import com.Hospital.Credentials.UserCredentials;
import com.Hospital.LinkedList_DSA.LinkedList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;


public class LoadData {
    public java.util.LinkedList<Patient> patientLinkedListUtil=new java.util.LinkedList<>(); // For Building Tree
    public java.util.LinkedList<Doctors> doctorsLinkedListUtil=new java.util.LinkedList<>(); // For Building Tree

    // Main backbone Data Structures //
    public LinkedList<Patient> patientLinkedList=new LinkedList<>();
    public LinkedList<Doctors> doctorsLinkedList=new LinkedList<>();
    public LinkedList<UserCredentials> userCredentialsLinkedList=new LinkedList<>();
    public LinkedList<DoctorAssociationWithPatient> doctorAssociationWithPatientLinkedList=new LinkedList<>();
    //==================================================================================================================
    public LoadData()
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
                patientLinkedListUtil.add(new Patient(separationCsvByColumn[0], separationCsvByColumn[1], separationCsvByColumn[2], separationCsvByColumn[3], separationCsvByColumn[4],
                        separationCsvByColumn[5], separationCsvByColumn[6], separationCsvByColumn[7], separationCsvByColumn[8], separationCsvByColumn[9],separationCsvByColumn[10]));
                patientLinkedList.add(new Patient(separationCsvByColumn[0], separationCsvByColumn[1], separationCsvByColumn[2], separationCsvByColumn[3], separationCsvByColumn[4],
                        separationCsvByColumn[5], separationCsvByColumn[6], separationCsvByColumn[7], separationCsvByColumn[8], separationCsvByColumn[9],separationCsvByColumn[10]));
            }
            readPatients.close();
        Collections.shuffle(patientLinkedListUtil);// Randomizing default Java.Util.LinkedList fro Binary Search Tree
    }
    //==================================================================================================================
    private void loadCredentials() throws IOException {
        FileReader readCredentials=new FileReader("user\\UserLogins.csv");
        BufferedReader bufferCredentials=new BufferedReader(readCredentials);
        String line="";
        while ((line=bufferCredentials.readLine())!=null)
        {
            String[] separationCsvByColumn=line.split(",");
            userCredentialsLinkedList.add(new UserCredentials(separationCsvByColumn[0],separationCsvByColumn[1],separationCsvByColumn[2]));
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
                doctorsLinkedListUtil.add(new Doctors(separationCsvByColumn[0],separationCsvByColumn[1],separationCsvByColumn[2],
                        separationCsvByColumn[3],separationCsvByColumn[4],separationCsvByColumn[5],separationCsvByColumn[6]));
                doctorsLinkedList.add(new Doctors(separationCsvByColumn[0],separationCsvByColumn[1],separationCsvByColumn[2],
                separationCsvByColumn[3],separationCsvByColumn[4],separationCsvByColumn[5],separationCsvByColumn[6]));
            }
            readDoctors.close();
            Collections.shuffle(doctorsLinkedListUtil);// Randomizing default Java.Util.LinkedList fro Binary Search Tree
    }
    //==================================================================================================================
    private void loadDoctorPatientAssociation() throws IOException {
        FileReader readAssociation=new FileReader("Hospital Records\\Doctor association with patients.csv");
        BufferedReader bufferAssociation=new BufferedReader(readAssociation);
        String line="";
        while ((line= bufferAssociation.readLine())!=null)
        {
            String[] separationCsvByColumn=line.split(",");
            doctorAssociationWithPatientLinkedList.add(new DoctorAssociationWithPatient(separationCsvByColumn[0],separationCsvByColumn[1]));
        }
        readAssociation.close();
    }
    //==================================================================================================================
}
