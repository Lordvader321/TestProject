package exam_Prep;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        //Get 2 numbers from the console (program must make sure numbers are within 50 and 100) then tell which number is bigger. -2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = scanner.nextInt();
        System.out.println("Enter Number 2");
        int num2 = scanner.nextInt();
        int range = 0;




        if (num1 > num2) {
            System.out.println( num1 + " is greater");

        }else System.out.println(num2 + " is greater");


    }
}
