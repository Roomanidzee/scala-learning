package modules.db

import modules.abstracts.Database
import modules.recipe.{Apple, Cream, FruitSalad, Orange, Sugar}
import modules.recipe.Recipe

object SimpleDatabase extends Database{

  def allFoods = List(Apple, Orange, Cream, Sugar)
  def allRecipes: List[Recipe] = List(FruitSalad)

  private var categories = List(FoodCategory("fruits", List(Apple, Orange)), FoodCategory("misc", List(Cream, Sugar)))
  override def allCategories: List[SimpleDatabase.FoodCategory] = this.categories
}
