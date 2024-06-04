package pntretake;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
//        int [] nums = new int[5];
//        nums[0]= 9;
//        nums[3]= 10;
//        nums[4]= nums[0] + nums [3];
//        System.out.println(nums[4]);
//        System.out.println(nums[1]);
        //print the sum of all the numbers in the array
        int sum = 0; // declare a varible
        //int max = 0;
        int[] numbers = {9, 6, 3, 2, 5, 4, 9}; // size of an array with values in each block
        for (int i = 0; i < numbers.length; i++) { // for loop
            sum = sum + numbers[i];// vairble sum now holds the value of numbers array, i is the loop with the block
            System.out.println(numbers[i]);


        }
        System.out.println(sum);// print the value of sum

        // print the highest value in the array
        int max = numbers[0]; // varible to hold value for max
        for (int i = 0; i < numbers.length; i++) {   // loop to run the array values
            if (numbers[i] > max) {    // compare numbers[i] array to max if the value in numbers[i] is grater than max then max will hold that value
                max = numbers[i];  // max now holds the largest number
                System.out.println(max);
            }

        }

        System.out.println(max);
    }
}

