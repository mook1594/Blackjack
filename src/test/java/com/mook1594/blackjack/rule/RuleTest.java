package com.mook1594.blackjack.rule;

import com.mook1594.blackjack.card.Card;
import com.mook1594.blackjack.card.CardType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RuleTest {

    @Test
    @DisplayName("일반 카드 점수")
    public void carScore1() {
        Card card = new Card(4, CardType.CLUB);
        int score = Rule.getScoreFromCard(card);

        assertThat(score).isEqualTo(4);
    }

    @Test
    @DisplayName("ACE 카드 점수")
    public void carScore2() {
        Card card = new Card(1, CardType.CLUB);
        int score = Rule.getScoreFromCard(card);

        assertThat(score).isEqualTo(1);
    }

    @Test
    @DisplayName("QUEEN 카드 점수")
    public void carScore3() {
        Card card = new Card(12, CardType.CLUB);
        int score = Rule.getScoreFromCard(card);

        assertThat(score).isEqualTo(10);
    }

    @Test
    @DisplayName("KING 카드 점수")
    public void carScore4() {
        Card card = new Card(13, CardType.CLUB);
        int score = Rule.getScoreFromCard(card);

        assertThat(score).isEqualTo(10);
    }
}
