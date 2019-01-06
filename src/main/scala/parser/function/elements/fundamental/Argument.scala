package parser.function.elements.fundamental

import parser.function.elements.Expression

case class Argument[A: Fractional](name: String, value: Option[A] = None) extends Expression[A] {
  override def compute(implicit n: Fractional[A]): Option[A] = ???

  override def mapConstants[B: Numeric](f: A => B)(implicit n: Fractional[A]): Unit = ???

  override def replaceArgument(old: Argument[A], updated: Argument[A])(implicit n: Fractional[A]): Unit = ???
}
