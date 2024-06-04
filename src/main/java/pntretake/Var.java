package pntretake;

import java.util.Scanner;

public class Var {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println("How are you");
//
//        int num1 = 8;
//        System.out.println(num1);
//
//        num1= 19;
//        System.out.println(num1);
//
//        double d1 = 12;
//        System.out.println(d1);
//
//        d1 = (double) 11/3;/// casting explicitly tell java to return a double value
//        System.out.println(d1);
//
//        int num2 = 9;
//        System.out.println("The value is: " + num2);

        int num1 = 9;
        num1 = 10;
        num1 = num1 + num1;
        System.out.println(num1);

        double num2 = num1 + 3.5;
        System.out.println(num2);

        num1 = 2 + 6 * 5 / 2;
        System.out.println(num1);

        boolean bool = true;
        bool = false;

        if (6 > 7) {
            System.out.println("I am not feeling good");

        } else System.out.println("I am feeling good");

//        int a = 50;
//        int b = 600;
//        int c = 70;
//
//        if (a > b && a > c) {
//            System.out.println(a + " Is larger");
//
//        } else if (b > a && b > c) {
//            System.out.println(b + " Is larger");
//
//        } else System.out.println(c + " Is larger");
//
//        int grade = 1000;
//
//        if (grade > 100 || grade < 0) {
//            System.out.println("invalid grade");
//            {
//
//
//            }
//            if (grade >= 90 && grade <= 100) {
//                System.out.println("A");
//            } else if (grade >= 80 && grade <= 89) {
//                System.out.println("B");
//            } else if (grade >= 70 && grade <= 79) {
//                System.out.println("C");
//
//            } else if (grade >= 60 && grade <= 69) {
//                System.out.println("D");
//
////        } else if (grade>100 || grade<0) {
////            System.out.println("invalid grade");
//
//            } else System.out.println("grade is F");


            int num3 = -10;
            if (num3 < 0) {
                System.out.println("neg num");
            } else System.out.println("pos num");

            int num5 = 30;
            int num6 = 40;

            if (num5 >= 30 || num6 >= 30) {
                System.out.println("Got it");

            } else System.out.println("Did not get it");

            int sal = 50000;
//
//            if (sal > 1000) {
//                System.out.println("High salary");
//                if (sal >= 5000 || sal<=3000){
//                    System.out.println();
//                }
//
//
//            }else System.out.println(" low salary");

            if (sal>3000 && sal <50000){

                 if (sal>10000){
                    System.out.println("high sal");

                }else {
                    System.out.println("low sal");
                }
            }else {
                System.out.println("invalid salary range");
            }


            int grade = 100;
            if (grade>100 || grade<0){
                System.out.println("Invalid grade");
            } else if (grade>=90 && grade<100) {
                System.out.println("A");

            }if (grade>=80 && grade<=89){
            System.out.println("B");
        }else System.out.println("F");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = 15;
        System.out.println(num);



    }
}






