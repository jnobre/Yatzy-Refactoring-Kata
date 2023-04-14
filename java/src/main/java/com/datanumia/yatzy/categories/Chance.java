package com.datanumia.yatzy.categories;

import com.datanumia.yatzy.models.DiceRoll;
import com.datanumia.yatzy.interfaces.Category;

public class Chance implements Category {
    @Override
    public String getName() {
        return "Chance";
    }

    @Override
    public int score(DiceRoll roll) {
        return roll.getDiceValues().stream().mapToInt(Integer::intValue).sum();
    }

}
