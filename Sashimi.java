package com.comp301.a01sushi;

import java.lang.Math;

public class Sashimi implements Sushi {
  private String name;
  private IngredientPortion[] sashimitype;

  public enum SashimiType {
    TUNA,
    YELLOWTAIL,
    EEL,
    CRAB,
    SHRIMP
  };

  public Sashimi(SashimiType type) {
    if (type == SashimiType.TUNA) {
      name = "tuna sashimi";
      sashimitype = new ParentIngredientPortion[] {new TunaPortion(0.75)};
    }
    if (type == SashimiType.YELLOWTAIL) {
      name = "yellowtail sashimi";
      sashimitype = new ParentIngredientPortion[] {new YellowtailPortion(0.75)};
    }
    if (type == SashimiType.EEL) {
      name = "eel sashimi";
      sashimitype = new ParentIngredientPortion[] {new EelPortion(0.75)};
    }
    if (type == SashimiType.CRAB) {
      name = "crab sashimi";
      sashimitype = new ParentIngredientPortion[] {new CrabPortion(0.75)};
    }
    if (type == SashimiType.SHRIMP) {
      name = "shrimp sashimi";
      sashimitype = new ParentIngredientPortion[] {new ShrimpPortion(0.75)};
    }
  }

  public String getName() {
    return name;
  }

  public IngredientPortion[] getIngredients() {
    return sashimitype;
  }

  public int getCalories() {
    return (int) Math.round(sashimitype[0].getCalories());
  }

  public double getCost() {
    return sashimitype[0].getCost();
  }

  public boolean getHasRice() {
    return sashimitype[0].getIsRice();
  }

  public boolean getHasShellfish() {
    return sashimitype[0].getIsShellfish();
  }

  public boolean getIsVegetarian() {
    return sashimitype[0].getIsVegetarian();
  }
}
