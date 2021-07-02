package com.Hospital.UIClasses;

import com.Hospital.Core_Classes.Doctors;
import com.Hospital.Core_Classes.Patient;
import com.Hospital.SearchingAndModiciation.ModifyEntities;

import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class SearchDoctor_Screen extends javax.swing.JFrame {
    private TreeNode rootNode;
    private final ModifyEntities modificationFunctions=new ModifyEntities();
    private Doctors mapDoctors;
    DefaultTableModel model;
    public SearchDoctor_Screen() {
        initComponents();
        model=(DefaultTableModel) showDoctorsTable.getModel();
        Image icon = Toolkit.getDefaultToolkit().getImage("UIComponents\\hos.png");
        this.setIconImage(icon);
        this.setTitle("Lahore General Hospital I.M.S");
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        buildingTree();

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
        searchDoctorName = new javax.swing.JTextField();
        searchDoctorButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        showDoctorsTable = new javax.swing.JTable();
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
        jLabel3.setText("Search Doctor's Details");

        jPanel3.setBackground(new java.awt.Color(93, 170, 136));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("● Doctor ID/Name");

        searchDoctorName.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        searchDoctorName.setForeground(new java.awt.Color(48, 51, 107));
        searchDoctorName.setToolTipText("Enter Doctor ID or Name");


        searchDoctorButton.setText("Search    ");
        searchDoctorButton.setToolTipText("Search Doctor's Details. Note: ID is more effective rather then name.");
        searchDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDoctorButtonActionPerformed(evt);
            }
        });

        showDoctorsTable.setAutoCreateRowSorter(true);
        showDoctorsTable.setBackground(new java.awt.Color(221, 221, 221));
        showDoctorsTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        showDoctorsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID", "Name", "Specialization", "Service", "C.N.I.C", "Home Address", "Current Salary"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        showDoctorsTable.setToolTipText("Current Details of Doctor");
        showDoctorsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(showDoctorsTable);

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
                                                        .addComponent(showDoctorNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(searchDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(searchDoctorButton)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchDoctorButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(showDoctorNameLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 158, 158))
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
                                .addGap(362, 362, 362)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(addPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(backToWellcomeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(addPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(addPanelLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(325, Short.MAX_VALUE))
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
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(276, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    //==================================================================================================================
    private void searchDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO Search  Specific doctor
        String IdOrName=searchDoctorName.getText();
        try{
            int ID = Integer.parseInt(IdOrName.replaceAll(" ",""));
            Doctors doctor=contains(ID);
            if(doctor!=null)
            {
                showDoctorNameLable.setText(doctor.getName() + " ( L.G.S)");
                model.setRowCount(0);
                model.insertRow(0, new Object[]{doctor.getId(), doctor.getName(), doctor.getSpecialization(),
                        doctor.getService(), doctor.getCnic(), doctor.getAddress(), doctor.getSalary()});
            }else {

                showDoctorNameLable.setText("Doctor Not Found !");
                model.setRowCount(0);
            }
        }catch (Exception e) {
            mapDoctors = modificationFunctions.searchEntities.searchDoctorByNameAndId(IdOrName);
            if (mapDoctors != null) {

                showDoctorNameLable.setText(mapDoctors.getName() + " (L.G.S)");
                model.setRowCount(0);
                model.insertRow(0, new Object[]{mapDoctors.getId(), mapDoctors.getName(), mapDoctors.getSpecialization(),
                        mapDoctors.getService(), mapDoctors.getCnic(), mapDoctors.getAddress(), mapDoctors.getSalary()});

            } else {

                showDoctorNameLable.setText("Doctor Not Found!");
                model.setRowCount(0);
            }
        }
    }
    //==================================================================================================================
    private void backToWellcomeScreenActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        // TODO Back to Wellcome here
        Welcome_Screen welcome_screen=new Welcome_Screen();
        addPanel.setLayout(new java.awt.BorderLayout());
        addPanel.removeAll();
        addPanel.add(welcome_screen.MainPanel);
        addPanel.validate();
    }
    //==================================================================================================================
    //==================================================================================================================
    /**
     * @param data Patient type:
     *            <h2>‣ Algorithm:</h2>
     *<p>» Its Very much similar to contains() method.</p>
     *<p>» To insert a node our first task is to find the place to insert the node.</p>
     *<p>» Take current = root .</p>
     *<p>» start from the current and compare root.patientData with n.</p>
     *<p>» if current.patientData is greater than n that means we need to go to the left of the root.</p>
     *<p>» if current.patientData is smaller than n that means we need to go to the right of the root.</p>
     *<p>» if any point of time current is null that means we have reached to the leaf node, insert your
     *             node here with the help of parent node. (See code)</p>
     * @return true if Node is added as child else false.
     */
    private boolean insert(Doctors data)
    {
        TreeNode currentNode=new TreeNode(data);
        if(rootNode==null)
        {
            rootNode=currentNode;
            return true;
        }
        TreeNode targetingNode=rootNode;
        TreeNode parentNode=null;
        while(true)
        {
            parentNode=targetingNode;
            if(Integer.parseInt(data.getId())<Integer.parseInt(targetingNode.doctorData.getId()))
            {
                targetingNode=targetingNode.moveToLeft();
                if(targetingNode==null)
                {
                    parentNode.setLeftLink(currentNode);
                    return true;
                }
            }
            else
            {
                targetingNode=targetingNode.moveToRight();
                if(targetingNode==null)
                {
                    parentNode.setRightLink(currentNode);
                    return true;
                }
            }
        }
    }
    //==================================================================================================================
    /**
     * @param data integer type:
     *             <h2>‣ Algorithm:</h2>
     * <p>» Its very simple operation to perform.</p>
     * <p>» start from the root and compare root.patientData with patientData</p>
     * <p>» if root.patientData is greater than patientData that means we need to go to the left of the root.</p>
     * <p>» if root.patientData is smaller than patientData that means we need to go to the right of the root.</p>
     * <p>» if any point of time root.patientData is equal to the patientData then we have found the node, return true.</p>
     * <p>» if we reach to the leaves (end of the tree) return false, we didn’t find the element</p>
     * @return true if it contains patientData else false
     */
    public Doctors contains(int data)
    {
        TreeNode targetedNode=rootNode;
        while(targetedNode!=null)
        {
            if(data==Integer.parseInt(targetedNode.doctorData.getId()))
            {
                return targetedNode.doctorData;
            }
            else if(data<Integer.parseInt(targetedNode.doctorData.getId()))
            {
                targetedNode=targetedNode.moveToLeft();
            }
            else
            {
                targetedNode=targetedNode.moveToRight();
            }
        }
        return null;
    }
    //==================================================================================================================
    private void buildingTree()
    {
        java.util.LinkedList<Doctors> doctorsLinkedList =modificationFunctions.searchEntities.getDoctorsLinkedListUtil();
        for(int count = 0; count< doctorsLinkedList.size(); count++)
        {
            insert(doctorsLinkedList.get(count));
        }
    }
    //==================================================================================================================

    // Variables declaration - do not modify
    private javax.swing.JToggleButton backToWellcomeScreen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel addPanel;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchDoctorButton;
    private javax.swing.JTextField searchDoctorName;
    private javax.swing.JLabel showDoctorNameLable;
    private javax.swing.JTable showDoctorsTable;
    // End of variables declaration
}
