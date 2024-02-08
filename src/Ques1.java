//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.List;

public class Ques1 {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        // Call the kidsWithCandies method
        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        // Print the result
        System.out.println("Kids with candies: " + result);
    }
        public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int max = candies[0];
            List<Boolean> booleanList = new ArrayList<>();
            for(int i = 1 ; i < candies.length ;i++) {
                if(candies[i] > max) {
                    max = candies[i];
                }
            }
            for(int i = 0 ; i < candies.length ;i++) {
                if(candies[i] + extraCandies >= max ) {
                    booleanList.add(true);
                } else {
                    booleanList.add(false);
                }
            }
            return booleanList;
    }
}