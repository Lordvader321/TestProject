package homePractce;

import java.util.Scanner;

public class ScannerLoancalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String loanApproval = "approved";
        int percentage = 0;
        System.out.println("Enter your Age");
        int homeValue = scanner.nextInt();
        System.out.println("Enter down payment");
        int downPayment = scanner.nextInt();
        System.out.println("Enter loan term");
        int loanTerm = scanner.nextInt();
        System.out.println("Enter interest");
        int interest = scanner.nextInt();
        System.out.println("Enter state");
        String state = scanner.next();
        System.out.println("Enter credit score");
        int creditScore = scanner.nextInt();



    }
}
