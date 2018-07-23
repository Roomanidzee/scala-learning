package modules.abstracts

import modules.recipe.{Food, Recipe}

abstract class Browser {

  val database: Database

  def recipesUsing(food: Food): List[Recipe] =
    database.allRecipes.filter(recipe => recipe.ingredients.contains(food))

  def displayCategory(category: database.FoodCategory): Unit = println(category)

}
