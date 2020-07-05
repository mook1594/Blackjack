package com.mook1594.blackjack.card;

import lombok.Getter;
import lombok.Setter;

public class Card {
    private int number;

    @Getter
    @Setter
    private CardType pattern;

    public Card(int i, CardType cardType) {
        this.number = i;

        this.pattern = cardType;
    }

    public String getDenomination() {
        return null;
    }
}
