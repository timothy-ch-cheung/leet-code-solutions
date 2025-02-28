package cheung.timothy.problem0649.dota2Senate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class Dota2SenateTest {
    private final Dota2Senate solution = new Dota2Senate();

    @ParameterizedTest
    @CsvSource(value = {
            "RD, Radiant",
            "RDD, Dire",
            "RRR, Radiant"
    })
    void dota2Senate(String senate, String expected) {
        String answer = solution.predictPartyVictory(senate);
        assertThat(answer, is(expected));
    }
}