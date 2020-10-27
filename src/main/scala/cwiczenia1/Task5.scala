package cwiczenia1

object Scala_Map
{
  def main(args: Array[String])
  {
    val products = Map("MARGHERITA" -> 31.99, "CAPRICCIOSA" -> 37.45, "PEPPERONI " -> 36.65,
      "MONTANARA" -> 35.45, "DIAVOLA" -> 30.0)

    println(products.keys)
    println(products.values)

    val pr2 = products.map({ case (k, v) => k ->  (math rint v * 0.9 * 100) / 100 })

    println(pr2.keys)
    println(pr2.values)
  }
}