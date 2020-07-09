package com.mook1594.blackjack.player;

import com.mook1594.blackjack.card.Card;
import com.mook1594.blackjack.card.CardDeck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class DealerTest {

    @Test
    @DisplayName("카드를 받는다.")
    public void takeCard() {
        CardDeck cardDeck = new CardDeck();
        cardDeck.makeCard();
        Dealer dealer = new Dealer(cardDeck);
        dealer.takeCard();

        assertThat(dealer.cardCount() > 0).isEqualTo(true);
    }

    @Test
    @DisplayName("카드를 준다.")
    public void giveCard() {
        CardDeck cardDeck = new CardDeck();
        cardDeck.makeCard();

        Dealer dealer = new Dealer(cardDeck);

        Card card = dealer.giveCard();

        assertThat(card).isNotEqualTo(null);
    }

    @Test
    @DisplayName("딜러가 카드를 가지고 있지 않을때")
    public void giveCard1() {
        Dealer dealer = new Dealer();

        assertThatThrownBy(() -> {
            Card card = dealer.giveCard();
        }).isInstanceOf(NoSuchElementException.class);
    }
}
