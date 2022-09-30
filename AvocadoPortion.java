package com.comp301.a01sushi;

public class AvocadoPortion extends ParentIngredientPortion {

  public AvocadoPortion(double amount) {
    super(new Avocado(), amount);
  }

  public IngredientPortion combine(AvocadoPortion other) {
    if (other == null) {
      return this;
    } else if (other.getName().equals(this.getName())) {
      double combined_amount = this.getAmount() + other.getAmount();
      return new AvocadoPortion(combined_amount);
    } else {
      throw new IllegalArgumentException();
    }
  }
}
