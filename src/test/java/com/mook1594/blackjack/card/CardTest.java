package com.mook1594.blackjack.card;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardTest {

    @Test
    @DisplayName("A 카드를 만든다.")
    public void makeCard1() {
        Card card = new Card(1, CardType.DIAMOND);

        assertThat(card.getPattern()).isEqualTo(CardType.DIAMOND);
        assertThat(card.getDenomination()).isEqualTo("A");
    }

    @Test
    @DisplayName("숫자 카드를 만든다.")
    public void makeCard2() {
        Card card = new Card(5, CardType.HEART);

        assertThat(card.getPattern()).isEqualTo(CardType.HEART);
        assertThat(card.getDenomination()).isEqualTo("A");
    }

    @Test
    @DisplayName("J 카드를 만든다.")
    public void makeCard3() {
        Card card = new Card(11, CardType.SPADE);

        assertThat(card.getPattern()).isEqualTo(CardType.SPADE);
        assertThat(card.getDenomination()).isEqualTo("A");
    }

    @Test
    @DisplayName("Q 카드를 만든다.")
    public void makeCard4() {
        Card card = new Card(12, CardType.CLUB);

        assertThat(card.getPattern()).isEqualTo(CardType.CLUB);
        assertThat(card.getDenomination()).isEqualTo("A");
    }

    @Test
    @DisplayName("K 카드를 만든다.")
    public void makeCard5() {
        Card card = new Card(13, CardType.DIAMOND);

        assertThat(card.getPattern()).isEqualTo(CardType.DIAMOND);
        assertThat(card.getDenomination()).isEqualTo("A");
    }
}
