package com.mook1594.blackjack.player;

import com.mook1594.blackjack.card.Card;
import com.mook1594.blackjack.card.CardDeck;

import java.util.ArrayList;
import java.util.List;

public class Dealer {

    private List<Card> dealerCards;

    private CardDeck cardDeck;

    public Dealer() {
        dealerCards = new ArrayList<>();
    }

    public Dealer(CardDeck cardDeck) {
        this.cardDeck = cardDeck;
    }

    public void takeCard(Card card) {
        dealerCards.add(card);
    }

    public int getCardCount() {
        return dealerCards.size();
    }

    public Card giveCard() {
        return cardDeck.getCard();
    }
}
