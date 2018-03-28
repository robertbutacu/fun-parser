package parser.function.elements.fundamental

case class Argument[A: Numeric](name: String, value: Option[A] = None)
