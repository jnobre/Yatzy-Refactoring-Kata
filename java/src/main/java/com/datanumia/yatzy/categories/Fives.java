package com.datanumia.yatzy.categories;

import com.datanumia.yatzy.models.DiceRoll;
import com.datanumia.yatzy.interfaces.Category;

public class Fives implements Category {
    @Override
    public String getName() {
        return "Fives";
    }

    @Override
    public int score(DiceRoll roll) {
        return roll.getDiceValues().stream().filter(die -> die == 5).mapToInt(Integer::intValue).sum();
    }

}
