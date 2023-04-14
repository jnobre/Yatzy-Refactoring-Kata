package com.datanumia.yatzy.categories;

import com.datanumia.yatzy.models.DiceRoll;
import com.datanumia.yatzy.interfaces.Category;

public class Threes implements Category {
    @Override
    public String getName() {
        return "Threes";
    }

    @Override
    public int score(DiceRoll roll) {
        return roll.getDiceValues().stream().filter(die -> die == 3).mapToInt(Integer::intValue).sum();
    }

}
