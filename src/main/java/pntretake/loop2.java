package pntretake;

import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);/// scanner class
        System.out.println("Enter your number:");// message in the consoul
        int endNumber = scanner.nextInt();// in putting number in the scanner

        for (int i = 1; i < endNumber; i++) {//condition placed
            System.out.println(i);

        }

        System.out.println("Enter your start number");
    //Scanner scanner1 = new Scanner(System.in);
       // System.out.println("Enter your number");
        int startNumber = scanner.nextInt();
        System.out.println("enter your ending number");
        int endingNumber = scanner.nextInt();

        for (int i = startNumber; i < endingNumber; i++) {
            if (i%3==0){
                System.out.println(i);
            }
        }

       // int lastNumber = scanner1.nextInt();






    }


}
