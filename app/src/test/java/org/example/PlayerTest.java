package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void testPlayerInitialization() {
        Player player = new Player("ユーザー");
        assertEquals("ユーザー", player.getName());
        assertEquals(8, player.getDeck().size());
        assertEquals(100, player.getHp());
    }

    @Test
    public void testPlayerToString() {
        Player player = new Player("テストユーザー");
        String output = player.toString();
        assertTrue(output.contains("Deck:テストユーザー"));
        assertTrue(output.contains("レア度["));
        assertTrue(output.contains("HP:100"));
    }

    @Test
    public void testHpSetter() {
        Player player = new Player("ユーザー");
        player.setHp(75);
        assertEquals(75, player.getHp());
    }
}
