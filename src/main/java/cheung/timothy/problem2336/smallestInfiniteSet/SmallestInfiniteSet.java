package cheung.timothy.problem2336.smallestInfiniteSet;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class SmallestInfiniteSet {

    private final Set<Integer> addedBackSet;
    private final PriorityQueue<Integer> addedBackQueue;
    private int smallestNum;

    public SmallestInfiniteSet() {
        this.addedBackSet = new HashSet<>();
        this.addedBackQueue = new PriorityQueue<>();
        this.smallestNum = 1;
    }

    public int popSmallest() {
        if (addedBackQueue.peek() == null || smallestNum < addedBackQueue.peek()) {
            return smallestNum++;
        } else {
            int smallest = addedBackQueue.poll();
            addedBackSet.remove(smallest);
            return smallest;
        }
    }

    public void addBack(int num) {
        if (!addedBackSet.contains(num) && num < smallestNum) {
            addedBackSet.add(num);
            addedBackQueue.add(num);
        }
    }
}
