package com.Hospital.SearchingAndModiciation;



import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Contains Necessary functions to manipulate Patients,Doctors,DoctorPatientAssociation and Credentials (List)
 * according to the Program's requirement
 */
public class ModifyEntities {
    public SearchEntities searchEntities=new SearchEntities();
    //==================================================================================================================

    /**
     * @param userEmail
     * @param userPhone
     * @param newPassword
     * Accepts mentioned parameters and if userEmail & userPhone belongs to the same entity this will allow user
     * to change current login Passwords. This will also re-Write updated credential list into Credentials Dataset file
     * @return true or false
     * @throws IOException
     */
    public boolean resetPassword(String userEmail, String userPhone, String newPassword) throws IOException {
        for (int count = 0; count <searchEntities.loadData.userCredentialsLinkedList.size(); count++)
        {
            if (userEmail.hashCode() ==searchEntities.loadData.userCredentialsLinkedList.get(count).getEmail().hashCode()
                    && userPhone.hashCode() ==searchEntities.loadData.userCredentialsLinkedList.get(count).getPhone().hashCode())
            {
                searchEntities.loadData.userCredentialsLinkedList.get(count).setPassword(newPassword);
                FileWriter writeNewCredentials=new FileWriter("user\\UserLogins.csv");
                for(int count1=0;count1<searchEntities.loadData.userCredentialsLinkedList.size();count1++)
                {
                    writeNewCredentials.write(searchEntities.loadData.userCredentialsLinkedList.get(count1).getEmail()+","+searchEntities.loadData.userCredentialsLinkedList.get(count1).getPassword()+","+searchEntities.loadData.userCredentialsLinkedList.get(count1).getPhone()+"\n");
                }
                writeNewCredentials.close();
                return true;
            }
        }
        return false;
    }
    //==================================================================================================================

    /**
     * This will generate 4-Digit Sequenced ID for patients while keeping the previous ID in record.
     * @return patient-ID
     */
    public int generatePatientId()
    {
        int patientId=Integer.parseInt(searchEntities.loadData.patientLinkedList.get(searchEntities.loadData.patientLinkedList.size()-1).getId());
        return patientId+1;
    }
    //==================================================================================================================

    /**
     * This will generate 4-Digit Sequenced ID for Doctors while keeping the previous ID in record.
     * @return doctor-ID
     */
    public int generateDoctorId()
    {
        int patientId=Integer.parseInt(searchEntities.loadData.doctorsLinkedList.get(searchEntities.loadData.doctorsLinkedList.size()-1).getId());
        return patientId+1;
    }
    //==================================================================================================================

    /**
     * This will write Patient's all data into the patient's Dataset file everytime when a patient is
     * add into (type)Patients List. This is a global patient List it will contain every patient
     * @throws IOException
     */
    public void addPatients() throws IOException {
        FileWriter writeNewPatients=new FileWriter("Hospital Records\\Patient Record.csv");
        for (int count = 0; count < searchEntities.loadData.patientLinkedList.size(); count++)
        {
            writeNewPatients.write(searchEntities.loadData.patientLinkedList.get(count).getId()+","+
                    searchEntities.loadData.patientLinkedList.get(count).getName()+","+searchEntities.loadData.patientLinkedList.get(count).getCnic()+","+
                    searchEntities.loadData.patientLinkedList.get(count).getPhone()+","+searchEntities.loadData.patientLinkedList.get(count).getAddress()+","+
                    searchEntities.loadData.patientLinkedList.get(count).getCovid()+","+
                    searchEntities.loadData.patientLinkedList.get(count).getAdmitted()+","+searchEntities.loadData.patientLinkedList.get(count).getService()+","+
                    searchEntities.loadData.patientLinkedList.get(count).getGender()+","+searchEntities.loadData.patientLinkedList.get(count).getAge()+","+searchEntities.loadData.patientLinkedList.get(count).getTime()+"\n");
        }
        writeNewPatients.close();
    }
    //==================================================================================================================

    /**
     * This will Search OPD patients in Global (type)Patient List then write that OPD patients in
     * OPD-Patients Dataset file
     * @throws IOException
     */
    public void addOPDPatients() throws IOException {
        FileWriter writeOPDPatients=new FileWriter("Hospital Records\\OPD.csv");
        for (int count = 0; count < searchEntities.loadData.patientLinkedList.size(); count++)
        {
            if(searchEntities.loadData.patientLinkedList.get(count).getService().equals("OPD")) {
                writeOPDPatients.write(searchEntities.loadData.patientLinkedList.get(count).getId() + "," +
                        searchEntities.loadData.patientLinkedList.get(count).getName() + "," + searchEntities.loadData.patientLinkedList.get(count).getCnic() + "," +
                        searchEntities.loadData.patientLinkedList.get(count).getPhone() + "," + searchEntities.loadData.patientLinkedList.get(count).getAddress() + "," +
                        searchEntities.loadData.patientLinkedList.get(count).getCovid() + "," +
                        searchEntities.loadData.patientLinkedList.get(count).getAdmitted() + "," + searchEntities.loadData.patientLinkedList.get(count).getService() + "," +
                        searchEntities.loadData.patientLinkedList.get(count).getGender() + "," + searchEntities.loadData.patientLinkedList.get(count).getAge() + "\n");
            }
        }
        writeOPDPatients.close();
    }
    //==================================================================================================================

