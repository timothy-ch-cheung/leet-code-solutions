package cheung.timothy.problem00841.keysAndRooms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        List<Node> graph = new ArrayList<>();
        for (int i = 0; i< rooms.size(); i++) {
            graph.add(new Node(i));
        }
        for (int i = 0; i< rooms.size(); i++) {
            for (Integer key: rooms.get(i)) {
                graph.get(i).addNeighbour(graph.get(key));
            }
        }
        Set<Node> visited = new HashSet<>();
        visit(graph.get(0), visited);
        return visited.size() == rooms.size();
    }

    private void visit(Node node, Set<Node> visited) {
        if (visited.contains(node)) {
            return;
        }
        visited.add(node);
        for (Node currNode: node.neighbours) {
            visit(currNode, visited);
        }
    }
}
