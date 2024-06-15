package com.corejava.IOex;

import java.io.File;
import java.io.IOException;

public class FileOperatiosn {

    public static void filecreation()  {


        try {
            File fil = new File("test.txt");

            boolean valie = fil.createNewFile();

            if (valie) {
                System.out.println("new file is created ");
            } else {
                fil.delete();
                System.out.println("new file is not created ");
            }
        }catch (Exception e){

        }
    }

    public static void main(String[] args)  {
        filecreation();
    }


}
