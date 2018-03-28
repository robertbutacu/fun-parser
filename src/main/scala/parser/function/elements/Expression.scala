package parser.function.elements

import parser.function.elements.fundamental.Argument

abstract class Expression[A] {
  def compute: Option[A]
  def mapConstants[B: Numeric](f: A => B)
  def replaceArgument(old: Argument[A], updated: Argument[A])
}
