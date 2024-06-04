package homePractce;

public class Even_And_Odd_inNumber {
    public static void main(String[] args) {
        int num = 7312;
        int evenCount = 0;
        int oddCount = 0;

        while (num>0){
            int remainder = num%10;
            if (remainder%2==0){
                evenCount++;
            }else oddCount++;
            num = num/10;
        }
        System.out.println("NUMBER OF EVEN DIGITS: " + evenCount);
        System.out.println("NUMBER OF ODD DIGITS: " + oddCount);
    }
}
