package exam_Prep;

import java.util.Scanner;

public class Examq2 {//Get the starting point and ending point of a loop from the console. Print all the numbers  from the starting and ending point which can be divisible by 3(you don't need to show more than 5 numbers). -3

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting point");
        int startingPoint = scanner.nextInt();
        int endingPoint = scanner.nextInt();

        for (int i = startingPoint; i < endingPoint; i++) {


                System.out.println(i);

        }
    }
}