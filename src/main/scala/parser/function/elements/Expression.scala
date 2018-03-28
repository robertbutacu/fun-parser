package parser.function.elements

trait Expression {
  def compute[A: Numeric]: Option[A]
  def mapConstants[A: Numeric,B: Numeric](f: A => B)
  def replace
}
