package pntretake;

public class MethodClass {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 6;
        int sum = num1+num2;

        System.out.println(sum);
        System.out.println("Hello");
        System.out.println("World");

        addSum();
        addSum2(9,8);
        addSum2(70,90);
        addSquare(2);
        largerNum(100,20);
        int lNum = returnLargerNumber(90,91);
        System.out.println(lNum + " Main Method");
        int num = 200;
        System.out.println("Sub is " + (num- lNum));

    }

    public static void addSum(){
        int num1 = 9;
        int num2 = 7;
        int sum = num1+num2;
        System.out.println(sum);
    }
    public static void addSum2(int num1, int num2){
        int sum = num1+num2;
        System.out.println("sum is " + sum);

    }

    public static void addSquare(int num1){
        int square = num1*num1;
        System.out.println("square is " + square);
    }

    public static void largerNum(int num1, int num2){
        if (num1 > num2) {
            System.out.println("Is larger number " + num1);
        }else System.out.println("is larger number " + num2 );

    }

    public static int returnLargerNumber(int num1, int num2){
        if (num1 > num2) {
            return num1;

        }else {
            return num2;
        }
    }
}
