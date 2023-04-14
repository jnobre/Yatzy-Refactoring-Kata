package com.datanumia.yatzy.categories;

import com.datanumia.yatzy.models.DiceRoll;
import com.datanumia.yatzy.interfaces.Category;

import java.util.List;

public class Yatzy implements Category {
    @Override
    public String getName() {
        return "Yatzy";
    }

    @Override
    public int score(DiceRoll roll) {
        if (isYatzy(roll)) {
            return 50;
        }
        return 0;
    }

    private boolean isYatzy(DiceRoll roll) {
        List<Integer> values = roll.getDiceValues();
        for (int i = 1; i < values.size(); i++) {
            if (!values.get(i).equals(values.get(0))) {
                return false;
            }
        }
        return true;
    }
}
