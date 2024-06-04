package strings;

import java.util.Arrays;
import java.util.Locale;

public class StringClass {
    public static void main(String[] args) {
        String name = "Shuvashish";
        System.out.println(name);
        String name1 = "A";
        char CHAR1 = 'A';
        int num = 9;

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("v"));

        System.out.println(name.replace('a', 'i'));
        System.out.println(name.replace("va", ".."));

        String[] countries = {"Bangladesh", "USA", "France", "India", "Italy"};
        String str = "Bangladesh , Usa, France, India, Italy";
        String[] countries2 = str.split(",");

        System.out.println(countries[2]);
        int sum = 0;

        for (int i = 0; i < countries.length; i++) {// loop to read the values in an array
            System.out.println(countries[i]);//i returns only the block size of an array (5)
            //countries[i] returns the values in the array it slef in this case its the name of the countries
            //bd, usa, fr, in,it
            sum = countries[i].length() + sum;//sum is now = to countries[i] (which is the name of the countries)
            //countries[i].length() its counting the indvivual characters in the array of countires
            //+sum now holds the value of the characters in the array


        }
        System.out.println(sum);
        int count = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries.length; j++) {
                if(countries[i].contains("a")){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
