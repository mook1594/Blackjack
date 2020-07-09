package com.mook1594.blackjack.rule;

import com.mook1594.blackjack.card.Card;

public class Rule {
    public static int getScoreFromCard(Card card) {

        if (card.getNumber() == 1) {
            return 1;
        } else if (card.getNumber() > 10) {
            return 10;
        }

        return card.getNumber();
    }
}
