package cheung.timothy.problem0039.combinationSum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<ResultCandidate> resultCandidates = new ArrayList<>();
        resultCandidates.add(new ResultCandidate(new ArrayList<>(), 0));

        while (!resultCandidates.isEmpty()) {
            List<ResultCandidate> newCandidates = new ArrayList<>();
            for (int i = 0; i < candidates.length; i++) {
                for (ResultCandidate resultCandidate : resultCandidates) {
                    int sum = resultCandidate.total + candidates[i];
                    List<Integer> solutionCandidate = resultCandidate.solutionCandidate;
                    if (sum <= target && (solutionCandidate.isEmpty() || solutionCandidate.get(solutionCandidate.size() - 1) <= candidates[i])) {
                        List<Integer> validCandidate = new ArrayList<>(solutionCandidate);
                        validCandidate.add(candidates[i]);
                        newCandidates.add(new ResultCandidate(validCandidate, sum));
                    }
                }

            }
            for (ResultCandidate resultCandidate : resultCandidates) {
                if (resultCandidate.total == target) {
                    result.add(resultCandidate.solutionCandidate);
                }
            }
            resultCandidates = newCandidates;
        }

        return result;
    }

    private record ResultCandidate(List<Integer> solutionCandidate, Integer total) {
    }
}
