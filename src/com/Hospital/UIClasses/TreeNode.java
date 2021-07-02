package com.Hospital.UIClasses;

import com.Hospital.Core_Classes.Doctors;
import com.Hospital.Core_Classes.Patient;

class TreeNode {
    public Patient patientData;
    public Doctors doctorData;
    private TreeNode leftLink;
    private TreeNode rightLink;
    //Constructor  for Patient------------------------------------------------------------------------------------------
    protected TreeNode(Patient patientData) {
        this.leftLink = this.rightLink = null;
        this.patientData = patientData;
    }
    //Constructor  for Doctor------------------------------------------------------------------------------------------
    protected TreeNode(Doctors doctorData) {
        this.leftLink = this.rightLink = null;
        this.doctorData = doctorData;
    }
    //Getters-----------------------------------------------------------------------------------------------------------
    /**
     * @return the Left Link of Node using in Binary Tree: Data Structure
     */
    public TreeNode moveToLeft() { return leftLink; }
    /**
     * @return the Right Link of Node using in Binary Tree: Data Structure
     */
    public TreeNode moveToRight() { return rightLink; }
    //Setters-----------------------------------------------------------------------------------------------------------
    public void setLeftLink(TreeNode leftLink) { this.leftLink = leftLink; }
    public void setRightLink(TreeNode rightLink) { this.rightLink = rightLink; }
    //==================================================================================================================
}
