package parser.function.elements.expressions

import parser.function.elements.Expression
import parser.function.elements.fundamental.Argument

case class Divide[A: Fractional](dividend: Expression[A], divisor: Expression[A]) extends Expression[A] {
  override def compute(implicit n: Fractional[A]): Either[String, A] = {
    val divisorResult = divisor.compute

    if(divisorResult.contains(n.zero)) Left("Cannot divide by zero")
    else                               computeBy(dividend, divisor, n.div)
  }

  override def mapConstants[B: Fractional](f: A => B)(implicit n: Fractional[A]): Expression[A] = ???

  override def replaceArgument(old: Argument[A], updated: Argument[A])(implicit n: Fractional[A]): Expression[A] =
    this.copy(dividend = dividend.replaceArgument(old, updated), divisor = divisor.replaceArgument(old, updated))
}

