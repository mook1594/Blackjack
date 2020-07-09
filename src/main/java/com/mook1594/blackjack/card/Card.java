package com.mook1594.blackjack.card;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class Card {
    @Getter
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return number == card.number &&
                pattern == card.pattern;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, pattern);
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", pattern=" + pattern +
                '}';
    }
}
