package homePractce;

public class Homearraypractice {
    public static void main(String[] args) {
        int [] array = {100,200,300,400,500,600,700};// sum of an array
        int sum = array[0];
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
           // System.out.println(array[i]);

        }
        System.out.println(sum);

        int multiple = array[0];// array multiplied
        for (int i = 0; i < array.length; i++){
            multiple = multiple * array[i];
        }
        System.out.println(multiple);

        int max = array[0];// max number in an array
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>max){
                max = array[i];
            }

        }
        System.out.println(max);

        int min = array[0];// min number of an array
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }

        }
        System.out.println(min);
    }
}
