package com.datanumia.yatzy;


import com.datanumia.yatzy.models.DiceRoll;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YatzyGame {

    public int score(DiceRoll roll, CategoryType category) {
        List<Integer> diceValues = roll.getDiceValues();
        if (diceValues == null || diceValues.isEmpty() || diceValues.size() != 5) {
            throw new IllegalArgumentException("Dice Roll is not valid");
        }

        return category.score(roll);
    }

}
