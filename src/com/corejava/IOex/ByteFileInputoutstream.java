package com.corejava.IOex;

import java.io.*;

public class ByteFileInputoutstream {

    public static void fileReader() throws IOException {

        byte[] array=new byte[100];

        InputStream is=new FileInputStream("Altaf.txt");

        is.read(array);  // Read the Content

        is.available(); // Checking the file is available or not

        is.skip(0l);

       // is.mark(8);


        int flag= is.available();

        if(flag==0){

        }

        System.out.println(flag);

        String str= new String(array);

        System.out.println(str.trim());

        is.close();

    }


    public static void outpufileReader() throws IOException {


        String value="Pawan Kalyan is a new Dupty CM ";

        OutputStream os=new FileOutputStream("Altaf.txt");

        byte[] array=value.getBytes();

        os.write(array);


        os.close();

    }

    public static void main(String[] args) throws IOException {
        //fileReader();
        outpufileReader();
    }
}
