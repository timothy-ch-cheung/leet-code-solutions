package cheung.timothy.problem0605.canPlaceFlowers;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int spaces = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (isFree(flowerbed, i)) {
                spaces++;
                flowerbed[i] = 1;
            }
        }
        return n <= spaces;
    }

    private boolean isFree(int[] flowerbed, int idx) {
        int left = idx - 1;
        int right = idx + 1;
        if (left < 0 && right > flowerbed.length - 1) {
            return flowerbed[idx] == 0;
        } else if (left < 0) {
            return flowerbed[idx] == 0 && flowerbed[right] == 0;
        } else if (right > flowerbed.length - 1) {
            return flowerbed[idx] == 0 && flowerbed[left] == 0;
        } else {
            return flowerbed[idx] == 0 && flowerbed[left] == 0 && flowerbed[right] == 0;
        }
    }
}
