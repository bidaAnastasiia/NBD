package cwiczenia9

object Main {
  def main(args: Array[String]): Unit = {
    println("TASK 1")
    val container1 = new Container[String]("55")
    println(container1.getContent)
    def applyC (a:String) = a.toDouble
    println(container1.applyFunction[Double](applyC))


    println()
    println("TASK 2")
    val no = new No
    val yes = new Yes[Int](5)
    println(no.isInstanceOf[Maybe[Object]]) //true
    println(yes.isInstanceOf[Maybe[Object]]) //true

    println()
    println("TASK 3")
    def applyYesNo (a:Int) = a.toDouble
    val yes1 = yes.applyFunction[Double](applyYesNo)
    val no1 = no.applyFunction[Double](applyYesNo)
    println(yes.getValue)
    println(yes1.getValue)
    println(yes1.getClass)
    println(no1.getClass)

    println()
    println("TASK 4")
    println(yes.getOrElse(8))
    println(no.getOrElse(555))
  }

}
