package com.yatzy.funcitonalsolution;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class YatzyRefactoringKata {

    interface Category {
        int calculateScore(List<Integer> dice);
    }

    static final Category YATZY = dice ->  dice.stream().distinct().count() == 1 ? 50 : 0;
    static final Category ONES = countDice(1);
    static final Category TWOS = countDice(2);
    static final Category THREES = countDice(3);
    static final Category FOURS = countDice(4);
    static final Category FIVES = countDice(5);
    static final Category SIXES = countDice(6);
    static final Category PAIR = dice -> {
        List<Integer> distinctValues = dice.stream().distinct().collect(Collectors.toList());
        int maxPairSum = 0;
        for (int value : distinctValues) {
            long count = dice.stream().filter(d -> d == value).count();
            if (count >= 2) {
                int pairSum = value * 2;
                if (pairSum > maxPairSum) {
                    maxPairSum = pairSum;
                }
            }
        }
        return maxPairSum;
    };
    static final Category TWO_PAIRS = dice -> {
        List<Integer> pairs = findPairs(dice);
        if (pairs.size() == 2 && pairs.get(0) != pairs.get(1)) {
            return pairs.stream().mapToInt(Integer::intValue).sum() * 2;
        } else {
            return 0;
        }
    };
    static final Category THREE_OF_A_KIND = findNOfKind(3);
    static final Category FOUR_OF_A_KIND = findNOfKind(4);
    static final Category SMALL_STRAIGHT = createStraightCategory(Arrays.asList(1,2,3,4,5), 15);
    static final Category LARGE_STRAIGHT = createStraightCategory(Arrays.asList(2,3,4,5,6), 20);
    static final Category FULL_HOUSE = dice -> {
        List<Integer> counts = dice.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .values()
            .stream()
            .map(Long::intValue)
            .sorted()
            .collect(Collectors.toList());

        return counts.size() == 2 && counts.get(0) == 2 && counts.get(1) == 3 ? dice.stream().mapToInt(Integer::intValue).sum() : 0;
    };
    static final Category CHANCE = dice -> dice.stream().mapToInt(Integer::intValue).sum();

    private static Category countDice(int value) {
        return dice -> dice.stream().filter(d -> d == value).mapToInt(Integer::intValue).sum();
    }

    private static List<Integer> findPairs(List<Integer> dice) {
        return dice.stream()
            .filter(value -> dice.stream().filter(d -> d == value).count() >= 2)
            .distinct()
            .collect(Collectors.toList());
    }

    private static Category findNOfKind(int n) {
        return dice -> {
            int maxScore = 0;
            for (int value : dice) {
                long count = dice.stream().filter(d -> d == value).count();
                if (count >= n) {
                    int score = dice.stream().filter(d -> d == value).limit(n).mapToInt(Integer::intValue).sum();
                    if (score > maxScore) {
                        maxScore = score;
                    }
                }
            }
            return maxScore;
        };
    }

    private static Category createStraightCategory(List<Integer> straightValues, int score) {
        return dice -> dice.containsAll(straightValues) ? score : 0;
    }

}
