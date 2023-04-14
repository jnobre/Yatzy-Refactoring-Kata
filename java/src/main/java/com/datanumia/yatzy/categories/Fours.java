package com.datanumia.yatzy.categories;

import com.datanumia.yatzy.models.DiceRoll;
import com.datanumia.yatzy.interfaces.Category;

public class Fours implements Category {
    @Override
    public String getName() {
        return "Fours";
    }

    @Override
    public int score(DiceRoll roll) {
        return roll.getDiceValues().stream().filter(die -> die == 4).mapToInt(Integer::intValue).sum();
    }

}
