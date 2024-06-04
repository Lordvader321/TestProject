package org.example;

public class DigitCounter {
    public static void main(String[] args) {



        long number = 1234567890L;


        int numberOfDigits = countDigits(number);


        System.out.println("The number " + number + " has " + numberOfDigits + " digits.");
    }

    public static int countDigits(long number) {
        if (number == 0) return 1;
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    }
