package cwiczenia1

import scala.annotation.tailrec

object Scala_List
  {

    def main(args: Array[String])
    {
      val x = List("PONIEDZIAŁEK", "WTOREK", "ŚRODA", "CZWARTEK", "PIĄTEK", "SOBOTA", "NIEDZIELA")
      println("Task 1")
      println(func_a(x))
      println(func_b(x))
      println(func_c(x))
      println("Task 2")
      println(func_recursion(x))
      println(func_recursion_reverse(x))
      println("Task 3")
      println(func_ogonowa(x))
      println("Task 4")
      println(func_foldl(x))
      println(func_foldr(x))
      println(func_foldl_P(x))
    }

    def  func_a (list: List[String]): String =
    {
      var s = ""
      for(el <- list)
      {
        s +=  el +", "
      }
      s.dropRight(2)
    }
    def  func_b (list: List[String]): String =
    {
      var s = ""
      for(el <- list if el.startsWith("P"))
      {
        s +=  el +", "
      }
      s.dropRight(2)
    }
    def  func_c (list: List[String]): String =
    {
      var s = ""
      var i = 0
      while (i < list.length )
      {
        s +=  list(i) +", "
        i += 1
      }
      s.dropRight(2)
    }
    def func_recursion (list: List[String]): String = list match
      {
        case Nil => ""
        case _ => list.head + ", " + func_recursion(list.tail)
      }
    def func_recursion_reverse (list: List[String]): String = list match
    {
      case Nil => ""
      case _ => func_recursion_reverse(list.tail) + ", " + list.head
    }

    def func_ogonowa(list: List[String]): String =
    {
      var res = ""
      @tailrec
      def iter(i: Int, res: String ): String ={
        if (i >= list.length) res.dropRight(2)
        else iter(i+1,res + list(i) +", ")
      }
      iter(0,res)
    }
    def  func_foldl (list: List[String]): String =
    {
      var s = list.foldLeft("")(_+", " + _)
      s.drop(2)
    }
    def  func_foldr (list: List[String]): String =
    {
      var s = list.foldRight("")(_+", " + _)
      s.dropRight(2)
    }
    def  func_foldl_P (list: List[String]): String =
    {
      var s = list.filter(s=>s.startsWith("P")).foldLeft("")(_+", " + _)
      s.drop(2)
    }
  }