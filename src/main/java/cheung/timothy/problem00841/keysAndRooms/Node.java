package cheung.timothy.problem00841.keysAndRooms;

import java.util.HashSet;
import java.util.Set;

public class Node {
    Set<Node> neighbours;
    int val;

    public Node(int val) {
        this.val = val;
        this.neighbours = new HashSet<>();
    }

    public void addNeighbour(Node node) {
        neighbours.add(node);
    }
}
