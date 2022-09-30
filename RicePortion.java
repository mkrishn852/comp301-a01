package com.comp301.a01sushi;

public class RicePortion extends ParentIngredientPortion {

  public RicePortion(double amount) {
    super(new Rice(), amount);
  }

  public IngredientPortion combine(RicePortion other) {
    if (other == null) {
      return this;
    } else if (other.getName().equals(this.getName())) {
      double combined_amount = this.getAmount() + other.getAmount();
      return new RicePortion(combined_amount);
    } else {
      throw new IllegalArgumentException();
    }
  }
}
