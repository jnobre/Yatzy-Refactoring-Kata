package com.datanumia.yatzy.categories;

import com.datanumia.yatzy.models.DiceRoll;
import com.datanumia.yatzy.interfaces.Category;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LargeStraight implements Category {
    @Override
    public String getName() {
        return "LargeStraight";
    }

    @Override
    public int score(DiceRoll roll) {
        Set<Integer> set = new HashSet<>(roll.getDiceValues());
        if (set.size() == 5 && set.containsAll(Arrays.asList(2, 3, 4, 5, 6))) {
            return 20;
        }
        return 0;
    }

}
