package com.Hospital.UIClasses;

import com.Hospital.ReportGenrator.DoctorsReportGenerator;
import com.Hospital.ReportGenrator.PatientsReportGenerator;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Welcome_Screen extends javax.swing.JFrame{
    public Welcome_Screen() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("UIComponents\\hos.png");
        this.setIconImage(icon);
        this.setTitle("Lahore General Hospital IMS");
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addPatientButton = new javax.swing.JButton();
        patientWardDetailButton = new javax.swing.JButton();
        searchPatientDetailsButton = new javax.swing.JButton();
        genratePatientsReport = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        addDoctorButton = new javax.swing.JButton();
        searchDoctorButton = new javax.swing.JButton();
        updateDoctorRecordButton = new javax.swing.JButton();
        genrateDoctorsReport = new javax.swing.JButton();
        searchCOVIDpatients = new javax.swing.JButton();
        searhDoctorPatientAssociation = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(171, 183, 183));


        jLabel1.setIcon(new javax.swing.ImageIcon("UIComponents\\logo.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 130, 76));
        jLabel2.setText("Lahore General Hospital Management System");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(30, 130, 76));
        jLabel3.setText("Patient Services Panel");

        addPatientButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addPatientButton.setIcon(new javax.swing.ImageIcon("UIComponents\\patient.png")); // NOI18N
        addPatientButton.setText("Add Patient");
        addPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientButtonActionPerformed(evt);
            }
        });

        patientWardDetailButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        patientWardDetailButton.setIcon(new javax.swing.ImageIcon("UIComponents\\ward.png")); // NOI18N
        patientWardDetailButton.setText("Patient's Ward Deatls        ");
        patientWardDetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientWardDetailButtonActionPerformed(evt);
            }
        });

        searchPatientDetailsButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchPatientDetailsButton.setIcon(new javax.swing.ImageIcon("UIComponents\\search.png")); // NOI18N
        searchPatientDetailsButton.setText("Search Patient Details       ");
        searchPatientDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatientDetailsButtonActionPerformed(evt);
            }
        });

        genratePatientsReport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        genratePatientsReport.setIcon(new javax.swing.ImageIcon("UIComponents\\report1.png")); // NOI18N
        genratePatientsReport.setText("Genrate Patient Data Report");
        genratePatientsReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePatientsReportActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(30, 130, 76));
        jLabel4.setText("Doctor Services Panel");

        addDoctorButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addDoctorButton.setIcon(new javax.swing.ImageIcon("UIComponents\\doctor.png")); // NOI18N
        addDoctorButton.setText("Add Doctor");
        addDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctorButtonActionPerformed(evt);
            }
        });

        searchDoctorButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchDoctorButton.setIcon(new javax.swing.ImageIcon("UIComponents\\search.png")); // NOI18N
        searchDoctorButton.setText("Search Doctor Details              ");
        searchDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDoctorButtonActionPerformed(evt);
            }
        });

        updateDoctorRecordButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        updateDoctorRecordButton.setIcon(new javax.swing.ImageIcon("UIComponents\\detail.png")); // NOI18N
        updateDoctorRecordButton.setText("Update Doctor Details            ");
        updateDoctorRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDoctorRecordButtonActionPerformed(evt);
            }
        });

        genrateDoctorsReport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        genrateDoctorsReport.setIcon(new javax.swing.ImageIcon("UIComponents\\report2.png")); // NOI18N
        genrateDoctorsReport.setText("Genrate Doctors Report          ");
        genrateDoctorsReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateDoctorsReportActionPerformed(evt);
            }
        });

        searchCOVIDpatients.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchCOVIDpatients.setIcon(new javax.swing.ImageIcon("UIComponents\\mask.png")); // NOI18N
        searchCOVIDpatients.setText("COVID Positive Patients       ");
        searchCOVIDpatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCOVIDpatientsActionPerformed(evt);
            }
        });

        searhDoctorPatientAssociation.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searhDoctorPatientAssociation.setIcon(new javax.swing.ImageIcon("UIComponents\\doctorAssociation.png")); // NOI18N
        searhDoctorPatientAssociation.setText("Doctorand Patient Association");
        searhDoctorPatientAssociation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searhDoctorPatientAssociationActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(171, 183, 183));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logoutButton.setIcon(new javax.swing.ImageIcon("UIComponents\\logout.png")); // NOI18N
        logoutButton.setText("Logout!");
        logoutButton.setToolTipText("Logout from Main menu");
        logoutButton.setBorder(null);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
                MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(patientWardDetailButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(searchPatientDetailsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(searchCOVIDpatients, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(genratePatientsReport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(368, 368, 368)
                                                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(searchDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                        .addComponent(genrateDoctorsReport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                                                                        .addComponent(searhDoctorPatientAssociation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                        .addComponent(updateDoctorRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(addPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(addDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                .addGap(702, 702, 702)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                .addGap(361, 361, 361)
                                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                                                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(64, 64, 64))
        );
        MainPanelLayout.setVerticalGroup(
                MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addPatientButton)
                                        .addComponent(addDoctorButton))
                                .addGap(43, 43, 43)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchPatientDetailsButton)
                                        .addComponent(searhDoctorPatientAssociation))
                                .addGap(18, 18, 18)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(patientWardDetailButton)
                                        .addComponent(searchDoctorButton))
                                .addGap(13, 13, 13)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchCOVIDpatients)
                                        .addComponent(updateDoctorRecordButton))
                                .addGap(18, 18, 18)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(genrateDoctorsReport)
                                        .addComponent(genratePatientsReport))
                                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    //==================================================================================================================
    private void patientWardDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        // Search Patient by Name here
        PatientsInWard_Screen patientsInWardScreen=new PatientsInWard_Screen();
        MainPanel.setLayout(new java.awt.BorderLayout());
        MainPanel.removeAll();
        MainPanel.add(patientsInWardScreen.addPanel);
        MainPanel.validate();

    }
    //==================================================================================================================
    private void generatePatientsReportActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //extra Patients Services here
        PatientsReportGenerator reportGenerator=new PatientsReportGenerator();
        reportGenerator.start();
        ImageIcon icon = new ImageIcon("UIComponents\\report1.png");
        JOptionPane.showMessageDialog(null, "Report Generated Successfully!", "Successful", JOptionPane.ERROR_MESSAGE, icon);
        try { PatientReport(); } catch (IOException ignored) { }
    }
    //==================================================================================================================
    private void addPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //Add Patients Button here
        AddPatients_Screen patients_screen=new AddPatients_Screen();
        MainPanel.setLayout(new java.awt.BorderLayout());
        MainPanel.removeAll();
        MainPanel.add(patients_screen.addPanel);
        MainPanel.validate();
    }
    //==================================================================================================================
    private void searchCOVIDpatientsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        // Search COVID Positive patients here
        CovidPatients_Screen covidPatientsScreen=new CovidPatients_Screen();
        MainPanel.setLayout(new java.awt.BorderLayout());
        MainPanel.removeAll();
        MainPanel.add(covidPatientsScreen.addPanel);
        MainPanel.validate();

    }
    //==================================================================================================================
    private void searchPatientDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        // Search Patients BY Phone or ID here
        SearchPatient_Screen searchPatientScreen=new SearchPatient_Screen();
        MainPanel.setLayout(new java.awt.BorderLayout());
        MainPanel.removeAll();
        MainPanel.add(searchPatientScreen.addPanel);
        MainPanel.validate();
    }
    //==================================================================================================================
    private void addDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        // Add Doctors Button here
        AddDoctors_Screen addDoctors_screen=new AddDoctors_Screen();
        MainPanel.setLayout(new java.awt.BorderLayout());
        MainPanel.removeAll();
        MainPanel.add(addDoctors_screen.addPanel);
        MainPanel.validate();
    }
    //==================================================================================================================
    private void updateDoctorRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your  Doctors Record
        UpdateDoctor_Screen updateDoctorScreen=new UpdateDoctor_Screen();
        MainPanel.setLayout(new java.awt.BorderLayout());
        MainPanel.removeAll();
        MainPanel.add(updateDoctorScreen.addPanel);
        MainPanel.validate();


    }
    //==================================================================================================================
    private void searchDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //Search Doctor By Name or ID
        SearchDoctor_Screen searchDoctorScreen=new SearchDoctor_Screen();
        MainPanel.setLayout(new java.awt.BorderLayout());
        MainPanel.removeAll();
        MainPanel.add(searchDoctorScreen.addPanel);
        MainPanel.validate();

    }
    //==================================================================================================================
    private void searhDoctorPatientAssociationActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //Doctor Patient Asscoition here
        DoctorPatientAssociation_Screen doctorPatientAssociationScreen =new DoctorPatientAssociation_Screen();
        MainPanel.setLayout(new java.awt.BorderLayout());
        MainPanel.removeAll();
        MainPanel.add(doctorPatientAssociationScreen.addPanel);
        MainPanel.validate();

    }
    //==================================================================================================================
    private void generateDoctorsReportActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //More Doctor Services here
        DoctorsReportGenerator reportGenerator=new DoctorsReportGenerator();
        reportGenerator.start();
        ImageIcon icon = new ImageIcon("UIComponents\\report2.png");
        JOptionPane.showMessageDialog(null, "Report Generated Successfully!", "Successful", JOptionPane.ERROR_MESSAGE, icon);
        try { DoctorReport(); } catch (IOException ignored) { }

    }
    //==================================================================================================================
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        // TODO logout
        this.setVisible(false);
        LoginScreen loginScreen =new LoginScreen();
        loginScreen.setVisible(true);

    }
    //==================================================================================================================
    private void DoctorReport() throws IOException {
        String fileName = "Hospital's Doctors Report.pdf";
        String[] commands = {"cmd", "/c", "start", "\"DummyTitle\"",fileName};
        Runtime.getRuntime().exec(commands);
    }
    //==================================================================================================================
    private void PatientReport() throws IOException {
        String fileName = "Hospital's Patient Report.pdf";
        String[] commands = {"cmd", "/c", "start", "\"DummyTitle\"",fileName};
        Runtime.getRuntime().exec(commands);
    }
    //==================================================================================================================

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Welcome_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton addDoctorButton;
    private javax.swing.JButton addPatientButton;
    private javax.swing.JButton genrateDoctorsReport;
    private javax.swing.JButton genratePatientsReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    protected javax.swing.JPanel MainPanel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton patientWardDetailButton;
    private javax.swing.JButton searchCOVIDpatients;
    private javax.swing.JButton searchDoctorButton;
    private javax.swing.JButton searchPatientDetailsButton;
    private javax.swing.JButton searhDoctorPatientAssociation;
    private javax.swing.JButton updateDoctorRecordButton;
    // End of variables declaration
}
