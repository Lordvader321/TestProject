package pntretake;

import java.util.Scanner;

public class pos_or_neg {
    public static void main(String[] args) {
        int num = -10;

        if (num>=0){
            System.out.println(num + " is positive ");
        } else  {
            System.out.println(num + " is negative");


        }

        int weekDay = 1;

        if (weekDay == 1 ){
            System.out.println("Monday");
        } else if (weekDay == 2) {
            System.out.println("Tuesday");

        } else if (weekDay== 3) {
            System.out.println("Wednesday");

        } else if (weekDay == 4) {
            System.out.println("Thursday");

        } else if (weekDay==5) {
            System.out.println("Friday");

        } else if (weekDay == 6) {
            System.out.println("saturday");


        } else if ( weekDay== 7) {
            System.out.println("Sunday");

        }else System.out.println("invalid weekday");


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number");
        int number1 = scanner.nextInt();
        System.out.println(" Enter another number");
        int number2 = scanner.nextInt();
        if (number2>number1){
            System.out.println( number2 + "is higher number");
        }else {
            System.out.println(number1 + "is higher number");
        }



    }



}
