package pntretake;

public class Firstpntretakeprojct {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String name = "Wass gud my G ";
        System.out.println(name);

        int num1 = 800;
        int num2 = 100;
        int num3 = 200;
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is larger");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is larger");

        } else {
            System.out.println(num3 + " is larger");

        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            //System.out.println(sum);
            if (sum >= 3000) {
                break;
            }


        }
        System.out.println(sum);

        int i = 1;
        do {
            System.out.println("Hello");
            i++;
        } while (i < 5);

        i = 1;
        while (i < 5) {
            System.out.println("Hello White");
            i++;
        }

        int j;
        for (j = 0; j < 10; j++) {
            i++;
            System.out.println(i);
            i++;

        }
        System.out.println(j + "end");



    }
}



