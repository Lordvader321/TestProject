package pntretake;

public class Array2 {
    public static void main(String[] args) {
        //print only the odd numbers in the array
        int[] numbers = {9, 6, 3, 2, 5, 4, 9};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 == 1){
                System.out.println(numbers[i]);
            }

        }

    }
}
