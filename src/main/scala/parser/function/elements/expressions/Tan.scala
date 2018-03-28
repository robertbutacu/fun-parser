package parser.function.elements.expressions

import parser.function.elements.Expression

case class Tan[A: Numeric](expr: Expression[A])
