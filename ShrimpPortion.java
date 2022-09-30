package com.comp301.a01sushi;

public class ShrimpPortion extends ParentIngredientPortion {

  public ShrimpPortion(double amount) {
    super(new Shrimp(), amount);
  }

  public IngredientPortion combine(ShrimpPortion other) {
    if (other == null) {
      return this;
    } else if (other.getName().equals(this.getName())) {
      double combined_amount = this.getAmount() + other.getAmount();
      return new ShrimpPortion(combined_amount);
    } else {
      throw new IllegalArgumentException();
    }
  }
}
