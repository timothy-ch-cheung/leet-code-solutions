package cheung.timothy.problem1657.stringCloseness;

import java.util.*;

public class StringCloseness {
    public boolean closeStrings(String word1, String word2) {
        WordStats wordStats1 = getWordStats(word1);
        WordStats wordStats2 = getWordStats(word2);

        return wordStats1.characters.equals(wordStats2.characters) && wordStats1.charCount.equals(wordStats2.charCount);
    }

    private WordStats getWordStats(String word) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (!charMap.containsKey(word.charAt(i))) {
                charMap.put(word.charAt(i), 1);
            } else {
                charMap.put(word.charAt(i), charMap.get(word.charAt(i)) + 1);
            }
        }

        List<Character> characters = new ArrayList<>(charMap.keySet());
        Collections.sort(characters);
        List<Integer> charCount = new ArrayList<>(charMap.values());
        Collections.sort(charCount);
        return new WordStats(characters, charCount);
    }

    static class WordStats {

        public WordStats(List<Character> characters, List<Integer> charCount) {
            this.characters = characters;
            this.charCount = charCount;
        }

        public List<Character> characters;
        public List<Integer> charCount;

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof WordStats wordStats) {
                return this.characters.equals(wordStats.characters) && this.charCount.equals(wordStats.charCount);
            }
            return false;
        }
    }
}
