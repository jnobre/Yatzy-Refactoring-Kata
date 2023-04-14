package com.datanumia.yatzy.categories;

import com.datanumia.yatzy.models.DiceRoll;
import com.datanumia.yatzy.interfaces.Category;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmallStraight implements Category {
    @Override
    public String getName() {
        return "Small Straight";
    }

    @Override
    public int score(DiceRoll roll) {
        Set<Integer> set = new HashSet<>(roll.getDiceValues());
        if (set.size() == 5 && set.containsAll(Arrays.asList(1,2,3,4,5))) {
            return 15;
        }
        return 0;
    }

}
