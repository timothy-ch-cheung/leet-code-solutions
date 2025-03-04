package cheung.timothy.problem00841.keysAndRooms;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KeysAndRoomsTest {

    private KeysAndRooms solution = new KeysAndRooms();

    @Test
    void shouldVisitAllRooms() {
        List<List<Integer>> rooms = List.of(List.of(1), List.of(2), List.of(3), Collections.emptyList());

        assertTrue(solution.canVisitAllRooms(rooms));
    }

    @Test
    void cannotVisitAllRooms() {
        List<List<Integer>> rooms = List.of(List.of(1), List.of(1), List.of(3), Collections.emptyList());

        assertFalse(solution.canVisitAllRooms(rooms));
    }
}