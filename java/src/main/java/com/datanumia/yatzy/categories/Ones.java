package com.datanumia.yatzy.categories;
import com.datanumia.yatzy.models.DiceRoll;
import com.datanumia.yatzy.interfaces.Category;

public class Ones implements Category {

    @Override
    public String getName() {
        return "Ones";
    }

    @Override
    public int score(DiceRoll roll) {
        return roll.getDiceValues().stream().filter(die -> die == 1).mapToInt(Integer::intValue).sum();
    }

}
