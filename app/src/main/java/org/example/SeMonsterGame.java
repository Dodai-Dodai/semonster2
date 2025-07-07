package org.example;

import java.util.HashMap;
import java.util.Map;

public class SeMonsterGame {
    private Map<String, Player> players;

    public SeMonsterGame() {
        this.players = new HashMap<>();
    }

    public void addPlayer(String playerName) {
        if (players.containsKey(playerName)) {
        throw new IllegalArgumentException("すでに存在するプレイヤー名です: " + playerName);
        }
        players.put(playerName, new Player(playerName));
    }

    public void draw(String playerName) {
        Player player = players.get(playerName);
        if (player == null) {
            throw new IllegalArgumentException("指定されたプレイヤーが存在しません: " + playerName);
        }
        System.out.println(player);
    }

    public Map<String, Player> getPlayers() {
        return players;
    }
}
