package pntretake;

import java.util.Scanner;

public class scannerpractice {
    // create a calculator, the inputs(2) will be taken from the console
    //then it will ask for which operations I want to perform (1>+, 2>-,
    //3>*, 4>/ 5-> exit
//    public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter input 1");
//        int inPut1 = scanner.nextInt();
////        System.out.println("Enter addition");
////        char addition = (char) scanner.nextInt();
//        System.out.println("enter input 2");
//        int inPut2 = scanner.nextInt();
//        int result


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operations =9;
        do {
            System.out.println("Enter first number : ");
            int num1 = scanner.nextInt();
            System.out.println("Enter Second Number");
            int num2 = scanner.nextInt();

            System.out.println(" press 1 -> Add, 2 -> sub, 3-> Multi, 4-> Div, 5->Exit");
             operations = scanner.nextInt();

            switch (operations) {
                case 1:
                    System.out.println("Add" + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Sub" + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Milti" + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Div" + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Good Bye");
                    break;

                default:
                    System.out.println("Invalid number.............");
            }
        }while (operations!=5);





    }




    }

