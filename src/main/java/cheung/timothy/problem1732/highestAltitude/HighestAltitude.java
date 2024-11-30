package cheung.timothy.problem1732.highestAltitude;

public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude =0;
        for (int currGain: gain) {
            currentAltitude += currGain;
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }
        return maxAltitude;
    }
}
