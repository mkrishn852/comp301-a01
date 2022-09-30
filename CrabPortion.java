package com.comp301.a01sushi;

public class CrabPortion extends ParentIngredientPortion {

  public CrabPortion(double amount) {
    super(new Crab(), amount);
  }

  public IngredientPortion combine(CrabPortion other) {
    if (other == null) {
      return this;
    } else if (other.getName().equals(this.getName())) {
      double combined_amount = this.getAmount() + other.getAmount();
      return new CrabPortion(combined_amount);
    } else {
      throw new IllegalArgumentException();
    }
  }
}
