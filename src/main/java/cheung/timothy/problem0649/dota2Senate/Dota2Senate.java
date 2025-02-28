package cheung.timothy.problem0649.dota2Senate;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        Queue<Character> voting = new LinkedList<>();
        for (int i = 0; i < senate.length(); i++) {
            voting.offer(senate.charAt(i));
        }
        int banDire = 0;
        int banRadiant = 0;
        while (voting.size() > 1) {
            char curr = voting.poll();
            if (curr == 'D') {
                if (banRadiant > 0) {
                    banRadiant--;
                } else {
                    banDire++;
                    voting.offer(curr);
                }
            } else {
                if (banDire > 0) {
                    banDire--;
                } else {
                    banRadiant++;
                    voting.offer(curr);
                }
            }
            if (banDire > senate.length() || banRadiant > senate.length()) {
                break;
            }
        }
        assert !voting.isEmpty();
        if (voting.peek() == 'D') {
            return "Dire";
        } else {
            return "Radiant";
        }
    }
}
