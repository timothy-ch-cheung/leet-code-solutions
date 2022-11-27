package cheung.timothy.problem11.mostWater;

public class ContainerWithMostWater {

    public int maxArea(int[] lines) {
        int i = 0;
        int j = lines.length - 1;
        int max = 0;

        while (i != j) {
            int area = (j - i) * Math.min(lines[i], lines[j]);
            max = Math.max(max, area);
            if (lines[i] > lines[j]) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }
}
