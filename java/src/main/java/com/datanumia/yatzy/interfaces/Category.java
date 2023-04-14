package com.datanumia.yatzy.interfaces;

import com.datanumia.yatzy.models.DiceRoll;

/**
 * Represents a category for the Yatzy game.
 */
public interface Category {

    /**
     * Gets the name of the category.
     * @return the name of the category
     */
    String getName();

    /**
     * Calculates the score for the given dice roll in this category.
     * @param roll the dice roll to calculate the score for
     * @return the score for the given dice roll in this category
     */
    int score(DiceRoll roll);

}
