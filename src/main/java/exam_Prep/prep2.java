package exam_Prep;

public class prep2 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int[] numbers = {2,9,8,6,25,7,5,3,9};
        //System.out.println(numbers.length);
        int sum = 0;
        for (int i = 0; i <numbers.length ; i++) {
            sum = sum + numbers[i];
            if (sum>50){
                System.out.println("Index Number " + i);
                break;

            }
        }
        System.out.println(sum);
    }

    //Given two int values, return their sum. Unless the two values are the same, then return double their sum.

    public int sumDouble(int a, int b) {
        int sum=0;
        if (a==b){
            return a+b * sum;

        } else{
            return a+b;
        }

    }

}
