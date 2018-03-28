package parser.function.elements.expressions

import parser.function.elements.Expression

case class Multiply[A: Numeric](expr1: Expression[A], expr2: Expression[A])
