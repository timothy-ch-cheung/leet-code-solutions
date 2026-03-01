package cheung.timothy.problem0039.combinationSum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<ResultCandidate> resultCandidates = new ArrayList<>();
        resultCandidates.add(new ResultCandidate(new ArrayList<>(), 0));

        int candidatesOffset = 0;
        while (!resultCandidates.isEmpty()) {
            List<ResultCandidate> newCandidates = new ArrayList<>();
            for (int i = candidatesOffset; i < candidates.length; i++) {
                boolean candidateUsed = false;
                for (ResultCandidate resultCandidate: resultCandidates) {
                    int sum = resultCandidate.total + candidates[i];
                    if (resultCandidate.total == target) {
                        result.add(resultCandidate.solutionCandidate);
                    } else if (sum <= target && (resultCandidate.solutionCandidate.isEmpty() || resultCandidate.solutionCandidate.get(resultCandidate.solutionCandidate.size()-1) <= candidates[i])) {
                        List<Integer> validCandidate = new ArrayList<>(resultCandidate.solutionCandidate);
                        validCandidate.add(candidates[i]);
                        newCandidates.add(new ResultCandidate(validCandidate ,sum));
                        candidateUsed = true;
                    }
                }
                if (!candidateUsed) {
                    candidatesOffset++;
                }
            }
            resultCandidates = newCandidates;
        }

        return result;
    }

    private record ResultCandidate(List<Integer> solutionCandidate, Integer total){}
}
