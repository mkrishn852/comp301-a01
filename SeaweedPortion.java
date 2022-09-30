package com.comp301.a01sushi;

public class SeaweedPortion extends ParentIngredientPortion {

  public SeaweedPortion(double amount) {
    super(new Seaweed(), amount);
  }

  public IngredientPortion combine(SeaweedPortion other) {
    if (other == null) {
      return this;
    } else if (other.getName().equals(this.getName())) {
      double combined_amount = this.getAmount() + other.getAmount();
      return new SeaweedPortion(combined_amount);
    } else {
      throw new IllegalArgumentException();
    }
  }
}
