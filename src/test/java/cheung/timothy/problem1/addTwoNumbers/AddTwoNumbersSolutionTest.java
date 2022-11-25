package cheung.timothy.problem1.addTwoNumbers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersSolutionTest {

    private static final AddTwoNumbersSolution solution = new AddTwoNumbersSolution();

    private static ListNode createListNode(String num) {
        List<Integer> numList = Arrays.stream(num.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        ListNode prevNode = new ListNode(numList.get(0));
        for (int i = 1; i < numList.size(); i++) {
            prevNode = new ListNode(numList.get(i), prevNode);
        }

        return prevNode;
    }

    @ParameterizedTest
    @CsvSource({
            "342,465,807",
            "0,0,0",
            "9999999,9999,89990001"

    })
    void addition(String num1, String num2, String expected) {
        ListNode answer = solution.addTwoNumbers(createListNode(num1), createListNode(num2));
        assertThat(answer, is(createListNode(expected)));
    }
}