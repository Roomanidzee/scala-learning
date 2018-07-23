package modules.recipe

abstract class Food(val name: String) {
  override def toString: String = "Food: " + this.name
}
