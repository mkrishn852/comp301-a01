package com.comp301.a01sushi;

public class Nigiri implements Sushi {
  private String name;
  private IngredientPortion[] nigirilist = new IngredientPortion[2];

  public enum NigiriType {
    TUNA,
    YELLOWTAIL,
    EEL,
    CRAB,
    SHRIMP
  };

  public Nigiri(NigiriType type) {
    nigirilist[0] = new RicePortion(0.5);
    if (type == NigiriType.TUNA) {
      name = "tuna nigiri";
      nigirilist[1] = new TunaPortion(0.75);
    }
    if (type == NigiriType.YELLOWTAIL) {
      name = "yellowtail nigiri";
      nigirilist[1] = new YellowtailPortion(0.75);
    }
    if (type == NigiriType.EEL) {
      name = "eel nigiri";
      nigirilist[1] = new EelPortion(0.75);
    }
    if (type == NigiriType.CRAB) {
      name = "crab nigiri";
      nigirilist[1] = new CrabPortion(0.75);
    }
    if (type == NigiriType.SHRIMP) {
      name = "shrimp nigiri";
      nigirilist[1] = new ShrimpPortion(0.75);
    }
  }

  public String getName() {
    return name;
  }

  public IngredientPortion[] getIngredients() {
    return nigirilist;
  }

  public int getCalories() {
    double calories = 0;
    for (IngredientPortion i : nigirilist) {
      calories += i.getCalories();
    }
    return (int) Math.round(calories);
  }

  public double getCost() {
    double cost = 0;
    for (IngredientPortion i : nigirilist) {
      cost += i.getCost();
    }
    return cost;
  }

  public boolean getHasRice() {
    return true;
  }

  public boolean getHasShellfish() {
    if (nigirilist[1].getIsShellfish()) {
      return true;
    }
    return false;
  }

  public boolean getIsVegetarian() {
    if (nigirilist[1].getIsVegetarian() && nigirilist[0].getIsVegetarian()) {
      return true;
    }
    return false;
  }
}
