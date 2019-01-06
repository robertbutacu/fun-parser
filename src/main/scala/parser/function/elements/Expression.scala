package parser.function.elements

import parser.function.elements.fundamental.Argument

trait Expression[A] {
  def compute(implicit n: Fractional[A]): Option[A]
  def mapConstants[B: Numeric](f: A => B)(implicit n: Fractional[A])
  def replaceArgument(old: Argument[A], updated: Argument[A])(implicit n: Fractional[A])
}
