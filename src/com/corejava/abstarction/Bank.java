package com.corejava.abstarction;

import com.sun.tools.javac.Main;

public class Bank {

    public static void main(String[] args) {

        HDFCbank hdfc= new HDFCbank();
        ICICIBank icic=new ICICIBank();
        SBIBank sbi=new SBIBank();

        hdfc.getintrestrate();
        icic.getintrestrate();
        sbi.getintrestrate();
    }
}
