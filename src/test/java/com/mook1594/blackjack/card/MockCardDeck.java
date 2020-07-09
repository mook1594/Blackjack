package com.mook1594.blackjack.card;

import java.util.List;

public class MockCardDeck extends CardDeck {

    public boolean contains(Card card) {
        return super.cards.contains(card);
    }

    public List<Card> cardList() {
        return super.cards;
    }
}
