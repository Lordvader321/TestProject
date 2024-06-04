package homePractce;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        int [] num = {100,200,300,400,500,600,700,800};
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (count > 500) {
                count++;

            }

        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = scanner.nextInt();

        int rev = 0;
        while (num1!=0){
            rev = rev*10 + num1%10;
            num1 = num1/10;
        }
        System.out.println("Revers number is: " + rev);


    }
}
