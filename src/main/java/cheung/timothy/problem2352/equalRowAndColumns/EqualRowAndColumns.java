package cheung.timothy.problem2352.equalRowAndColumns;

import java.util.*;

public class EqualRowAndColumns {

    public int equalPairs(int[][] grid) {
        Map<List<Integer>, Integer> rowCache = new HashMap<>();
        for (int[] row : grid) {
            List<Integer> rowList = Arrays.stream(row).boxed().toList();
            if (rowCache.containsKey(rowList)) {
                rowCache.put(rowList, rowCache.get(rowList) + 1);
            } else {
                rowCache.put(rowList, 1);
            }
        }
        int totalPairs = 0;
        for (int x = 0; x < grid[0].length; x++) {
            List<Integer> colList = new ArrayList<>(grid.length);
            for (int y = 0; y < grid.length; y++) {
                colList.add(grid[y][x]);
            }
            if (rowCache.containsKey(colList)) {
                totalPairs += rowCache.get(colList);
            }
        }
        return totalPairs;
    }
}
