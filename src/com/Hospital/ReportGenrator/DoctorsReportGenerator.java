package com.Hospital.ReportGenrator;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class DoctorsReportGenerator extends Thread {
    private final ReportFormat format = new ReportFormat();

    public void run() {
        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Hospital's Doctors Report.pdf"));
            document.open(); //Opening Document
            Image HospitalLogo = Image.getInstance("UIComponents\\Logo.png"); //Getting Hospital logo Image
            HospitalLogo.setAbsolutePosition(25f, 700f); //Setting Image Page Size
            HospitalLogo.scaleAbsolute(560, 137); //Setting Image size
            format.Abstract.setAlignment(Element.ALIGN_JUSTIFIED); //Setting Alignment of Paragraph
            document.add(HospitalLogo); //Adding Image
            document.add(format.TitleDoctor); //Adding Title
            document.add(format.timeOfReport()); //Adding Date & Time
            document.add(format.Abstract); //Adding Paragraph
            document.add(format.weaklyReportTitle);
            Image reportLogo = Image.getInstance("UIComponents\\report2.png"); //Getting Hospital logo Image
            reportLogo.scaleAbsolute(15, 15); //Setting Image size
            document.add(reportLogo);
            document.add(format.totalDoctors());
            document.add(new Paragraph("Doctor's Details:"));
            Image doctorLogo = Image.getInstance("UIComponents\\doctor.png"); //Getting Hospital logo Image
            doctorLogo.scaleAbsolute(15, 15); //Setting Image size
            document.add(doctorLogo);
            document.add(format.doctorDetails());
            document.close();//Closing Document
            writer.close();

        } catch (DocumentException | IOException ignored) { }
    }
    //==================================================================================================================
}

