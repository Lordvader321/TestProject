package pntretake;

import java.util.Scanner;

public class scannwepractice2 {
    public static void main(String[] args) {
        for(int i= 0; i <=5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number : ");
            int num1 = scanner.nextInt();
            System.out.println("Enter Second Number");
            int num2 = scanner.nextInt();

            System.out.println(" press 1 -> Add, 2 -> sub, 3-> Multi, 4-> Div, 5->Exit");
            int operations = scanner.nextInt();

            if (operations == 1) {
                System.out.println("Add + " + (num1 + num2));

            } else if (operations == 2) {
                System.out.println("Sub + " + (num1 - num2));

            } else if (operations == 3) {
                System.out.println("Multi " + (num1 * num2));

            } else if (operations == 4) {
                System.out.println("Div " + (num1 / num2));


            } else if (operations == 5) {
                System.out.println("GoodBye");
                 i = 87;

            } else System.out.println("Invalid Number............");
            i--;
        }
    }
}

