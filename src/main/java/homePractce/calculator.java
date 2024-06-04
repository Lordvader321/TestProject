package homePractce;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {



            Scanner scanner = new Scanner(System.in);
            int operators = 10;
            do {
            System.out.println("Enter Number");
            int num1 = scanner.nextInt();
            System.out.println("Enter next number");
            int num2 = scanner.nextInt();
            System.out.println("Enter operator 1 +.>, 2 -.>, 3 *.>, 4 /.> 5 Exit-> ");
            int operator = scanner.nextInt();
            if (operator == 1) {
                System.out.println("Addition " + (num1 + num2));
            } else if (operator == 2) {
                System.out.println("Subtraction " + (num1 - num2));
            } else if (operator == 3) {
                System.out.println("Multiply " + (num1 * num2));
            } else if (operator == 4) {
                System.out.println("Divide " + (num1 / num2));
            } else if (operator == 5) {
                System.out.println("Good Bye");
            } else System.out.println("invalid choice");

        } while  (operators == 5);
    }
}

