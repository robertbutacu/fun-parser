package parser.function.elements.expressions

import parser.function.elements.Expression

case class Divide[A: Numeric](dividend: Expression[A], divisor: Expression[A])
