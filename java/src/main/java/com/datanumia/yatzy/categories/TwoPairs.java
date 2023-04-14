package com.datanumia.yatzy.categories;

import com.datanumia.yatzy.models.DiceRoll;
import com.datanumia.yatzy.interfaces.Category;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoPairs implements Category {
    @Override
    public String getName() {
        return "TwoPairs";
    }

    @Override
    public int score(DiceRoll roll) {
        Map<Integer, Integer> frequencyDieMap = new HashMap<>();
        for (int die : roll.getDiceValues()) {
            frequencyDieMap.put(die, frequencyDieMap.getOrDefault(die, 0) + 1);
        }

        List<Integer> pairs = new ArrayList<>();
        for (int key : frequencyDieMap.keySet()) {
            if (frequencyDieMap.get(key) >= 2) {
                pairs.add(key);
            }
        }

        if (pairs.size() >= 2) {
            return 2 * pairs.get(0) + 2 * pairs.get(1);
        }

        return 0;
    }

}
