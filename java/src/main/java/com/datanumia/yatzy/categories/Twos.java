package com.datanumia.yatzy.categories;

import com.datanumia.yatzy.models.DiceRoll;
import com.datanumia.yatzy.interfaces.Category;

public class Twos implements Category {
    @Override
    public String getName() {
        return "Twos";
    }

    @Override
    public int score(DiceRoll roll) {
        return roll.getDiceValues().stream().filter(die -> die == 2).mapToInt(Integer::intValue).sum();
    }

}
