import scala.annotation.tailrec

object Scala_Task8{
  def main(args: Array[String]): Unit ={
    val x = List(1,0,2,3,0,4,0,5,6,7,0,0,8,9,0)
    println(x)
    println(func_del0(x))
  }
  def func_del0 (list: List[Int]): List[Int] ={
    val result = List[Int]()
    @tailrec
    def temp(result: List[Int], i : Int): List[Int] ={
      if (i >= list.length) result
      else {
        if (!list(i).equals(0)) temp(result:+list(i), i+1)
        else temp(result, i+1)
      }
    }
    temp(result,0)
  }
}