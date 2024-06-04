package pntretake;

public class loops {
    public static void main(String[] args) {

        for (int i = 1; i<= 5; i= i+2 ){
            System.out.println("Hello");
            System.out.println("NewYork");
            System.out.println("value of i: " + i);
            System.out.println();
        }
           // int sum = 0;
        for (int i = 0; i <=10; i++) {
            if(i%2==0){
                int num = i;
                System.out.println(num + i + i );


            }



        }

        int sum = 0;
        for (int i = 0; i<=10; i++){
            if(i%2==0){
                sum = sum + i;

            }
        }
        System.out.println(sum);

        sum = 0;
        //int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            sum = sum + i;
            //System.out.println(sum);
            if(sum>= 3000){
                break;
            }


        }
        System.out.println(sum);








    }

    }



