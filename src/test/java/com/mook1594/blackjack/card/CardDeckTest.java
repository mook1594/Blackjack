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
        deck.makeCard();
        List<Card> cards = deck.getCards();

        assertThat(cards.size()).isEqualTo(52);
    }

    @Test
    @DisplayName("카드 검증")
    public void createCardDeck1() {
        CardDeck deck = new CardDeck();
        deck.makeCard();
        List<Card> cards = deck.getCards();

        for (int i = 1; i <= 13; i++) {
            assertThat(cards.contains(new Card(i, CardType.DIAMOND))).isEqualTo(true);
            assertThat(cards.contains(new Card(i, CardType.HEART))).isEqualTo(true);
            assertThat(cards.contains(new Card(i, CardType.CLUB))).isEqualTo(true);
            assertThat(cards.contains(new Card(i, CardType.SPADE))).isEqualTo(true);
        }
    }
}
