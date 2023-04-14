package com.datanumia.yatzy.categories;

import com.datanumia.yatzy.models.DiceRoll;
import com.datanumia.yatzy.interfaces.Category;

import java.util.*;
import java.util.stream.Collectors;

public class FullHouse implements Category {
    @Override
    public String getName() {
        return "Full House";
    }

    @Override
    public int score(DiceRoll roll) {
        List<Integer> rollDiceValues = roll.getDiceValues();
        List<Integer> distinctRoll = rollDiceValues.stream().distinct().collect(Collectors.toList());

        if (distinctRoll.size() != 2) {
            return 0;
        }

        int firstCount = Collections.frequency(rollDiceValues, distinctRoll.get(0));
        int secondCount = Collections.frequency(rollDiceValues, distinctRoll.get(1));

        if ((firstCount == 2 && secondCount == 3) || (firstCount == 3 && secondCount == 2)) {
            return rollDiceValues.stream().mapToInt(Integer::intValue).sum();
        }

        return 0;
    }

}
