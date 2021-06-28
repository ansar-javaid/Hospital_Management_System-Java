package com.Hospital.UIClasses;

import com.Hospital.Core_Classes.Patient;

class TreeNode {
    public Patient data;
    private TreeNode leftLink;
    private TreeNode rightLink;
    //Constructor-------------------------------------------------------------------------------------------------------
    protected TreeNode(Patient data) {
        this.leftLink = this.rightLink = null;
        this.data = data;
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
