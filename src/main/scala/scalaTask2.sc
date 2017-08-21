class Fraction(n:Int,d:Int) {
  println("The Numerator is "+ n)
  println("The Denominator is "+ d)
  println(n + "/" + d)
 // val f:Float=n/d
  println("Decimal:"+ (n/d).toDouble)
}
val x= new Fraction(12,3)