package com.Hospital.SearchingAndModiciation;

import com.Hospital.Core_Classes.DoctorAssociationWithPatient;
import com.Hospital.Core_Classes.Doctors;
import com.Hospital.Core_Classes.Patient;
import com.Hospital.LinkedList_DSA.LinkedList;
import com.Hospital.LoadData.LoadData;
import com.Hospital.Queue_DSA.Queue;
import com.Hospital.Stack_DSA.Stack;

public class SearchEntities {
      public LoadData loadData=new LoadData();

    //==================================================================================================================
    /**
     * @param patientName accepts a Patient name from user and then search that name in related patientData field
     * @return Patient type: Patient related all record
     */
    public Patient searchPatientByName(String patientName) {
        Patient holdPatient;
        for (int count = 0; count < loadData.patientLinkedList.size(); count++) {
            if (patientName.equalsIgnoreCase(loadData.patientLinkedList.get(count).getName())) {
                holdPatient = loadData.patientLinkedList.get(count);
                return holdPatient;
            }
        }
        return null;
    }

    /**
     * @param patientNameOrPhoneOrId accepts a Patient ID# or Phone:# or Name from user and then search that entite in related patientData field
     * @return Patient type: Patient related all record
     */
    //==================================================================================================================
    public Patient searchPatientByIdAndPhone(String patientNameOrPhoneOrId) {
        Patient holdPatient;
        if (patientNameOrPhoneOrId.length() == 5) {
            for (int count = 0; count < loadData.patientLinkedList.size(); count++) {
                if (patientNameOrPhoneOrId.hashCode() == loadData.patientLinkedList.get(count).getId().hashCode()) {
                    holdPatient = loadData.patientLinkedList.get(count);
                    return holdPatient;
                }
                else {
                    for (int count1 = 0; count1 < loadData.patientLinkedList.size(); count1++) {
                        if (patientNameOrPhoneOrId.equalsIgnoreCase(loadData.patientLinkedList.get(count1).getName())) {
                            holdPatient = loadData.patientLinkedList.get(count1);
                            return holdPatient;
                        }
                    }
                }
            }
        }
        else if (patientNameOrPhoneOrId.length() == 12)
        {
            for (int count = 0; count < loadData.patientLinkedList.size(); count++) {
                if (patientNameOrPhoneOrId.hashCode() == loadData.patientLinkedList.get(count).getPhone().hashCode()) {
                    holdPatient = loadData.patientLinkedList.get(count);
                    return holdPatient;
                }
                else {
                    for (int count1 = 0; count1 < loadData.patientLinkedList.size(); count1++) {
                        if (patientNameOrPhoneOrId.equalsIgnoreCase(loadData.patientLinkedList.get(count1).getName())) {
                            holdPatient = loadData.patientLinkedList.get(count1);
                            return holdPatient;
                        }
                    }
                }
            }
        }
        else {
            for (int count = 0; count < loadData.patientLinkedList.size(); count++) {
                if (patientNameOrPhoneOrId.equalsIgnoreCase(loadData.patientLinkedList.get(count).getName())) {
                    holdPatient = loadData.patientLinkedList.get(count);
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
            for (int count = 0; count < loadData.doctorsLinkedList.size(); count++) {
                if (doctorNameOrID.equals(loadData.doctorsLinkedList.get(count).getId())) {
                    doctorHold = loadData.doctorsLinkedList.get(count);
                    return doctorHold;
                }
            }
        }
        else {
            for (int count = 0; count < loadData.doctorsLinkedList.size(); count++) {
                if (doctorNameOrID.equalsIgnoreCase(loadData.doctorsLinkedList.get(count).getName())) {
                    doctorHold = loadData.doctorsLinkedList.get(count);
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
        for (int count = 0; count < loadData.userCredentialsLinkedList.size(); count++) {
            if (userEmail.hashCode() == loadData.userCredentialsLinkedList.get(count).getEmail().hashCode()
                    && userPassword.hashCode() == loadData.userCredentialsLinkedList.get(count).getPassword().hashCode()) {
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
   public LinkedList<Patient> searchPatientByDocid(String doctorId)
   {
       LinkedList<Patient> patientLinkedListHold=new LinkedList<>();
       DoctorAssociationWithPatient holdDoctorAssociation;
       String pID;
       Doctors holdDoctor;
       if(doctorId.length()==4)
       {
           for(int count=0;count<loadData.doctorAssociationWithPatientLinkedList.size();count++)
           {
               if(doctorId.equals(loadData.doctorAssociationWithPatientLinkedList.get(count).getDoctorID()))
               {
                   pID=loadData.doctorAssociationWithPatientLinkedList.get(count).getPatientID();
                   for(int count1=0 ; count1<loadData.patientLinkedList.size();count1++)
                   {
                       if(pID.equals(loadData.patientLinkedList.get(count1).getId()))
                       {
                           patientLinkedListHold.add(loadData.patientLinkedList.get(count1));
                           System.out.println(loadData.patientLinkedList.get(count1).getId());
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
           for(int count=0;count<loadData.doctorAssociationWithPatientLinkedList.size();count++)
           {
               if(doctorId.equals(loadData.doctorAssociationWithPatientLinkedList.get(count).getDoctorID()))
               {
                   pID=loadData.doctorAssociationWithPatientLinkedList.get(count).getPatientID();
                   for(int count1=0 ; count1<loadData.patientLinkedList.size();count1++)
                   {
                       if(pID.equals(loadData.patientLinkedList.get(count1).getId()))
                       {
                           patientLinkedListHold.add(loadData.patientLinkedList.get(count1));
                       }
                   }
               }
           }
       }
       return patientLinkedListHold;
   }
   //===================================================================================================================
    /**
     * @return whole Doctors (LinkedList Custom)
     */
   public LinkedList<Doctors> getDoctorLinkedList() { return loadData.doctorsLinkedList; }
   //===================================================================================================================
    /**
     * @return whole Patient (LinkedList Custom)
     */
   public LinkedList<Patient> getPatientLinkedListHold() { return loadData.patientLinkedList; }
   //===================================================================================================================
    /**
     * @return whole Patient (LinkedList Java.util)
     */
    public java.util.LinkedList<Patient> getPatientLinkedListUtil() { return  loadData.patientLinkedListUtil; }
    //==================================================================================================================
    /**
     * @return whole Doctor (LinkedList Java.util)
     */
    public java.util.LinkedList<Doctors> getDoctorsLinkedListUtil() {return  loadData.doctorsLinkedListUtil; }
    //==================================================================================================================
    /**
     * @return whole Patient (Stack Custom)
     */
    public Stack<Patient> getPatientStack()
    {
        Stack<Patient> patientStack=new Stack<>();
        patientStack.addAll(loadData.patientLinkedList);
        return patientStack;
    }
    //==================================================================================================================
    /**
     * @return whole Doctor (Queue Custom)
     */
    public Queue<Doctors> getDoctorQueue()
    {
        Queue<Doctors> doctorsQueue=new Queue<>();
        doctorsQueue.addAll(loadData.doctorsLinkedList);
        return doctorsQueue;
    }
    //==================================================================================================================


}