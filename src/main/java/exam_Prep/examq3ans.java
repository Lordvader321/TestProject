package exam_Prep;

import java.util.Scanner;

public class examq3ans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter starting point");
        int num1 = scanner.nextInt();
        System.out.println("Enter ending point");
        int num2 = scanner.nextInt();
        int count = 0;

        for(int i = num1; i<num2; i++){
            if (i%3==0){
                System.out.println(i);
                count++;
            }
            if (count==5){
                break;
            }
        }
    }
}
