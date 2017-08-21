class Animal(name:String,legs:Int){
  def this(name:String)= this(name,4)
  def this()=this("Animal",4)

  println(s"Name is: "+name
    +" & Legs count is " + legs)
}

val a= new Animal()
val b= new Animal("Bear",4)
val c= new Animal("Cow")



def double(n:Int):Int={n*2}
double(4)



