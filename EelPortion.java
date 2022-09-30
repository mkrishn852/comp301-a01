package com.comp301.a01sushi;

public class EelPortion extends ParentIngredientPortion {

  public EelPortion(double amount) {
    super(new Eel(), amount);
  }

  public IngredientPortion combine(EelPortion other) {
    if (other == null) {
      return this;
    } else if (other.getName().equals(this.getName())) {
      double combined_amount = this.getAmount() + other.getAmount();
      return new EelPortion(combined_amount);
    } else {
      throw new IllegalArgumentException();
    }
  }
}
