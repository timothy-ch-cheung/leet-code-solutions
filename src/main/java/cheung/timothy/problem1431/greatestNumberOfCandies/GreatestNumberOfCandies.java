package cheung.timothy.problem1431.greatestNumberOfCandies;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int max = 0;
        for (int candy : candies) {
            if (max < candy) {
                max = candy;
            }
        }
        for (int i = 0; i < candies.length; i++) {
            result.add(i, candies[i] + extraCandies >= max);
        }
        return result;
    }

}
