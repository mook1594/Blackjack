package com.mook1594.blackjack.card;

import lombok.Getter;
import lombok.Setter;

public class Card {
    private int number;

    @Getter
    @Setter
    private CardType pattern;

    public Card(int i, CardType cardType) {
        if (1 > i || i > 13) {
            throw new IllegalArgumentException("카드 숫자가 올바르지 않습니다.");
        }

        if (cardType == null) {
            throw new IllegalArgumentException("카드 모양이 올바르지 않습니다.");
        }

        this.number = i;
        this.pattern = cardType;
    }

    public String getDenomination() {
        if (number == 1) {
            return "A";
        }
        if (number == 11) {
            return "J";
        }
        if (number == 12) {
            return "Q";
        }
        if (number == 13) {
            return "K";
        }
        return Integer.toString(number);
    }
}
