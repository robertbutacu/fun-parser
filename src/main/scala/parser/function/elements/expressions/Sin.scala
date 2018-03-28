package parser.function.elements.expressions

import parser.function.elements.Expression

case class Sin[A: Numeric](expr: Expression[A])
