package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SeMonsterGameTest {

    @Test
    public void testAddPlayerAndDraw() {
        SeMonsterGame game = new SeMonsterGame();
        game.addPlayer("A");
        assertTrue(game.getPlayers().containsKey("A"));
        assertEquals("A", game.getPlayers().get("A").getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDuplicatePlayer() {
        SeMonsterGame game = new SeMonsterGame();
        game.addPlayer("B");
        game.addPlayer("B"); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDrawInvalidPlayer() {
        SeMonsterGame game = new SeMonsterGame();
        game.draw("None"); 
    }
}
