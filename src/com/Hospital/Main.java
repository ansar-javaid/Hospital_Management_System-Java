package com.Hospital;

import com.Hospital.SearchingAndModiciation_Classes.ModifyEntities;
import com.Hospital.UIClasses.Login_Screen;
import com.itextpdf.text.List;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Login_Screen login=new Login_Screen();
        login.setVisible(true);

        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                try { UIManager.setLookAndFeel(info.getClassName()); } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {}
                break;
            }
        }

    }


}
