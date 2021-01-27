package com.Hospital.SearchingAndModiciation_Classes;

import com.Hospital.Core_Classes.DoctorAssociationWithPatient;
import com.Hospital.Core_Classes.Doctors;
import com.Hospital.Core_Classes.Patient;
import com.Hospital.LoadData.LoadDataFromDisk;

import java.util.ArrayList;
import java.util.List;

public class SearchEntities {
      public LoadDataFromDisk loadData = new LoadDataFromDisk();
      private List<Patient> patientList;
    //==================================================================================================================
    /**
     * @param patientName accepts a Patient name from user and then search that name in related data field
     * @return Patient type: Patient related all record
     */
    public Patient searchPatientByName(String patientName) {
        Patient holdPatient;
        for (int count = 0; count < loadData.patientList.size(); count++) {
            if (patientName.equalsIgnoreCase(loadData.patientList.get(count).getName())) {
                holdPatient = loadData.patientList.get(count);
                return holdPatient;
            }
        }
        return null;
    }

    /**
     * @param patientNameOrPhoneOrId accepts a Patient ID# or Phone:# or Name from user and then search that entite in related data field
     * @return Patient type: Patient related all record
     */
    //==================================================================================================================
    public Patient searchPatientByIdAndPhone(String patientNameOrPhoneOrId) {
        Patient holdPatient;
        if (patientNameOrPhoneOrId.length() == 5) {
            for (int count = 0; count < loadData.patientList.size(); count++) {
                if (patientNameOrPhoneOrId.hashCode() == loadData.patientList.get(count).getId().hashCode()) {
                    holdPatient = loadData.patientList.get(count);
                    return holdPatient;
                }
                else {
                    for (int count1 = 0; count1 < loadData.patientList.size(); count1++) {
                        if (patientNameOrPhoneOrId.equalsIgnoreCase(loadData.patientList.get(count1).getName())) {
                            holdPatient = loadData.patientList.get(count1);
                            return holdPatient;
                        }
                    }
                }
            }
        }
        else if (patientNameOrPhoneOrId.length() == 12)
        {
            for (int count = 0; count < loadData.patientList.size(); count++) {
                if (patientNameOrPhoneOrId.hashCode() == loadData.patientList.get(count).getPhone().hashCode()) {
                    holdPatient = loadData.patientList.get(count);
                    return holdPatient;
                }
                else {
                    for (int count1 = 0; count1 < loadData.patientList.size(); count1++) {
                        if (patientNameOrPhoneOrId.equalsIgnoreCase(loadData.patientList.get(count1).getName())) {
                            holdPatient = loadData.patientList.get(count1);
                            return holdPatient;
                        }
                    }
                }
            }
        }
        else {
            for (int count = 0; count < loadData.patientList.size(); count++) {
                if (patientNameOrPhoneOrId.equalsIgnoreCase(loadData.patientList.get(count).getName())) {
                    holdPatient = loadData.patientList.get(count);
                    return holdPatient;
                }
            }
        }
        return null;
    }
    //==================================================================================================================
    public Doctors searchDoctorByNameAndId(String doctorNameOrID) {
        Doctors doctorHold;
        if (doctorNameOrID.length() == 4) {
            for (int count = 0; count < loadData.doctorsList.size(); count++) {
                if (doctorNameOrID.equals(loadData.doctorsList.get(count).getId())) {
                    doctorHold = loadData.doctorsList.get(count);
                    return doctorHold;
                }
            }
        }
        else {
            for (int count = 0; count < loadData.doctorsList.size(); count++) {
                if (doctorNameOrID.equalsIgnoreCase(loadData.doctorsList.get(count).getName())) {
                    doctorHold = loadData.doctorsList.get(count);
                    return doctorHold;
                }
            }
        }
        return null;
    }
    //==================================================================================================================

    /**
     * @param userEmail
     * @param userPassword
     * Accepts userEmail and userPassword and search that in userCredentialsList (List)
     * @return if userEmail and userPassword match in correct entity this will return true otherwise false
     */
    public boolean searchLogin(String userEmail, String userPassword) {
        for (int count = 0; count < loadData.userCredentialsList.size(); count++) {
            if (userEmail.hashCode() == loadData.userCredentialsList.get(count).getEmail().hashCode()
                    && userPassword.hashCode() == loadData.userCredentialsList.get(count).getPassword().hashCode()) {
                return true;
            }
        }
        return false;
    }
   //===================================================================================================================

    /**
     * @param doctorId Accepts Doctor ID in (String) and search that in DoctorPatientAssociation (List)
     * @return id correct match is found this will return the whole Patient object of that ArrayList's Index.
     */
   public List<Patient> searchPatientByDocid(String doctorId)
   {
       patientList=new ArrayList<>();
       DoctorAssociationWithPatient holdDoctorAssociation;
       Doctors holdDoctor;
       if(doctorId.length()==4)
       {
           for(int count=0;count<loadData.association.size();count++)
           {
               if(doctorId.equals(loadData.association.get(count).getDoctorID()))
               {
                   holdDoctorAssociation=loadData.association.get(count);
                   for(int count1=0 ; count1<loadData.patientList.size();count1++)
                   {
                       if(holdDoctorAssociation.getPatientID().equals(loadData.patientList.get(count1).getId()))
                       {
                           patientList.add(loadData.patientList.get(count1));
                       }
                   }
               }
           }
       }
       else
       {
           holdDoctor=searchDoctorByNameAndId(doctorId);
           if(holdDoctor==null){return null;}
           doctorId=holdDoctor.getId();
           for(int count=0;count<loadData.association.size();count++)
           {
               if(doctorId.equals(loadData.association.get(count).getDoctorID()))
               {
                   holdDoctorAssociation=loadData.association.get(count);
                   for(int count1=0 ; count1<loadData.patientList.size();count1++)
                   {
                       if(holdDoctorAssociation.getPatientID().equals(loadData.patientList.get(count1).getId()))
                       {
                           patientList.add(loadData.patientList.get(count1));
                       }
                   }
               }
           }
       }
       return patientList;
   }
   //===================================================================================================================

    /**
     * @return whole Doctors (List)
     */
   public List<Doctors> getDoctorList() { return loadData.doctorsList; }
   //===================================================================================================================

    /**
     * @return whole Patient (List)
     */
   public List<Patient> getPatientList() { return loadData.patientList; }
   //===================================================================================================================



}