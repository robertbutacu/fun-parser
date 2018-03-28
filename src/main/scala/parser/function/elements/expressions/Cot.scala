package parser.function.elements.expressions

import parser.function.elements.Expression

case class Cot[A: Numeric](expr: Expression[A])
