package parser.function.elements.expressions

import parser.function.elements.Expression
import parser.function.elements.fundamental.Argument

case class Multiply[A: Fractional](expr1: Expression[A], expr2: Expression[A]) extends Expression[A] {
  override def compute(implicit n: Fractional[A]): Either[String, A] = computeBy(expr1, expr2, n.times)

  override def mapConstants[B: Fractional](f: A => B)(implicit n: Fractional[A]): Expression[A] = ???

  override def replaceArgument(old: Argument[A], updated: Argument[A])(implicit n: Fractional[A]): Expression[A] = ???
}

