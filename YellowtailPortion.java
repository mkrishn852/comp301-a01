package com.comp301.a01sushi;

public class YellowtailPortion extends ParentIngredientPortion {

  public YellowtailPortion(double amount) {
    super(new Yellowtail(), amount);
  }

  public IngredientPortion combine(YellowtailPortion other) {
    if (other == null) {
      return this;
    } else if (other.getName().equals(this.getName())) {
      double combined_amount = this.getAmount() + other.getAmount();
      return new YellowtailPortion(combined_amount);
    } else {
      throw new IllegalArgumentException();
    }
  }
}
