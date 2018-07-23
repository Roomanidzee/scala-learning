package basics

class Rational(n: Int, d: Int) {

  require(d != 0)
  private val g = gcd(n.abs, d.abs)

  override def toString: String = n + "/" + d

  def this(n: Int) = this(n, 1)

  private val numer: Int = n / g
  private val denom: Int = d / g

  def +(that: Rational): Rational = new Rational(this.numer * that.denom + that.numer * this.denom, this.denom * that.denom)
  def +(i: Int): Rational = new Rational(this.numer + i * this.denom, this.denom)


  def *(that: Rational): Rational = new Rational(this.numer * that.numer, this.denom * that.denom)

  private def gcd(a: Int, b: Int): Int = {

    if(b == 0){
      a
    }else{
      gcd(b, a % b)
    }

  }

}
