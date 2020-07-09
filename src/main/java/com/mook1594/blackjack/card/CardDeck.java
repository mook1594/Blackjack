package com.mook1594.blackjack.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class CardDeck {
    protected List<Card> cards;

    public CardDeck() {
        cards = new ArrayList<>();
    }

    public Card getCard(){
        if (cards.size() == 0) {
            throw new NoSuchElementException("카드가 없습니다.");
        }
        Card card = cards.get(0);
        cards.remove(0);
        return card;
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

    public int getCardCount() {
        return cards.size();
    }
}
