package com.datanumia.yatzy.categories;

import com.datanumia.yatzy.models.DiceRoll;
import com.datanumia.yatzy.interfaces.Category;

public class Sixes implements Category {
    @Override
    public String getName() {
        return "Sixes";
    }

    @Override
    public int score(DiceRoll roll) {
        return roll.getDiceValues().stream().filter(die -> die == 6).mapToInt(Integer::intValue).sum();
    }

}
