package com.datanumia.yatzy.models;

import java.util.List;

public class DiceRoll {
    private List<Integer> diceValues;

    public DiceRoll(List<Integer> diceValues) {
        this.diceValues = diceValues;
    }

    public List<Integer> getDiceValues() {
        return diceValues;
    }

}
