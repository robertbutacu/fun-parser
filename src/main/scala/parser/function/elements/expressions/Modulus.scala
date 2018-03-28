package parser.function.elements.expressions

import parser.function.elements.Expression

case class Modulus[A: Numeric](expr1: Expression[A], expr2: Expression[A])