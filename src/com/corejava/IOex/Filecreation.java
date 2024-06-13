package com.corejava.IOex;

import java.io.*;

public class Filecreation {

    public static void createafile() throws IOException {

        InputStream input =new FileInputStream("Altaf.txt");

        System.out.println("File was created ");

        System.out.println(input.read());

        input.close();
    }

    public static void main(String[] args) throws IOException {
        createafile();
    }
}
