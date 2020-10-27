package cwiczenia1

object Scala_Task10{
  def main(args: Array[String]): Unit ={
    val list = List(-9.6,-4,-5.067,-5,-8,0,13.86,2,37.4,40,5.607,6)
    println(list)
    println("[-5;12]: "+ func(list,-5,12))
  }

  def func (list: List[Double], from: Double,to:Double):List[Double]={
    list.filter(x=> x >= from && x <= to)
  }
}