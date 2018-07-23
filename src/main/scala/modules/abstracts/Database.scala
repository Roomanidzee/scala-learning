package modules.abstracts

import modules.recipe.{Food, Recipe}
import modules.traits.FoodCategories

abstract class Database extends FoodCategories{

  def allFoods: List[Food]
  def allRecipes: List[Recipe]

  def findByName(name: String): Option[Food] = allFoods.find(_.name == name)

}
