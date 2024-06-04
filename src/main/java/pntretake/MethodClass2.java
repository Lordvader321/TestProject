package pntretake;

public class MethodClass2 {
    public static void main(String[] args) {
        int [] numbers = {4,6,7,5,3,9,12};
        int [] number2 = {2,4,6,8,10,12,9,8};
        int sum = getSum(numbers);
        printLargerArray(numbers,number2);
        System.out.println(sum);




    }

    public static void printLargerArray(int[] num1, int[] nums2){
        if (num1.length>nums2.length){
            System.out.println("First array is larger");
        }else System.out.println("Second array is larger");
    }


    public static int getSum(int [] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    public static int getEven(int [] nums){
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                return nums[i];

            }else return nums [i];

        }
        return even;
    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile && bSmile){
            return true;
        }else if (!aSmile && !bSmile){
            return true;
        }else return false;


    }

}
