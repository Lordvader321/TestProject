package exam_Prep;

public class examq3 {
    public static void main(String[] args) {

    }


    public static void getSumOf2Array(){
        int sum = 0;

        int[] numbers = {9, 6, 3, 2, 5, 4, 9};
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            System.out.println(numbers[i]);


        }
        System.out.println(sum);

    }
    public static int getSum(int [] num1, int [] num2){
        int sum = 0;
        for (int i = 0; i < num1.length; i++) {
            sum = sum + num1[i];
        }
        return sum;

//        for (int i = 0; i < num2.length; i++) {
//            sum = sum+num2[i];
//
//        }return sum;
    }
}
