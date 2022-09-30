package com.comp301.a01sushi;

public class TunaPortion extends ParentIngredientPortion {

  public TunaPortion(double amount) {
    super(new Tuna(), amount);
  }

  public IngredientPortion combine(TunaPortion other) {
    if (other == null) {
      return this;
    } else if (other.getName().equals(this.getName())) {
      double combined_amount = this.getAmount() + other.getAmount();
      return new TunaPortion(combined_amount);
    } else {
      throw new IllegalArgumentException();
    }
  }
}
