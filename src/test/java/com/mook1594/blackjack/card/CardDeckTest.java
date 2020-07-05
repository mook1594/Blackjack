package com.mook1594.blackjack.card;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    @Test
    @DisplayName("카드를 섞는다.")
    public void cardShuffle() {
        CardDeck deck = new CardDeck();
        deck.makeCard();
        List<Card> cards = deck.getCards();

        Card card = cards.get(0);
        deck.shuffle();
        Card card1 = cards.get(0);
        assertThat(card.equals(card1)).isEqualTo(false);
        System.out.println(card1);

        deck.shuffle();
        card1 = cards.get(0);
        assertThat(card.equals(card1)).isEqualTo(false);
        System.out.println(card1);

        deck.shuffle();
        card1 = cards.get(0);
        assertThat(card.equals(card1)).isEqualTo(false);
        System.out.println(card1);
    }

    @Test
    @DisplayName("카드를 가져온다.")
    public void getCard() {
        CardDeck deck = new CardDeck();
        deck.makeCard();
        Card card = deck.getCard();

        assertThat(card).isNotEqualTo(null);
        assertThat(deck.getCards().size()).isEqualTo(51);
    }

    @Test
    @DisplayName("예외: 카드가 없을때 카드를 꺼내온다.")
    public void getCard1() {
        CardDeck deck = new CardDeck();

        assertThatThrownBy(() -> {
            Card card = deck.getCard();
        }).isInstanceOf(NoSuchElementException.class);
    }

}
