package pntretake;

public class MethodClass3 {
    public static void main(String[] args) {
        addSum(9,3,10);
       // addSum(10,10);
        addSum(10,2.4);

    }

    public static void addSum(int num1, int num2){
       int sum = num1+num2;
        System.out.println("sum is " + sum);

    }

    public static void addSum(int num1, int num2, int num3){
        addSum(23,35);
        int sum = num1+num2+num3;
        System.out.println("sum is " + sum);
    }

    public static void addSum(int num1,double num2){
        double sum =  num1 + num2;
        System.out.println("sum is " + sum);
    }


}
