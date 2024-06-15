package com.corejava.IOex;

import java.io.*;

public class CharinputoutputStream {

    public static void charfileReader() throws IOException {

        char[] ch= new char[100];

        Reader in = new FileReader("Altaf.txt");

        in.read(ch);

        System.out.println(ch);

        in.close();
    }

    public static void charfilewriter() throws IOException {




        String value = "Kiran is from Kavali ";

        Writer in = new FileWriter("Altaf.txt");

        in.write(value);

        in.close();
    }

    public static void main(String[] args) throws IOException {
        charfileReader();

        charfilewriter();
    }
}
