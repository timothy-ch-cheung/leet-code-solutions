package cheung.timothy.problem0012;

public class IntegerToRoman {

    private record intRoman(int num, String roman){}

    private static final intRoman[] INT_TO_ROMAN_LIST = {
            new intRoman(1000, "M"),
            new intRoman(900, "CM"),
            new intRoman(500, "D"),
            new intRoman(400, "CD"),
            new intRoman(100, "C"),
            new intRoman(90, "XC"),
            new intRoman(50, "L"),
            new intRoman(40, "XL"),
            new intRoman(10, "X"),
            new intRoman(9, "IX"),
            new intRoman(5, "V"),
            new intRoman(4, "IV"),
            new intRoman(1, "I"),
    };

    public String intToRoman(int num) {
        for (intRoman pair: INT_TO_ROMAN_LIST) {
            if (pair.num <= num) {
                int repeats = num/pair.num;
                return pair.roman.repeat(repeats) + intToRoman(num-(pair.num * repeats));
            }
        }
        return "";
    }
}
