package cwiczenia1

object Scala_Task9 {
  def main(args: Array[String]): Unit ={
    val x = List(0,1,2,3,4,5,6,7,8,9)
    println(x)
    println(func(x))
  }
  def func (list: List[Int]):List[Int]= {
    list.map(element=>element+1)
}
}