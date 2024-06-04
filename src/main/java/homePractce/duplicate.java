package homePractce;

public class duplicate {
    public static void main(String[] args) {
        int [] nums = {2,6,9,8,2,3,6,2};
        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    System.out.println("duplicate number" + nums[i]);

                }
            }

        }
    }
}
