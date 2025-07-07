package org.example;

import java.util.Random;


public class Monster {
  private String name;
  private int rare;

  private static final String[] MONSTER_NAMES = {
    "デュラハン", "キメラ", "フェニックス", "ドラゴン", "ゴーレム"
  };

  public Monster(String name, int rare) {
    this.name = name;
    this.rare = rare;
  }

  @Override
  public String toString() {
    return name + ":レア度[" + rare + "]";
  }

  public static Monster summonMonster(int rare) {
    if (rare < 0 || rare >= MONSTER_NAMES.length) {
      throw new IllegalArgumentException("Invalid rarity: " + rare);
    }
    return new Monster(MONSTER_NAMES[rare], rare);
  }
  public void evolve() {
    if (rare >= 3) {
      switch (name) {
        case "デュラハン":
          name = "デュラハン・エボルブ";
          break;
        case "キメラ":
          name = "キメラ・エボルブ";
          break;
        case "フェニックス":
          name = "フェニックス・エボルブ";
          break;
        case "ドラゴン":
          name = "ドラゴン・エボルブ";
          break;
        case "ゴーレム":
          name = "ゴーレム・エボルブ";
          break;
      }
    }
  }
};
