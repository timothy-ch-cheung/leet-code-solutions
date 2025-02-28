package cheung.timothy.problem0933.numberOfRecentCalls;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    private final Queue<Integer> pings;

    public RecentCounter() {
        this.pings = new LinkedList<>();
    }

    public int ping(int t) {
        pings.offer(t);
        while (!pings.isEmpty() && pings.peek() < t -3000) {
            pings.poll();
        }
        return pings.size();
    }
}

