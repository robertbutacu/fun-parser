package parser.function.elements

import parser.function.elements.fundamental.Argument

trait Expression {
  def compute[A: Numeric]: Option[A]
  def mapConstants[A: Numeric,B: Numeric](f: A => B)
  def replaceArgument[A: Numeric](old: Argument[A], updated: Argument[A])
}
