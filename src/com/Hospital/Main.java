package com.Hospital;

import com.Hospital.SearchingAndModiciation.ModifyEntities;

public class Main {

    public static void main(String[] args)  {
        ModifyEntities modifyEntities=new ModifyEntities();
        modifyEntities.searchEntities.searchPatientByDocid("1246");

    }

}
