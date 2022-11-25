package cheung.timothy.problem5.longestPalindrome;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LongestPalindromeSolution {

    public String longestPalindrome(String s) {
        String[] stringList = s.split("");
        List<String> palindromes = new ArrayList<>();
        for (int i = 0; i < stringList.length; i++) {
            palindromes.add(checkOddPalindrome(stringList, i));
            palindromes.add(checkEvenPalindrome(stringList, i, i + 1));
        }
        return palindromes.stream().max(Comparator.comparingInt(String::length)).orElse("");
    }

    private String checkOddPalindrome(String[] stringList, int center) {
        return checkEvenPalindrome(stringList, center, center);
    }

    private String checkEvenPalindrome(String[] stringList, int leftCenter, int rightCenter) {
        if (rightCenter >= stringList.length || !stringList[leftCenter].equals(stringList[rightCenter])) {
            return stringList[leftCenter];
        }
        int i = leftCenter - 1;
        int j = rightCenter + 1;

        StringBuilder sb = new StringBuilder();
        while (i >= 0 && j < stringList.length) {
            if (stringList[i].equals(stringList[j])) {
                sb.append(stringList[i]);
            } else {
                break;
            }
            i--;
            j++;
        }

        String result = sb.toString();
        String center = stringList[leftCenter];
        if (rightCenter == leftCenter) {
            return sb.reverse().append(center).append(result).toString();
        } else {
            return sb.reverse().append(center).append(center).append(result).toString();
        }
    }
}
