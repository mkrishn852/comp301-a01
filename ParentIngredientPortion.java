package com.comp301.a01sushi;

public class ParentIngredientPortion implements IngredientPortion {
  private Ingredient ingredient;
  private double amount;

  public ParentIngredientPortion(Ingredient ingredient, double amount) {
    this.ingredient = ingredient;
    if (amount < 0) {
      throw new IllegalArgumentException();
    } else {
      this.amount = amount;
    }
  }

  public Ingredient getIngredient() {
    return this.ingredient;
  }

  public double getAmount() {
    return this.amount;
  }

  public String getName() {
    return this.getIngredient().getName();
  }

  public boolean getIsVegetarian() {
    return this.getIngredient().getIsVegetarian();
  }

  public boolean getIsRice() {
    return this.getIngredient().getIsRice();
  }

  public boolean getIsShellfish() {
    return this.getIngredient().getIsShellfish();
  }

  public double getCalories() {
    return this.getIngredient().getCaloriesPerOunce() * this.getAmount();
  }

  public double getCost() {
    return this.getAmount() * this.getIngredient().getPricePerOunce();
  }

  public IngredientPortion combine(IngredientPortion other) {
    if (other == null) {
      return this;
    } else if (this.getName().equals(other.getName())) {
      double combined_amount = this.getAmount() + other.getAmount();
      return new ParentIngredientPortion(this.getIngredient(), combined_amount);
    } else {
      throw new IllegalArgumentException();
    }
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }
}
