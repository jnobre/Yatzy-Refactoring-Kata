package com.yatzy.funcitonalsolution.interfaces;

import java.util.List;

/**
 * Represents a category for the Yatzy game.
 */
public interface Category {
    /**
     * Calculates the score for the given dice roll in this category.
     * @param roll the dice roll to calculate the score for
     * @return the score for the given dice roll in this category
     */
    int score(List<Integer> roll);

}