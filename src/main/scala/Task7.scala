object Scala_Options{
  def main(args: Array[String]): Unit ={
    val products = Map("MARGHERITA" -> 31.99, "CAPRICCIOSA" -> 37.45, "PEPPERONI " -> 36.65,
      "MONTANARA" -> 35.45, "DIAVOLA" -> 30.0)
    println(getEL(products.get("DIAVOLA")))
    println(getEL(products.get("PASTA")))

  }
  def getEL(x: Option[Double]) = x match {
    case Some(s) => "Price = " + s
    case None => "No such pizza in menu"
  }
}
