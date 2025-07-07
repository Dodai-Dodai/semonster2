package org.example;

import org.junit.Test;
import static org.junit.Assert.*;


public class MonsterTest {
  @Test
  public void monsterCanBeCreated() {
    Monster monster = new Monster("テストモンスター", 2);
    assertEquals("テストモンスター:レア度[2]", monster.toString());
  }

  @Test
  public void summonMonsterWithValidRarity() {
    Monster monster = Monster.summonMonster(0);
    assertEquals("デュラハン:レア度[0]", monster.toString());
  }

  @Test
  public void summonMonsterWithInvalidRarity() {
    try {
      Monster.summonMonster(-1);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      assertEquals("Invalid rarity: -1", e.getMessage());
    }
  }

  @Test
  public void evolveMonsterWithHighRarity() {
    Monster monster = Monster.summonMonster(3);
    monster.evolve();
    assertEquals("ドラゴン・エボルブ:レア度[3]", monster.toString());
  }

  @Test
  public void evolveMonsterWithLowRarity() {
    Monster monster = Monster.summonMonster(2);
    String originalName = monster.toString();
    monster.evolve();
    assertEquals(originalName, monster.toString());
  }

  @Test
  public void summonMonsterWithMinRarity() {
    Monster monster = Monster.summonMonster(0);
    assertEquals("デュラハン:レア度[0]", monster.toString());
  }

  @Test
  public void summonMonsterWithMaxRarity() {
    Monster monster = Monster.summonMonster(4);
    assertEquals("ゴーレム:レア度[4]", monster.toString());
  }

  @Test
  public void summonMonsterWithAboveMaxRarity() {
    try {
      Monster.summonMonster(5);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      assertEquals("Invalid rarity: 5", e.getMessage());
    }
  }

  @Test
  public void summonMonsterWithBelowMinRarity() {
    try {
      Monster.summonMonster(-1);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      assertEquals("Invalid rarity: -1", e.getMessage());
    }
  }
}

