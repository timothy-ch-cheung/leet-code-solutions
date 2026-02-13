package cheung.timothy.problem0022.generateParentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

class GenerateParenthesesTest {

    private static final GenerateParentheses solution = new GenerateParentheses();

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(1, List.of("()")),
                Arguments.of(2, List.of("()()", "(())")),
                Arguments.of(3, List.of("((()))", "(()())", "(())()", "()(())", "()()()")),
                Arguments.of(4, List.of("(((())))","((()()))","((())())","((()))()","(()(()))","(()()())","(()())()","(())(())","(())()()","()((()))","()(()())","()(())()","()()(())","()()()()"))
        );
    }

    @MethodSource("testData")
    @ParameterizedTest
    void generateParentheses(int n, List<String> expected) {
        assertThat(solution.generateParenthesis(n), containsInAnyOrder(expected.toArray()));
    }

}