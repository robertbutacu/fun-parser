package parser.function.elements

import parser.function.elements.fundamental.Argument

trait Expression[A] {
  def compute(implicit n: Fractional[A]): Either[String, A]
  def mapConstants[B: Fractional](f: A => B)(implicit n: Fractional[A]): Expression[A]
  def replaceArgument(old: Argument[A], updated: Argument[A])(implicit n: Fractional[A]): Expression[A]

  protected def computeBy(left: Expression[A], right: Expression[A], byFunc: (A, A) => A)(implicit n: Fractional[A]): Either[String, A] =
    for {
      l <- left.compute
      r <- right.compute
    } yield byFunc(l, r)
}