    /**
     *This will Search Emergency patients in Global (type)Patient List then write that Emergency patients in
     *Emergency-Patients Dataset file
     * @throws IOException
     */
    public void addEmergencyPatients() throws IOException {
        FileWriter writeEmrgencyPatients=new FileWriter("Hospital Records\\Emergency.csv");
        for(int count=0;count<searchEntities.loadData.patientLinkedList.size();count++)
        {
           if(searchEntities.loadData.patientLinkedList.get(count).getService().equals("Emergency")) {
            writeEmrgencyPatients.write(searchEntities.loadData.patientLinkedList.get(count).getId() + "," +
                    searchEntities.loadData.patientLinkedList.get(count).getName() + "," + searchEntities.loadData.patientLinkedList.get(count).getCnic() + "," +
                    searchEntities.loadData.patientLinkedList.get(count).getPhone() + "," + searchEntities.loadData.patientLinkedList.get(count).getAddress() + "," +
                    searchEntities.loadData.patientLinkedList.get(count).getCovid() + "," +
                    searchEntities.loadData.patientLinkedList.get(count).getAdmitted() + "," + searchEntities.loadData.patientLinkedList.get(count).getService() + "," +
                    searchEntities.loadData.patientLinkedList.get(count).getGender() + "," + searchEntities.loadData.patientLinkedList.get(count).getAge() + "\n"); }
        }
        writeEmrgencyPatients.close();
    }
    //==================================================================================================================

    /**
     * This will Write Patient-ID and his Associated Doctor-ID in Doctor Patient Association Dataset.
     * @throws IOException
     */
    public void addAssociatedPatients() throws IOException {
        FileWriter writeAssociatedPatients=new FileWriter("Hospital Records\\Doctor association with patients.csv");
        for(int count=0;count<searchEntities.loadData.doctorAssociationWithPatientLinkedList.size();count++)
        {
            writeAssociatedPatients.write(searchEntities.loadData.doctorAssociationWithPatientLinkedList.get(count).getPatientID()+
            ","+searchEntities.loadData.doctorAssociationWithPatientLinkedList.get(count).getDoctorID()+"\n");
        }
        writeAssociatedPatients.close();
    }
    //==================================================================================================================

    /**
     * @return Date in (type)String
     */
    public String addTimeRecord()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MM/dd");
        LocalDate now = LocalDate.now();
        return dtf.format(now);
    }
    //==================================================================================================================

    /**
     * This will write Doctor's all data into the Doctor's Dataset file everytime when a Doctor is
     * add/updated into (type)Doctors List. This is a global Doctors List it will contain every Doctors
     * @throws IOException
     */
    public void addDoctors() throws IOException {
        FileWriter writeNewDoctors=new FileWriter("Hospital Records\\Doctors Record.csv");
        for (int count = 0; count < searchEntities.loadData.doctorsLinkedList.size(); count++)
        {
            writeNewDoctors.write(searchEntities.loadData.doctorsLinkedList.get(count).getId()+","+
                    searchEntities.loadData.doctorsLinkedList.get(count).getName()+","+searchEntities.loadData.doctorsLinkedList.get(count).getCnic()+","+
                    searchEntities.loadData.doctorsLinkedList.get(count).getAddress()+","+
                    searchEntities.loadData.doctorsLinkedList.get(count).getSpecialization()+","+searchEntities.loadData.doctorsLinkedList.get(count).getSalary()+","+
                    searchEntities.loadData.doctorsLinkedList.get(count).getService()+"\n");
        }
        writeNewDoctors.close();
    }
    //==================================================================================================================

    /**
     * @param anyString Accepts any String from user and if Comma(,) is found in that Sting
     * it will replace that Comma(,) with Dot(.) then returns newly modified String
     * @return String
     */
    public String formatSetter(String anyString)
    {
        String modifiedString;
        modifiedString=anyString.replace(",",".");
        return modifiedString;
    }
    //==================================================================================================================

    /**
     * Accepts following Parameters to update doctor
     * @param Id
     * @param Name
     * @param Address
     * @param Cnic
     * @param Specialization
     * @param Service
     * @param Salary
     * @return True if doctor is successfully update otherwise false
     */
    public boolean updateDoctor(String Id, String Name, String Address, String Cnic, String Specialization, String Service, String Salary)
    {
        for(int count=0;count<searchEntities.loadData.doctorsLinkedList.size();count++)
        {
            if(Id.equals(searchEntities.loadData.doctorsLinkedList.get(count).getId()))
            {
                if(Name.length()>=5 && Cnic.length()>=15 && Address.length()>=10 && Specialization!=null && Salary!=null && Service!=null)
                {
                    searchEntities.loadData.doctorsLinkedList.get(count).setService(Service);
                    searchEntities.loadData.doctorsLinkedList.get(count).setName(Name);
                    searchEntities.loadData.doctorsLinkedList.get(count).setAddress(Address);
                    searchEntities.loadData.doctorsLinkedList.get(count).setCnic(Cnic);
                    searchEntities.loadData.doctorsLinkedList.get(count).setSpecialization(Specialization);
                    searchEntities.loadData.doctorsLinkedList.get(count).setSalary(Salary);

                    return true;
                }
                else
                    return false;
            }
        }
        return false;
    }
    //==================================================================================================================


}
