package com.corejava.stringex;

public class Stringsex {

    static void stringcompare(){

        String value="Ramesh";
        String value1=new String("Ramesh");
        System.out.println(value);
        System.out.println(value1);
    }


    static void stringlen(){

        String lvalue= "Ramesh is a softeare engineer";

        System.out.println(lvalue.length());

    }

    static void stringsub(){

        String lvalue= "Ramesh is a softeare engineer";

        System.out.println(lvalue.substring(0,6));

    }

    static void stringtrim(){

        String lvalue= "      Ramesh is a software engineer                 ";

        System.out.println(lvalue.trim());

    }

    static void stringcontain(){

        String lvalue= "      Ramesh is a software engineer                 ";

        if(lvalue.contains("Ramesh")){
            System.out.println(lvalue.trim());
        }else{
            System.out.println("No string found ");
        }


    }

    static void stringcontainequals(){

        String lvalue= "Ramesh is a software engineer";

        if(lvalue.contentEquals("Ramesh is a software engineer")){
            System.out.println(lvalue.trim());
        }else{
            System.out.println("No string found ");
        }


    }

    static void stringempty(){

        String lvalue= "";

        if(lvalue.isEmpty()){
            System.out.println("String is empty ");
        }else{
            System.out.println("No string found ");
        }


    }

    static void stringreplcae(){

        String lvalue= " Ram123 is Software Tester";

       System.out.println(lvalue.replace("123","esh"));

    }

    static void stringequal(){

        String lvalue= "Ram123 is Software Tester";
        String fvalue= new String("Ram123 is Software Tester");

        if(lvalue.equals(fvalue)){
            System.out.println(" string are equal");
        }else {
            System.out.println( "String are not equal");
        }

        if(lvalue==fvalue){
            System.out.println(" string are equal");
        }else {
            System.out.println( "String are not equal");
        }

        if(lvalue==fvalue){
            System.out.println(" string are equal");
        }else {
            System.out.println( "String are not equal");
        }


    }

    static void stringequalignore(){

        String lvalue= " Ram123 is SoftwAre Tester";

        String cvalue= " Ram123 is Software TesTer";

        if(lvalue.equalsIgnoreCase(cvalue)){
            System.out.println(" string are equal");
        }else {
            System.out.println( "String are not equal");
        }

    }

    static void stringuppercase(){

        String lvalue= " Ram123 is Software Tester";

        System.out.println(lvalue.toUpperCase());

    }

    static void stringlowercase(){

        String lvalue= " Ram123 is Software Tester";

        System.out.println(lvalue.toLowerCase());

    }

    static void stringsplit(){

        String lvalue= " Ram123 is Software Tester";

       String lvauearr[]=lvalue.split(" ");

       for (int i=0;i<lvauearr.length;i++){

           System.out.println(lvauearr[i]);
       }

    }

    static void stringindex(){

        String lvalue= " Ram123 is Software Tester";

   System.out.println(lvalue.indexOf('S'));
    }

    static void stringvalueo0f(){

        String lvalue= " Ram123 is Software Tester";

        System.out.println(lvalue.valueOf('S'));
    }


    static  void stringendswith(){

        String names[]={"ramesh","Mahesh","rajesh","Altaf","Kiran"};

        for (int i=0;i<names.length;i++){

            if(names[i].endsWith("esh")){
                System.out.println(names[i]);
            }else {
                System.out.println("no string found");
            }
        }

        for (int i=0;i<names.length;i++){

            if(names[i].startsWith("ra")){
                System.out.println(names[i]);
            }else {
                System.out.println("no string found");
            }
        }
    }


    static  void stringcharat(){
         String name="Ponneri Ramesh";

         char ch=name.charAt(4);

         for (int i=0;i<name.length();i++){

             System.out.println(name.charAt(i));
         }


    }
    static  void stringjoin(){
        String lname="Ponneri";
        String fnbame="Ramesh";

        System.out.println(lname.concat(fnbame));

        System.out.println(String.join(" ",lname, fnbame));

        System.out.println(lname+" "+fnbame);



    }

    static  void stringformat(){
        String str1 = String.format("%d", 101); // Integer value
        String str2 = String.format("%s", "Amar Singh"); // String value
        String str3 = String.format("%f", 101.00); // Float value
        String str4 = String.format("%x", 101); // Hexadecimal value
        String str5 = String.format("%c", 'c'); // Char value
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }

    public static void main(String[] args) {

        stringcompare();
        stringlen();
        stringsub();
        stringtrim();
        stringcontain();
        stringcontainequals();
        stringempty();
        stringreplcae();
        stringequal();
        stringequalignore();
        stringuppercase();
        stringlowercase();
        stringsplit();
        stringindex();
        stringvalueo0f();
        stringformat();
        stringendswith();
        stringcharat();
        stringjoin();

    }


}
