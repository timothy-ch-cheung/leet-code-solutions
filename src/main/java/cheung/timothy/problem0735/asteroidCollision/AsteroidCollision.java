package cheung.timothy.problem0735.asteroidCollision;

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> asteroidsStack = new Stack<>();
        int index = 0;
        while (index < asteroids.length) {
            var currentAsteroid = asteroids[index];
            if (asteroidsStack.empty()) {
                asteroidsStack.push(currentAsteroid);
            } else if ((currentAsteroid > 0 && asteroidsStack.peek() > 0) || currentAsteroid < 0 && asteroidsStack.peek() < 0) {
                asteroidsStack.push(currentAsteroid);
            } else if(asteroidsStack.peek() > 0 && currentAsteroid < 0) {
                if (Math.abs(asteroidsStack.peek()) < Math.abs(currentAsteroid)) {
                    asteroidsStack.pop();
                    index--;
                } else if (asteroidsStack.peek() + currentAsteroid == 0) {
                    asteroidsStack.pop();
                }
            } else {
                asteroidsStack.push(currentAsteroid);
            }
            index++;
        }

        int[] result = new int[asteroidsStack.size()];
        for (int i = asteroidsStack.size() -1; i >= 0 ; i--) {
            result[i] = asteroidsStack.pop();
        }
        return result;
    }
}
