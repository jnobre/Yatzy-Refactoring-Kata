package com.yatzy.funcitonalsolution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class YatzyRefactoringKataTest {

    @Test
    public void testYatzyCategory() {
        Assertions.assertEquals(50, YatzyRefactoringKata.YATZY.calculateScore(Arrays.asList(1, 1, 1, 1, 1)));
        Assertions.assertEquals(0, YatzyRefactoringKata.YATZY.calculateScore(Arrays.asList(1, 3, 1, 1, 1)));
    }

    @Test
    void testChance() {
        Assertions.assertEquals(5, YatzyRefactoringKata.CHANCE.calculateScore(Arrays.asList(1, 1, 1, 1, 1)));
        Assertions.assertEquals(15, YatzyRefactoringKata.CHANCE.calculateScore(Arrays.asList(2, 3, 4, 5, 1)));
        Assertions.assertEquals(7, YatzyRefactoringKata.CHANCE.calculateScore(Arrays.asList(1, 1, 1, 2, 2)));
    }

    @Test
    void testOnes() {
        Assertions.assertEquals(3, YatzyRefactoringKata.ONES.calculateScore(Arrays.asList(1, 1, 2, 3, 1)));
        Assertions.assertEquals(1, YatzyRefactoringKata.ONES.calculateScore(Arrays.asList(1, 2, 3, 4, 5)));
        Assertions.assertEquals(0, YatzyRefactoringKata.ONES.calculateScore(Arrays.asList(3, 2, 3, 4, 5)));
    }

    @Test
    void testTwos() {
        Assertions.assertEquals(4, YatzyRefactoringKata.TWOS.calculateScore(Arrays.asList(1, 2, 3, 2, 6)));
        Assertions.assertEquals(6, YatzyRefactoringKata.TWOS.calculateScore(Arrays.asList(1, 2, 3, 2, 2)));
        Assertions.assertEquals(0, YatzyRefactoringKata.TWOS.calculateScore(Arrays.asList(1, 3, 3, 5, 3)));
    }

    @Test
    void testThrees() {
        Assertions.assertEquals(6, YatzyRefactoringKata.THREES.calculateScore(Arrays.asList(1, 2, 3, 2, 3)));
        Assertions.assertEquals(3, YatzyRefactoringKata.THREES.calculateScore(Arrays.asList(1, 2, 3, 2, 5)));
        Assertions.assertEquals(0, YatzyRefactoringKata.THREES.calculateScore(Arrays.asList(2, 4, 5, 6, 1)));
    }

    @Test
    void testFours() {
        Assertions.assertEquals(12, YatzyRefactoringKata.FOURS.calculateScore(Arrays.asList(4, 4, 4, 5, 5)));
        Assertions.assertEquals(8, YatzyRefactoringKata.FOURS.calculateScore(Arrays.asList(4, 4, 5, 5, 5)));
        Assertions.assertEquals(4, YatzyRefactoringKata.FOURS.calculateScore(Arrays.asList(4, 5, 5, 5, 5)));
        Assertions.assertEquals(0, YatzyRefactoringKata.FOURS.calculateScore(Arrays.asList(1, 1, 2, 5, 5)));
    }

    @Test
    void testFives() {
        Assertions.assertEquals(10, YatzyRefactoringKata.FIVES.calculateScore(Arrays.asList(4, 4, 4, 5, 5)));
        Assertions.assertEquals(15, YatzyRefactoringKata.FIVES.calculateScore(Arrays.asList(4, 4, 5, 5, 5)));
        Assertions.assertEquals(0, YatzyRefactoringKata.FIVES.calculateScore(Arrays.asList(4, 2, 3, 4, 1)));
    }

    @Test
    void testSixes() {
        Assertions.assertEquals(0, YatzyRefactoringKata.SIXES.calculateScore(Arrays.asList(4, 4, 4, 5, 5)));
        Assertions.assertEquals(6, YatzyRefactoringKata.SIXES.calculateScore(Arrays.asList(4, 4, 6, 5, 5)));
        Assertions.assertEquals(30, YatzyRefactoringKata.SIXES.calculateScore(Arrays.asList(6, 6, 6, 6, 6)));
    }

    @Test
    void testPair() {
        Assertions.assertEquals(6, YatzyRefactoringKata.PAIR.calculateScore(Arrays.asList(3, 4, 3, 5, 6)));
        Assertions.assertEquals(8, YatzyRefactoringKata.PAIR.calculateScore(Arrays.asList(3, 3, 3, 4, 4)));
        Assertions.assertEquals(10, YatzyRefactoringKata.PAIR.calculateScore(Arrays.asList(5, 3, 3, 3, 5)));
        Assertions.assertEquals(12, YatzyRefactoringKata.PAIR.calculateScore(Arrays.asList(5, 3, 6, 6, 5)));
        Assertions.assertEquals(0, YatzyRefactoringKata.PAIR.calculateScore(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    void testTwoPairs() {
        Assertions.assertEquals(16, YatzyRefactoringKata.TWO_PAIRS.calculateScore(Arrays.asList(3, 3, 5, 4, 5)));
        Assertions.assertEquals(8, YatzyRefactoringKata.TWO_PAIRS.calculateScore(Arrays.asList(1, 1, 2, 3, 3)));
        Assertions.assertEquals(0, YatzyRefactoringKata.TWO_PAIRS.calculateScore(Arrays.asList(1, 1, 2, 3, 4)));
    }

    @Test
    void testThreeOfAKind() {
        Assertions.assertEquals(9, YatzyRefactoringKata.THREE_OF_A_KIND.calculateScore(Arrays.asList(3, 3, 3, 4, 5)));
        Assertions.assertEquals(15, YatzyRefactoringKata.THREE_OF_A_KIND.calculateScore(Arrays.asList(5, 3, 5, 4, 5)));
        Assertions.assertEquals(0, YatzyRefactoringKata.THREE_OF_A_KIND.calculateScore(Arrays.asList(3, 3, 4, 5, 6)));
    }

    @Test
    void testFourOfAKind() {
        Assertions.assertEquals(12, YatzyRefactoringKata.FOUR_OF_A_KIND.calculateScore(Arrays.asList(3, 3, 3, 3, 5)));
        Assertions.assertEquals(20, YatzyRefactoringKata.FOUR_OF_A_KIND.calculateScore(Arrays.asList(5, 5, 5, 4, 5)));
        Assertions.assertEquals(8, YatzyRefactoringKata.FOUR_OF_A_KIND.calculateScore(Arrays.asList(2, 2, 2, 2, 5)));
        Assertions.assertEquals(0, YatzyRefactoringKata.FOUR_OF_A_KIND.calculateScore(Arrays.asList(2, 2, 2, 5, 5)));
    }

    @Test
    void testSmallStraight() {
        Assertions.assertEquals(15, YatzyRefactoringKata.SMALL_STRAIGHT.calculateScore(Arrays.asList(1, 2, 3, 4, 5)));
        Assertions.assertEquals(0, YatzyRefactoringKata.SMALL_STRAIGHT.calculateScore(Arrays.asList(1, 2, 2, 4, 5)));
    }

    @Test
    void testLargeStraight() {
        Assertions.assertEquals(20, YatzyRefactoringKata.LARGE_STRAIGHT.calculateScore(Arrays.asList(6, 2, 3, 4, 5)));
        Assertions.assertEquals(0, YatzyRefactoringKata.LARGE_STRAIGHT.calculateScore(Arrays.asList(1, 2, 2, 4, 5)));
    }

    @Test
    void testFullHouse() {
        Assertions.assertEquals(18, YatzyRefactoringKata.FULL_HOUSE.calculateScore(Arrays.asList(6, 2, 2, 6, 2)));
        Assertions.assertEquals(8, YatzyRefactoringKata.FULL_HOUSE.calculateScore(Arrays.asList(1, 1, 2, 2, 2)));
        Assertions.assertEquals(0, YatzyRefactoringKata.FULL_HOUSE.calculateScore(Arrays.asList(2, 3, 4, 5, 6)));
        Assertions.assertEquals(0, YatzyRefactoringKata.FULL_HOUSE.calculateScore(Arrays.asList(4, 4, 4, 4, 4)));
    }
}
