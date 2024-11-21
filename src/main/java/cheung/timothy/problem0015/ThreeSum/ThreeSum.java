package cheung.timothy.problem0015.ThreeSum;

import java.util.*;

public class ThreeSum {

    private int[] nums;
    private Map<Integer, ArrayList<Integer>> numMap;

    public List<List<Integer>> threeSum(int[] nums) {
        this.nums = nums;
        this.numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numMap.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                List<List<Integer>> triplets = getTriplet(i, j);
                if (triplets != null) {
                    results.addAll(triplets);
                }
            }
        }

        return getUniqueTriplets(results);
    }

    private List<List<Integer>> getTriplet(int i, int j) {
        List<Integer> potentialIndices = numMap.get(-(nums[i] + nums[j]));
        List<List<Integer>> matches = new ArrayList<>();

        if (potentialIndices == null) {
            return null;
        }

        for (Integer index: potentialIndices) {
            if (i != index && j != index) {
                matches.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[index])));
            }
        }
        return matches;
    }

    private List<List<Integer>> getUniqueTriplets(List<List<Integer>> results) {
        Set<Set<Integer>> triplets = new HashSet<>();
        List<List<Integer>> uniqueResults = new ArrayList<>();
        for (List<Integer> result: results) {
            Set<Integer> triplet = new HashSet<>(result);
            if (!triplets.contains(triplet)) {
                uniqueResults.add(result);
                triplets.add(triplet);
            }
        }

        return uniqueResults;
    }
}