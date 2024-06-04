package exam_Prep;

public class Prep1 {
    public static void main(String[] args) {

        int num1 = 999;
        int num2 = 555;
        int num3 = 666;
        double dec1 = 99.99;
        char char1 = '#';
        System.out.println("Sum is " + (char1 + num1));

        boolean bool = true;

        System.out.println(5 > 4);

        if (num1 < num2 && num2 < num1) {
            System.out.println(num1 + " is the smallest number");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println(num2 + " is the smallest number");

        } else System.out.println(num3 + " is the smallest number");

        int month = 3;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            default:
                System.out.println("No match");
        }
        for (int i = 1; i < 5; i++) {
            System.out.println(i + 2);
        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                sum = sum + i;


            }

        }
        System.out.println(sum);


        int leapYear = 0;
        for (int i = 1911; i <= 2024; i++) {
            if (i % 4 == 0) {
                System.out.println("Year:" + i);
                leapYear++;
            }

        }
        System.out.println(leapYear);

        int i =15;
        do {
            System.out.println(i);
            i++;
        }while (i<5);

        i = 15;
        while (i<=20){
            System.out.println("inside while loop " + i);
            if (i == 18) {
                break;

            }
            i++;
        }
        System.out.println(i);
    }
}
