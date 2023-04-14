package com.datanumia.yatzy.categories;

import com.datanumia.yatzy.models.DiceRoll;
import com.datanumia.yatzy.interfaces.Category;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Pair implements Category {
    @Override
    public String getName() {
        return "Pair";
    }

    @Override
    public int score(DiceRoll roll) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int die : roll.getDiceValues()) {
            frequencyMap.put(die, frequencyMap.getOrDefault(die, 0) + 1);
        }

        Optional<Map.Entry<Integer, Integer>> optionalPair = frequencyMap.entrySet().stream()
            .filter(entry -> entry.getValue() >= 2)
            .max(Map.Entry.comparingByKey());

        if (optionalPair.isPresent()) {
            Map.Entry<Integer, Integer> pair = optionalPair.get();
            return pair.getKey() * 2;
        }
        return 0;
    }

}
