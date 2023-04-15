import com.datanumia.yatzy.CategoryType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.datanumia.yatzy.models.DiceRoll;
import com.datanumia.yatzy.YatzyGame;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyGameTest {

    private YatzyGame yatzyGame;

    @BeforeEach
    public void setUp() {
        yatzyGame = new YatzyGame();
    }

    @Test
    void testChance() {
        assertEquals(5, yatzyGame.score(new DiceRoll(Arrays.asList(1, 1, 1, 1, 1)), CategoryType.CHANCE));
        assertEquals(15, yatzyGame.score(new DiceRoll(Arrays.asList(2, 3, 4, 5, 1)), CategoryType.CHANCE));
        assertEquals(16, yatzyGame.score(new DiceRoll(Arrays.asList(3, 3, 4, 5, 1)), CategoryType.CHANCE));
        assertEquals(7, yatzyGame.score(new DiceRoll(Arrays.asList(1, 1, 1, 2, 2)), CategoryType.CHANCE));
        assertEquals(14, yatzyGame.score(new DiceRoll(Arrays.asList(1, 1, 3, 3, 6)), CategoryType.CHANCE));
        assertEquals(21, yatzyGame.score(new DiceRoll(Arrays.asList(4, 5, 5, 6, 1)), CategoryType.CHANCE));
    }

    @Test
    void testYatzy() {
        assertEquals(50, yatzyGame.score(new DiceRoll(Arrays.asList(4, 4, 4, 4, 4)), CategoryType.YATZY));
        assertEquals(50, yatzyGame.score(new DiceRoll(Arrays.asList(6, 6, 6, 6, 6)), CategoryType.YATZY));
        assertEquals(50, yatzyGame.score(new DiceRoll(Arrays.asList(1, 1, 1, 1, 1)), CategoryType.YATZY));
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(6, 6, 6, 6, 3)), CategoryType.YATZY));
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(4, 5, 5, 6, 1)), CategoryType.YATZY));
    }

    @Test
    void testOnes() {
        assertEquals(3, yatzyGame.score(new DiceRoll(Arrays.asList(1, 1, 2, 3, 1)), CategoryType.ONES));
        assertEquals(1, yatzyGame.score(new DiceRoll(Arrays.asList(1, 2, 3, 4, 5)), CategoryType.ONES));
        assertEquals(2, yatzyGame.score(new DiceRoll(Arrays.asList(1, 2, 1, 4, 5)), CategoryType.ONES));
        assertEquals(1, yatzyGame.score(new DiceRoll(Arrays.asList(6, 6, 6, 6, 1)), CategoryType.ONES));
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(6, 2, 2, 4, 5)), CategoryType.ONES));
        assertEquals(4, yatzyGame.score(new DiceRoll(Arrays.asList(1, 5, 1, 1, 1)), CategoryType.ONES));
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(6, 6, 6, 4, 5)), CategoryType.ONES));
    }

    @Test
    void testTwos() {
        assertEquals(4, yatzyGame.score(new DiceRoll(Arrays.asList(1, 2, 3, 2, 6)), CategoryType.TWOS));
        assertEquals(6, yatzyGame.score(new DiceRoll(Arrays.asList(1, 2, 3, 2, 2)), CategoryType.TWOS));
        assertEquals(10, yatzyGame.score(new DiceRoll(Arrays.asList(2, 2, 2, 2, 2)), CategoryType.TWOS));
        assertEquals(4, yatzyGame.score(new DiceRoll(Arrays.asList(2, 3, 2, 5, 1)), CategoryType.TWOS));
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(1, 3, 3, 5, 1)), CategoryType.TWOS));
        assertEquals(2, yatzyGame.score(new DiceRoll(Arrays.asList(1, 3, 3, 5, 2)), CategoryType.TWOS));
    }

    @Test
    void testThrees() {
        assertEquals(6, yatzyGame.score(new DiceRoll(Arrays.asList(1, 2, 3, 2, 3)), CategoryType.THREES));
        assertEquals(3, yatzyGame.score(new DiceRoll(Arrays.asList(1, 2, 3, 2, 5)), CategoryType.THREES));
        assertEquals(12, yatzyGame.score(new DiceRoll(Arrays.asList(2, 3, 3, 3, 3)), CategoryType.THREES));
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(2, 4, 5, 6, 1)), CategoryType.THREES));
    }

    @Test
    void testFours() {
        assertEquals(12, yatzyGame.score(new DiceRoll(Arrays.asList(4, 4, 4, 5, 5)), CategoryType.FOURS));
        assertEquals(8, yatzyGame.score(new DiceRoll(Arrays.asList(4, 4, 5, 5, 5)), CategoryType.FOURS));
        assertEquals(4, yatzyGame.score(new DiceRoll(Arrays.asList(4, 5, 5, 5, 5)), CategoryType.FOURS));
        assertEquals(8, yatzyGame.score(new DiceRoll(Arrays.asList(1, 1, 2, 4, 4)), CategoryType.FOURS));
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(1, 1, 2, 5, 5)), CategoryType.FOURS));
    }

    @Test
    void testFives() {
        assertEquals(10, yatzyGame.score(new DiceRoll(Arrays.asList(4, 4, 4, 5, 5)), CategoryType.FIVES));
        assertEquals(15, yatzyGame.score(new DiceRoll(Arrays.asList(4, 4, 5, 5, 5)), CategoryType.FIVES));
        assertEquals(20, yatzyGame.score(new DiceRoll(Arrays.asList(4, 5, 5, 5, 5)), CategoryType.FIVES));
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(4, 2, 3, 4, 1)), CategoryType.FIVES));
    }

    @Test
    void testSixes() {
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(4, 4, 4, 5, 5)), CategoryType.SIXES));
        assertEquals(6, yatzyGame.score(new DiceRoll(Arrays.asList(4, 4, 6, 5, 5)), CategoryType.SIXES));
        assertEquals(18, yatzyGame.score(new DiceRoll(Arrays.asList(6, 5, 6, 6, 5)), CategoryType.SIXES));
        assertEquals(30, yatzyGame.score(new DiceRoll(Arrays.asList(6, 6, 6, 6, 6)), CategoryType.SIXES));
    }

    @Test
    void testPair() {
        assertEquals(6, yatzyGame.score(new DiceRoll(Arrays.asList(3, 4, 3, 5, 6)), CategoryType.PAIR));
        assertEquals(10, yatzyGame.score(new DiceRoll(Arrays.asList(5, 3, 3, 3, 5)), CategoryType.PAIR));
        assertEquals(12, yatzyGame.score(new DiceRoll(Arrays.asList(5, 3, 6, 6, 5)), CategoryType.PAIR));
        assertEquals(8, yatzyGame.score(new DiceRoll(Arrays.asList(3, 3, 3, 4, 4)), CategoryType.PAIR));
        assertEquals(12, yatzyGame.score(new DiceRoll(Arrays.asList(1, 1, 6, 2, 6)), CategoryType.PAIR));
        assertEquals(8, yatzyGame.score(new DiceRoll(Arrays.asList(4, 4, 4, 4, 1)), CategoryType.PAIR));
        assertEquals(8, yatzyGame.score(new DiceRoll(Arrays.asList(4, 4, 3, 2, 1)), CategoryType.PAIR));
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(1, 2, 3, 4, 5)), CategoryType.PAIR));
    }

    @Test
    void testTwoPairs() {
        assertEquals(16, yatzyGame.score(new DiceRoll(Arrays.asList(3, 3, 5, 4, 5)), CategoryType.TWO_PAIRS));
        assertEquals(16, yatzyGame.score(new DiceRoll(Arrays.asList(5, 3, 3, 3, 5)), CategoryType.TWO_PAIRS));
        assertEquals(8, yatzyGame.score(new DiceRoll(Arrays.asList(1, 1, 2, 3, 3)), CategoryType.TWO_PAIRS));
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(1, 1, 2, 3, 4)), CategoryType.TWO_PAIRS));
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(1, 1, 1, 1, 2)), CategoryType.TWO_PAIRS)); // TODO a fourOfAKind counts as a twoPairs?
        assertEquals(6, yatzyGame.score(new DiceRoll(Arrays.asList(1, 1, 2, 2, 2)), CategoryType.TWO_PAIRS));
    }

    @Test
    void testThreeOfAKind() {
        assertEquals(9, yatzyGame.score(new DiceRoll(Arrays.asList(3, 3, 3, 4, 5)), CategoryType.THREE_OF_A_KIND));
        assertEquals(15, yatzyGame.score(new DiceRoll(Arrays.asList(5, 3, 5, 4, 5)), CategoryType.THREE_OF_A_KIND));
        assertEquals(9, yatzyGame.score(new DiceRoll(Arrays.asList(3, 3, 3, 3, 5)), CategoryType.THREE_OF_A_KIND));
        assertEquals(9, yatzyGame.score(new DiceRoll(Arrays.asList(3, 3, 3, 3, 3)), CategoryType.THREE_OF_A_KIND));
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(3, 3, 4, 5, 6)), CategoryType.THREE_OF_A_KIND));
        assertEquals(9, yatzyGame.score(new DiceRoll(Arrays.asList(3, 3, 3, 3, 1)), CategoryType.THREE_OF_A_KIND));
    }

    @Test
    void testFourOfAKind() {
        assertEquals(12, yatzyGame.score(new DiceRoll(Arrays.asList(3, 3, 3, 3, 5)), CategoryType.FOUR_OF_A_KIND));
        assertEquals(20, yatzyGame.score(new DiceRoll(Arrays.asList(5, 5, 5, 4, 5)), CategoryType.FOUR_OF_A_KIND));
        assertEquals(8, yatzyGame.score(new DiceRoll(Arrays.asList(2, 2, 2, 2, 5)), CategoryType.FOUR_OF_A_KIND));
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(2, 2, 2, 5, 5)), CategoryType.FOUR_OF_A_KIND));
        assertEquals(8, yatzyGame.score(new DiceRoll(Arrays.asList(2, 2, 2, 2, 2)), CategoryType.FOUR_OF_A_KIND));
    }

    @Test
    void testSmallStraight() {
        assertEquals(15, yatzyGame.score(new DiceRoll(Arrays.asList(1, 2, 3, 4, 5)), CategoryType.SMALL_STRAIGHT));
        assertEquals(15, yatzyGame.score(new DiceRoll(Arrays.asList(2, 3, 4, 5, 1)), CategoryType.SMALL_STRAIGHT));
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(1, 2, 2, 4, 5)), CategoryType.SMALL_STRAIGHT));
    }

    @Test
    void testLargeStraight() {
        assertEquals(20, yatzyGame.score(new DiceRoll(Arrays.asList(6, 2, 3, 4, 5)), CategoryType.LARGE_STRAIGHT));
        assertEquals(20, yatzyGame.score(new DiceRoll(Arrays.asList(2, 3, 4, 5, 6)), CategoryType.LARGE_STRAIGHT));
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(1, 2, 2, 4, 5)), CategoryType.LARGE_STRAIGHT));
    }

    @Test
    void testFullHouse() {
        assertEquals(18, yatzyGame.score(new DiceRoll(Arrays.asList(6, 2, 2, 2, 6)), CategoryType.FULL_HOUSE));
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(2, 3, 4, 5, 6)), CategoryType.FULL_HOUSE));
        assertEquals(8, yatzyGame.score(new DiceRoll(Arrays.asList(1, 1, 2, 2, 2)), CategoryType.FULL_HOUSE));
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(2, 2, 3, 3, 4)), CategoryType.FULL_HOUSE));
        assertEquals(0, yatzyGame.score(new DiceRoll(Arrays.asList(4, 4, 4, 4, 4)), CategoryType.FULL_HOUSE));
    }
}
