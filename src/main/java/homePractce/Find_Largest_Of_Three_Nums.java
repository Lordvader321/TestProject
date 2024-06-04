package homePractce;

import java.util.Scanner;

public class Find_Largest_Of_Three_Nums {
    public static void main(String[] args) {
        Scanner sacnner = new Scanner(System.in);
        System.out.println("Enter Number one ");
        int num1 = sacnner.nextInt();
        System.out.println("Enter Number two");
        int num2 = sacnner.nextInt();
        System.out.println("Enter Number three");
        int num3 = sacnner.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println(num1 + " Is largest");
        } else if (num2>num3) {
            System.out.println(num2 + " is largest");

        }else System.out.println(num3 + " is largest");
    }
}
