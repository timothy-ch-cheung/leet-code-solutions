package cheung.timothy.problem1926.nearestExitInMaze;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class NearestExitInMaze {

    private static final char SPACE = '.';
    private static final char WALL = '.';

    private int maxHeight;
    private int maxWidth;

    public int nearestExit(char[][] maze, int[] entrance) {
        maxHeight = maze.length;
        maxWidth = maze[0].length;

        Set<Coord> visited = new HashSet<>();
        Queue<Coord> queue = new LinkedList<>();

        Coord entryCoord = new Coord(entrance[0], entrance[1]);

    }

    private boolean isExit(Coord coord, Coord entrance) {
        return !coord.equals(entrance) &&
                (coord.x() == 0 || coord.x() == maxWidth - 1 || coord.y() == 0 || coord.y() == maxHeight - 1);
    }
}

record Coord(int x, int y) {
}