//val start=101
//val end=105
val r= new scala.util.Random
//val x=start+r.nextInt((end-start)+1)
//println(x)
val rand:Double=r.nextInt(100)
val greaterThanFive={
  if (rand>5)
    true
  else
    false}
var isBlue:String="Blue"
//val rand:Double=r.nextInt(100)
if (rand >30 && greaterThanFive ) {
  println(isBlue)
  true
  }
else{
  isBlue="Red"
  println(isBlue)
  false
 }

