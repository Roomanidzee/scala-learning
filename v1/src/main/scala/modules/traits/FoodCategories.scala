package modules.traits

import modules.recipe.Food

trait FoodCategories {

  case class FoodCategory(name: String, foods: List[Food])
  def allCategories: List[FoodCategory]

}
