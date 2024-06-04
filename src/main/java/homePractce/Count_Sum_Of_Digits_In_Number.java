package homePractce;

public class Count_Sum_Of_Digits_In_Number {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
        int count = 0;
        while (num>0){
           sum = sum+num%10;
           num=num/10;

        }
        System.out.println(sum);
    }
}
