package com.comp301.a01sushi;

public class ParentIngredient implements Ingredient {
  private String name;
  private double priceperoz;
  private int caloriesperoz;
  private boolean isVegetarian;
  private boolean hasRice;
  private boolean hasShellfish;

  public ParentIngredient(
      String name,
      double priceperoz,
      int caloriesperoz,
      boolean isVegetarian,
      boolean hasRice,
      boolean hasShellfish) {
    this.name = name;
    this.priceperoz = priceperoz;
    this.caloriesperoz = caloriesperoz;
    this.isVegetarian = isVegetarian;
    this.hasRice = hasRice;
    this.hasShellfish = hasShellfish;
  }

  public String getName() {
    return name;
  }

  public double getCaloriesPerDollar() {
    return caloriesperoz / priceperoz;
  }

  public int getCaloriesPerOunce() {
    return caloriesperoz;
  }

  public double getPricePerOunce() {
    return priceperoz;
  }

  public boolean getIsVegetarian() {
    return isVegetarian;
  }

  public boolean getIsRice() {
    return hasRice;
  }

  public boolean getIsShellfish() {
    return hasShellfish;
  }

  public boolean equals(Ingredient other) {
    if (other == null) {
      return false;
    } else if (name.equals(other.getName())
        && caloriesperoz == other.getCaloriesPerOunce()
        && priceperoz == other.getPricePerOunce()
        && isVegetarian == other.getIsVegetarian()
        && hasRice == other.getIsRice()
        && hasShellfish == other.getIsShellfish()) {
      return true;
    } else {
      return false;
    }
  }
}
