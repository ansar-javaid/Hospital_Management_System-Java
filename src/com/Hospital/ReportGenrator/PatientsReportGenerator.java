package com.Hospital.ReportGenrator;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class PatientsReportGenerator extends Thread {
    private final ReportFormat format = new ReportFormat();
    public void run()
    {
        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Hospital's Patient Report.pdf"));
            document.open(); //Opening Document
            Image HospitalLogo = Image.getInstance("UIComponents\\Logo.png"); //Getting Hospital logo Image
            HospitalLogo.setAbsolutePosition(25f, 700f); //Setting Image Page Size
            HospitalLogo.scaleAbsolute(560, 137); //Setting Image size
            format.Abstract.setAlignment(Element.ALIGN_JUSTIFIED); //Setting Alignment of Paragraph
            document.add(HospitalLogo); //Adding Image
            document.add(format.TitlePatient); //Adding Title
            document.add(format.timeOfReport()); //Adding Date & Time
            document.add(format.Abstract); //Adding Paragraph
            document.add(format.weaklyReportTitle);
            Image reportLogo = Image.getInstance("UIComponents\\report2.png"); //Getting Hospital logo Image
            reportLogo.scaleAbsolute(15, 15); //Setting Image size
            document.add(reportLogo);
            document.add(format.totalPatients());
            document.add(new Paragraph("Patient's Details:"));
            Image patientLogo = Image.getInstance("UIComponents\\ward.png"); //Getting Hospital logo Image
            patientLogo.scaleAbsolute(15, 15); //Setting Image size
            document.add(patientLogo);
            document.add(format.MaleAnfFemalePatients());
            document.close();//Closing Document
            writer.close();

        } catch (DocumentException | IOException ignored) { }
    }
    //==================================================================================================================
}
