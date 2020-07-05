package com.mook1594.blackjack.card;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum CardType {
    DIAMOND("다이아몬드", "♦"),
    HEART("하트", "♥"),
    SPADE("스페이드", "♠"),
    CLUB("클럽", "♣");

    @Getter
    private String name;

    @Getter
    private String shape;


}
