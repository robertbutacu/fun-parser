package parser.function.elements.fundamental

import parser.function.elements.Expression

case class Argument[A: Fractional](name: String, value: Option[A] = None) extends Expression[A] {
  override def compute(implicit n: Fractional[A]): Either[String, A] = value.toRight[String](s"The value is not defined for $name")

  override def mapConstants[B: Fractional](f: A => B)(implicit n: Fractional[A]): Expression[A] = ???

  override def replaceArgument(old: Argument[A], updated: Argument[A])(implicit n: Fractional[A]): Expression[A] =
    if(this == old) updated
    else            this
}
