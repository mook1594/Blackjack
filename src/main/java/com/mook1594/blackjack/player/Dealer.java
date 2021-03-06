package com.mook1594.blackjack.player;

import com.mook1594.blackjack.card.Card;
import com.mook1594.blackjack.card.CardDeck;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Dealer {

    private List<Card> dealerCards;

    private CardDeck cardDeck;

    public Dealer() {
        dealerCards = new ArrayList<>();
    }

    public Dealer(CardDeck cardDeck) {
        dealerCards = new ArrayList<>();
        this.cardDeck = cardDeck;
    }

    public void takeCard() {
        dealerCards.add(giveCard());
    }

    public int cardCount() {
        return dealerCards.size();
    }

    public Card giveCard() {
        if (cardDeck == null) {
            throw new NoSuchElementException("딜러가 가진 카드가 없습니다.");
        }
        return cardDeck.getCard();
    }
}
