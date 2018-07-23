package modules.recipe

class Recipe(val name: String, val ingredients: List[Food], val instructions: String) {
  override def toString: String = "Recipe: " + this.name
}
