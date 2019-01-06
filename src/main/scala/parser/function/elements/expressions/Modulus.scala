package parser.function.elements.expressions

import parser.function.elements.Expression
import parser.function.elements.fundamental.Argument

case class Modulus[A: Fractional](expr1: Expression[A], expr2: Expression[A]) extends Expression[A] {
  override def compute(implicit n: Fractional[A]): Option[A] = ???

  override def mapConstants[B: Fractional](f: A => B)(implicit n: Fractional[A]): Unit = ???

  override def replaceArgument(old: Argument[A], updated: Argument[A])(implicit n: Fractional[A]): Unit = ???
}
