package com.corejava.condition;

public class Switchexample {

    public void switchExample(){

        int number=3;

        switch (number){
            case 1:
                System.out.println(" first condition");
                break;
            case 2:
                System.out.println(" second condition");
                break;
            case 3:
                System.out.println(" third condition");
                break;
            case 4:
                System.out.println(" fourth condition");
                break;
            default:
                System.out.println("No Condition");
        }
    }

    public void switchweekExample(){

        String day="Wenesday";

        switch (day){
            case "Monday":
                System.out.println(" Monday");
                break;
            case "Tuesday":
                System.out.println(" Tuesday");
                break;
            case "Wenesday":
                System.out.println(" wenesday");
                break;
            case "Thursaday":
                System.out.println(" Thursaday");
                break;
            case "Friday":
                System.out.println(" Friday");
                break;
            case "Saturday":
                System.out.println(" Saturday");
                break;
            case "Sunday":
                System.out.println(" Sunday");
                break;
            default:
                System.out.println("No Condition");
        }
    }
    public static void main(String[] args) {

        Switchexample swi= new Switchexample();

        swi.switchweekExample();
    }
}
