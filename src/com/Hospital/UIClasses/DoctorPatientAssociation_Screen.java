package com.Hospital.UIClasses;

import com.Hospital.Core_Classes.Doctors;
import com.Hospital.Core_Classes.Patient;
import com.Hospital.LinkedList_DSA.LinkedList;
import com.Hospital.SearchingAndModiciation.SearchEntities;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DoctorPatientAssociation_Screen extends javax.swing.JFrame {
    private SearchEntities search=new SearchEntities();
    private LinkedList<Patient> mapPatient=new LinkedList<>();
    private Doctors mapDoctor;
    DefaultTableModel model;
    public DoctorPatientAssociation_Screen() {
        initComponents();
        model=(DefaultTableModel) showDoctorPatientAssociationTable.getModel();
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

        addPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        addPatientName = new javax.swing.JTextField();
        searchAssociationButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        showDoctorPatientAssociationTable = new javax.swing.JTable();
        showDoctorNameLable = new javax.swing.JLabel();
        backToWellcomeScreen = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);



        addPanel.setBackground(new java.awt.Color(171, 183, 183));


        jLabel1.setIcon(new javax.swing.ImageIcon("UIComponents\\logo.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 130, 76));
        jLabel2.setText("Lahore General Hospital Management System");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(30, 130, 76));
        jLabel3.setText("Patient Association With  Doctors");

        jPanel3.setBackground(new java.awt.Color(93, 170, 136));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("● Doctor ID or Name");

        addPatientName.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        addPatientName.setForeground(new java.awt.Color(48, 51, 107));
        addPatientName.setToolTipText("Enter Doctor Name or ID");

        searchAssociationButton.setText("Search    ");
        searchAssociationButton.setToolTipText("Search Patients asssociated with Doctors");
        searchAssociationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAssociationButtonActionPerformed(evt);
            }
        });

        showDoctorPatientAssociationTable.setAutoCreateRowSorter(true);
        showDoctorPatientAssociationTable.setBackground(new java.awt.Color(221, 221, 221));
        showDoctorPatientAssociationTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        showDoctorPatientAssociationTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Patient ID", "Patient Name", "Patient Phone", "Provided Service", "Gender", "Age", "Address"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        showDoctorPatientAssociationTable.setToolTipText("Patients Accociated with Doctor");
        showDoctorPatientAssociationTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(showDoctorPatientAssociationTable);

        showDoctorNameLable.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        showDoctorNameLable.setText(" ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(showDoctorNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(addPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(searchAssociationButton)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchAssociationButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(showDoctorNameLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backToWellcomeScreen.setBackground(new java.awt.Color(171, 183, 183));
        backToWellcomeScreen.setIcon(new javax.swing.ImageIcon("UIComponents\\back.png")); // NOI18N
        backToWellcomeScreen.setText("Back");
        backToWellcomeScreen.setToolTipText("Back to Wellcome Screen");
        backToWellcomeScreen.setBorder(null);
        backToWellcomeScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToWellcomeScreenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
                addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addPanelLayout.createSequentialGroup()
                                .addGap(371, 371, 371)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(addPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 343, Short.MAX_VALUE)
                                                .addComponent(backToWellcomeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                        .addGroup(addPanelLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
                addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addPanelLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(backToWellcomeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(389, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1357, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    //==================================================================================================================
    private void searchAssociationButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO Search Association Specific doctor Search All Association
        SetDoctorNameAboveTable();
        ShowPatientsOnTable();
    }
    //==================================================================================================================
    private void ShowPatientsOnTable()
    {
        String idOrName=addPatientName.getText();
        mapPatient=search.searchPatientByDocid(idOrName);
        if(mapDoctor==null)
        {
            ImageIcon icon = new ImageIcon("UIComponents\\error.png");
            JOptionPane.showMessageDialog(null, "Doctor not found!\nTry again please...", "Failed", JOptionPane.ERROR_MESSAGE, icon);
        }
        else
        {
            model.setRowCount(0);
            for (int count = 0; count < mapPatient.size(); count++) {
                model.insertRow(count, new Object[]{mapPatient.get(count).getId(), mapPatient.get(count).getName(),
                mapPatient.get(count).getPhone(), mapPatient.get(count).getService(), mapPatient.get(count).getGender(),
                mapPatient.get(count).getAge(), mapPatient.get(count).getAddress()});
            }
        }
    }
    //==================================================================================================================
    private void SetDoctorNameAboveTable()
    {
        String idOrName=addPatientName.getText();
        mapDoctor=search.searchDoctorByNameAndId(idOrName);
        if(mapDoctor!=null)
        {showDoctorNameLable.setText(mapDoctor.getName()+" -"+mapDoctor.getSpecialization()+" (L.G.H)");}
        else
        {
            showDoctorNameLable.setText("No Associated Doctor Found!");
        }
    }
    //==================================================================================================================
    private void backToWellcomeScreenActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your Back to Wellcome here
        Welcome_Screen welcome_screen=new Welcome_Screen();
        addPanel.setLayout(new java.awt.BorderLayout());
        addPanel.removeAll();
        addPanel.add(welcome_screen.MainPanel);
        addPanel.validate();

    }
   //===================================================================================================================
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DoctorPatientAssociation_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DoctorPatientAssociation_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DoctorPatientAssociation_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DoctorPatientAssociation_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DoctorPatientAssociation_Screen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify
    private javax.swing.JTextField addPatientName;
    private javax.swing.JToggleButton backToWellcomeScreen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel addPanel;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchAssociationButton;
    private javax.swing.JLabel showDoctorNameLable;
    private javax.swing.JTable showDoctorPatientAssociationTable;
    // End of variables declaration
}
