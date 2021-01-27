package com.Hospital.ReportGenrator;


import com.Hospital.SearchingAndModiciation_Classes.ModifyEntities;
import com.itextpdf.text.List;
import com.itextpdf.text.Paragraph;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * Class Contains Report format of Doctor's report as well as for Patient's report.
 * it contains pre-written Strings in (type) Paragraph and (type) List available in "itextpdf" Library.
 */
public class ReportFormat {
    private final ModifyEntities modifyEntities=new ModifyEntities();
    //==================================================================================================================
    public final Paragraph TitleDoctor=new Paragraph("\n\n\n\n\n\nL.G.S Doctor's Report--------------------------------------------------------------" +
            "---------------------------------------");
    //==================================================================================================================
    public final Paragraph TitlePatient=new Paragraph("\n\n\n\n\n\nL.G.S Patient's Report-------------------------------------------------------------" +
            "---------------------------------------");
    //==================================================================================================================
    public final Paragraph Abstract=new Paragraph("Statement:\nTo establish Lahore General Hospital as the best public hospital providing tertiary" +
            " level care of health services to the community. Develop strong coordination with the allied departments and develop"+
            " the human skills in order to be more effective and efficient.");
    //==================================================================================================================
    public final Paragraph weaklyReportTitle=new Paragraph("\nMonthly Report.");
    //==================================================================================================================
    public Paragraph timeOfReport()
    {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        return new Paragraph("Report Generated on: " + formattedDate);
    }
    //==================================================================================================================
    public List totalDoctors()
    {
        int Emergency=0,Opd=0,Reserved=0,Total=modifyEntities.searchEntities.loadData.doctorsList.size()-1;
        List ServiceList=new List();
        for (int count=0;count<modifyEntities.searchEntities.loadData.doctorsList.size();count++)
        {
            if(modifyEntities.searchEntities.loadData.doctorsList.get(count).getService().equals("OPD"))
            {
                Opd=Opd+1;
            }
            else if(modifyEntities.searchEntities.loadData.doctorsList.get(count).getService().equals("Emergency"))
            {
                Emergency=Emergency+1;
            }
            else  if(modifyEntities.searchEntities.loadData.doctorsList.get(count).getService().equals("Reserved"))
            {
                Reserved=Reserved+1;
            }
        }
        ServiceList.add("L.G.H's total Doctors: "+Total);
        ServiceList.add("Doctors Serving in Out-Patient Department: "+Opd);
        ServiceList.add("Doctors Serving in Emergency-Patient Department: "+Emergency);
        ServiceList.add("L.G.H's Reserved Doctors: "+Reserved);
        return ServiceList;
    }
    //==================================================================================================================
    public List doctorDetails()
    {
        List details=new List();
        for (int count=0;count<modifyEntities.searchEntities.loadData.doctorsList.size();count++)
        {
            details.add(modifyEntities.searchEntities.loadData.doctorsList.get(count).getName()+":"+modifyEntities.searchEntities.loadData.doctorsList.get(count).getSpecialization()+",   Departmental Service-"+
                    modifyEntities.searchEntities.loadData.doctorsList.get(count).getService()+",  Salary-"+modifyEntities.searchEntities.loadData.doctorsList.get(count).getSalary());
        }
        return details;
    }
    //==================================================================================================================
    public List totalPatients()
    {
        int Emergency=0,Opd=0,Total=modifyEntities.searchEntities.loadData.patientList.size()-1;
        List ServiceList=new List();
        for (int count=0;count<modifyEntities.searchEntities.loadData.patientList.size();count++)
        {
            if(modifyEntities.searchEntities.loadData.patientList.get(count).getService().equals("OPD"))
            {
                Opd=Opd+1;
            }
            else if(modifyEntities.searchEntities.loadData.patientList.get(count).getService().equals("Emergency"))
            {
                Emergency=Emergency+1;
            }
        }
        ServiceList.add("Total Patients Record in L.G.H: "+Total);
        ServiceList.add("Patients in Out-Patient Department: "+Opd);
        ServiceList.add("Patients in Emergency-Patient Department: "+Emergency);

        return ServiceList;
    }
    //==================================================================================================================
    public List MaleAnfFemalePatients()
    {
        int Covid=0,Male=0,Female=0;
        List GenderList=new List();
        for (int count=0;count<modifyEntities.searchEntities.loadData.patientList.size();count++)
        {
            if(modifyEntities.searchEntities.loadData.patientList.get(count).getCovid().equals("Positive"))
           {
            Covid=Covid+1;
           }
        else if(modifyEntities.searchEntities.loadData.patientList.get(count).getGender().equals("Female"))
           {
            Female=Female+1;
           }
        else if(modifyEntities.searchEntities.loadData.patientList.get(count).getGender().equals("Male"))
           {
            Male=Male+1;
           }
        }
        GenderList.add(("Covid-19 Positive Patients in Total: "+Covid));
        GenderList.add("Female Patients in Total: "+Female);
        GenderList.add("Male Patients in Total: "+Male);
        return GenderList;
    }
    //==================================================================================================================

}
