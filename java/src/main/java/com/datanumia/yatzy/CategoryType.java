package com.datanumia.yatzy;

import com.datanumia.yatzy.categories.*;
import com.datanumia.yatzy.interfaces.Category;
import com.datanumia.yatzy.models.DiceRoll;

public enum CategoryType {
    ONES(new Ones()),
    TWOS(new Twos()),
    THREES(new Threes()),
    FOURS(new Fours()),
    FIVES(new Fives()),
    SIXES(new Sixes()),
    PAIR(new Pair()),
    TWO_PAIRS(new TwoPairs()),
    THREE_OF_A_KIND(new ThreeOfAKind()),
    FOUR_OF_A_KIND(new FourOfAKind()),
    SMALL_STRAIGHT(new SmallStraight()),
    LARGE_STRAIGHT(new LargeStraight()),
    FULL_HOUSE(new FullHouse()),
    CHANCE(new Chance()),
    YATZY(new Yatzy());

    private final Category category;

    CategoryType(Category category) {
        this.category = category;
    }

    public int score(DiceRoll roll) {
        return category.score(roll);
    }

    public String getName() {
        return category.getName();
    }
}
