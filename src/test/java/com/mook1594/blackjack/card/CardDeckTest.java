package com.mook1594.blackjack.card;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CardDeckTest {

    @Test
    @DisplayName("카드 뭉치를 만든다.")
    public void createCardDeck() {
        CardDeck deck = new CardDeck();
        List<Card> cards = deck.makeCard();

        assertThat(cards.size()).isEqualTo(52);
    }
}
