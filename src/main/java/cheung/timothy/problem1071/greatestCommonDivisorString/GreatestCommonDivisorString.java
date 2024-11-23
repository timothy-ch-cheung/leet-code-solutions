package cheung.timothy.problem1071.greatestCommonDivisorString;

public class GreatestCommonDivisorString {

    public String gcdOfStrings(String str1, String str2) {
        if (str1.equals(str2)) {
            return str1;
        }
        String smaller;
        String larger;
        if (str1.length() > str2.length()) {
            smaller = str2;
            larger = str1;
        } else {
            smaller = str1;
            larger = str2;
        }

        if (larger.startsWith(smaller)) {
            return gcdOfStrings(smaller, larger.substring(smaller.length()));
        }
        return "";
    }
}
