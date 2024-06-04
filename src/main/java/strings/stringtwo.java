package strings;

public class stringtwo {
    public static void main(String[] args) {
        String[] countries = {"Bangladesh", "USA", "France", "India", "Italy"};
        int count = 0;
        for (int i = 0; i < countries.length; i++) {
            String country = countries[i];
            for (int j = 0; j < country.length(); j++) {
                if (country.charAt(j) =='a'){
                    count++;
                }
            }


        }
        System.out.println(count);
            int max = 0;
            int index = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].length()>max){
                max = countries[i].length();
                index = i;

            }


        }
        System.out.println(countries[index]);

        String city1 = "New York";
        String city2 = "New York";

        if(city1.equals(city2)){
            System.out.println("Equal");
        }else System.out.println("Not Equal");


        System.out.println(city1.contains("New"));

    }
}
