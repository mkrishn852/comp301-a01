package com.comp301.a01sushi;

import java.util.ArrayList;
import java.util.List;

public class Roll implements Sushi {
  private String name;
  private IngredientPortion[] roll_ingredients;

  public Roll(String name, IngredientPortion[] roll_ingredients) {
    this.name = name;
    List<IngredientPortion> roll_arraylist = new ArrayList<>();
    for (IngredientPortion i : roll_ingredients) {
      roll_arraylist.add(i);
    }
    for (int i = 0; i < roll_arraylist.size(); i++) {
      for (int j = i + 1; j < roll_arraylist.size(); j++) {
        if (roll_arraylist.get(i).getIngredient().equals(roll_arraylist.get(j).getIngredient())) {
          IngredientPortion combined_portion = roll_arraylist.get(i).combine(roll_arraylist.get(j));
          roll_arraylist.set(i, combined_portion);
          roll_arraylist.remove(j);
          j--;
        }
      }
    }
    boolean seaweed_exists = false;
    for (int i = 0; i < roll_arraylist.size(); i++) {
      if (roll_ingredients[i].getName().contentEquals("seaweed")) {
        if (roll_ingredients[i].getAmount() < 0.1) {
          roll_arraylist.set(i, new SeaweedPortion(0.1));
        }
        seaweed_exists = true;
      } // return array
    }
    if (!seaweed_exists) {
      roll_arraylist.add(new SeaweedPortion(0.1));
    }
    this.roll_ingredients = roll_arraylist.toArray(new IngredientPortion[0]);
    // insert seaweed portion if it doesn't already exist in the array
  }

  public String getName() {
    return name;
  }

  public IngredientPortion[] getIngredients() {
    return roll_ingredients.clone();
  }

  public int getCalories() {
    double calories = 0;
    for (IngredientPortion i : roll_ingredients) {
      calories += i.getCalories();
    }
    return (int) Math.round(calories);
  }

  public double getCost() {
    double cost = 0;
    for (IngredientPortion i : roll_ingredients) {
      cost += i.getCost();
    }
    return (double) Math.round((cost * 100.0)) / 100.0;
  }

  public boolean getHasRice() {
    for (IngredientPortion i : roll_ingredients) {
      if (i.getIsRice()) {
        return true;
      }
    }
    return false;
  }

  public boolean getHasShellfish() {
    for (IngredientPortion i : roll_ingredients) {
      if (i.getIsShellfish()) {
        return true;
      }
    }
    return false;
  }

  public boolean getIsVegetarian() {
    for (IngredientPortion i : roll_ingredients) {
      if (!i.getIsVegetarian()) {
        return false;
      }
    }
    return true;
  }
}
