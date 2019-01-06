package parser.function.elements.fundamental

import parser.function.elements.Expression

case class Constant[A: Fractional](value: A) extends Expression[A] {
  override def compute(implicit n: Fractional[A]): Option[A] = ???

  override def mapConstants[B: Fractional](f: A => B)(implicit n: Fractional[A]): Unit = ???

  override def replaceArgument(old: Argument[A], updated: Argument[A])(implicit n: Fractional[A]): Unit = ???
}

