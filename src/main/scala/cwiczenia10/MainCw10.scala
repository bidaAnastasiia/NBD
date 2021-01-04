package cwiczenia10

import java.time.Year

object MainCw10 {
  def main(args: Array[String]): Unit =
  {
    val test = pairsGenerator.buffered
    println(test.next)
    println(test.next)
    println(test.next)
    println(test.next)
    println(test.next)
    test take 15 foreach println

    println()
    //Task 2
    val yes = new Yes[List[Int]](value = List(3,5,7))
    def minusOne(i:Int):Int = i-1
    println("Map:")
    println(yes.map(minusOne,yes._value))
    val yesStr = new Yes[List[String]](value = List("happy new year!", "merry christmas"))
    def testFM(i:String):List[String] = i.split("").map(_.trim).toList
    println("FlatMap:")
    println(yes.flatmap(testFM,yesStr._value))


  }

  def pairsGenerator: Iterator[(Int, Int)] = for{
    a <- Iterator.from(1)
    b <- 1 until a+1 if a % b == 0
  } yield (a,b)

}
