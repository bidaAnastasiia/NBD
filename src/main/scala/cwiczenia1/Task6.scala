package cwiczenia1

object Scala_Touples
{
  def main(args: Array[String])
  {
    val t = new Tuple3(3, "some word", 21.5)
    func_print(t)
  }

  def func_print (t: (Int, String, Double)): Unit ={
    println(t._1)
    println(t._2)
    println(t._3)
  }
}