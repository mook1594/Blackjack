package com.mook1594.blackjack.player;

import com.mook1594.blackjack.card.Card;
import com.mook1594.blackjack.card.CardDeck;
import com.mook1594.blackjack.card.CardType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DealerTest {

    @Test
    @DisplayName("카드를 받는다.")
    public void takeCard() {
        Dealer dealer = new Dealer();

        Card card = new Card(10, CardType.DIAMOND);
        dealer.takeCard(card);

        assertThat(dealer.getCardCount() > 0).isEqualTo(true);
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

}
