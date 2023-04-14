package com.datanumia.yatzy.categories;

import com.datanumia.yatzy.models.DiceRoll;
import com.datanumia.yatzy.interfaces.Category;

import java.util.HashMap;
import java.util.Map;

public class ThreeOfAKind implements Category {
    @Override
    public String getName() {
        return "ThreeOfAKind";
    }

    @Override
    public int score(DiceRoll roll) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int die : roll.getDiceValues()) {
            map.put(die, map.getOrDefault(die, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) >= 3) {
                return 3 * key;
            }
        }
        return 0;
    }

}
