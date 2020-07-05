package com.mook1594.blackjack.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
    private List<Card> cards;

    public CardDeck() {
        cards = new ArrayList<>();
    }

    public List<Card> getCards() {
        return cards;
    }

    public Card getCard(){
        return null;
    }

    public void makeCard() {
        for (int i = 1; i <= 13; i++) {
            cards.add(new Card(i, CardType.DIAMOND));
            cards.add(new Card(i, CardType.SPADE));
            cards.add(new Card(i, CardType.CLUB));
            cards.add(new Card(i, CardType.HEART));
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}
