package com.mook1594.blackjack.player;

import com.mook1594.blackjack.card.Card;
import com.mook1594.blackjack.card.CardType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DealerTest {

    @Test
    @DisplayName("카드를 받는다.")
    public void takeCard() {
        Dealer dealer = new Dealer();

        Card card = new Card(10, CardType.DIAMOND);
        dealer.takeCard(card);
    }
}
