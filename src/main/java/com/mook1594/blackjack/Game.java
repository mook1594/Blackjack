package com.mook1594.blackjack;

import com.mook1594.blackjack.card.CardDeck;
import com.mook1594.blackjack.player.Dealer;
import com.mook1594.blackjack.player.Gamer;
import com.mook1594.blackjack.rule.Rule;
import org.springframework.boot.SpringApplication;

public class Game {

    public void play(){
        System.out.println("========= Blackjack =========");
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();
        CardDeck cardDeck = new CardDeck();
    }

}
