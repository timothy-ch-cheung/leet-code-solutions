package cheung.timothy.problem0547.numberOfProvinces;

import java.util.HashSet;
import java.util.Set;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        Set<Integer> visited = new HashSet<>();
        int count = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (visited.contains(i)) {
                continue;
            }
            dfs(isConnected, i, visited);
            count++;
        }
        return count;
    }

    private void dfs(int[][] isConnected, int currentNode, Set<Integer> visited) {
        if (visited.contains(currentNode)) {
            return;
        }
        visited.add(currentNode);
        for (int i = 0; i < isConnected.length; i++) {
            if (i == currentNode) {
                continue;
            }
            if (isConnected[currentNode][i] == 1) {
                dfs(isConnected, i, visited);
            }
        }
    }
}
