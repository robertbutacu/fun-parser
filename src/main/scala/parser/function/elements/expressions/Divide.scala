package parser.function.elements.expressions

import parser.function.elements.Expression
import parser.function.elements.fundamental.{Argument, Constant}

case class Divide[A: Fractional](dividend: Expression[A], divisor: Expression[A]) extends Expression[A] {
  override def compute(implicit n: Fractional[A]): Either[String, A] = {
    val divisorResult = divisor.compute

    def go(): Either[String, A] =
      for {
        right  <- divisorResult
        result <- computeBy(dividend, Constant("", right), n.div)
      } yield result

    if(divisorResult.contains(n.zero)) Left("Cannot divide by zero")
    else                               go()
  }

  override def mapConstants[B: Fractional](f: A => B)(implicit n: Fractional[A]): Expression[A] = ???

  override def replaceArgument(old: Argument[A], updated: Argument[A])(implicit n: Fractional[A]): Expression[A] =
    this.copy(dividend = dividend.replaceArgument(old, updated), divisor = divisor.replaceArgument(old, updated))
}

