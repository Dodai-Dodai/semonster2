package org.example;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Monster> deck;
    private int hp;

public Player(String name) {
    this.name = name;
    this.hp = 100; // 初期HP
    this.deck = new ArrayList<>();
    for (int i = 0; i < 8; i++) {
        int rarity = i % 5; // レア度0〜4を循環
        this.deck.add(Monster.summonMonster(rarity));
    }
}

public String getName() {
    return name;
}

public ArrayList<Monster> getDeck() {
    return deck;
}

public int getHp() {
    return hp;
}

public void setHp(int hp) {
    this.hp = hp;
}

@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deck:").append(name).append("\n");
        for (Monster m : deck) {
            sb.append(m.toString()).append("\n");
        }
        sb.append("HP:").append(hp);
        return sb.toString();
    }
}
