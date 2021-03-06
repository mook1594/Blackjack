package com.mook1594.blackjack.card;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CardTest {


    @Test
    @DisplayName("숫자 카드를 만든다.")
    public void makeCard2() {
        Card card = new Card(5, CardType.HEART);

        assertThat(card.getPattern()).isEqualTo(CardType.HEART);
        assertThat(card.getDenomination()).isEqualTo("5");
    }

    @Test
    @DisplayName("A 카드를 만든다.")
    public void makeCard1() {
        Card card = new Card(1, CardType.DIAMOND);

        assertThat(card.getPattern()).isEqualTo(CardType.DIAMOND);
        assertThat(card.getDenomination()).isEqualTo("A");
    }

    @Test
    @DisplayName("J 카드를 만든다.")
    public void makeCard3() {
        Card card = new Card(11, CardType.SPADE);

        assertThat(card.getPattern()).isEqualTo(CardType.SPADE);
        assertThat(card.getDenomination()).isEqualTo("J");
    }

    @Test
    @DisplayName("Q 카드를 만든다.")
    public void makeCard4() {
        Card card = new Card(12, CardType.CLUB);

        assertThat(card.getPattern()).isEqualTo(CardType.CLUB);
        assertThat(card.getDenomination()).isEqualTo("Q");
    }

    @Test
    @DisplayName("K 카드를 만든다.")
    public void makeCard5() {
        Card card = new Card(13, CardType.DIAMOND);

        assertThat(card.getPattern()).isEqualTo(CardType.DIAMOND);
        assertThat(card.getDenomination()).isEqualTo("K");
    }

    @Test
    @DisplayName("예외: 없는 카드 숫자")
    public void makeCard6() {
        assertThatThrownBy(() -> {
            Card card = new Card(-1, CardType.DIAMOND);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("예외: 없는 카드 모양")
    public void makeCard7() {
        assertThatThrownBy(() -> {
            Card card = new Card(13, null);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
