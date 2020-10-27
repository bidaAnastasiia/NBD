package cwiczenia2

class KontoBankowe(private var _stanKonta: Double = 0) {

  def stanKonta = _stanKonta;

  def wplata(sum: Int): Unit = {
    _stanKonta += sum
  }

  def wyplata(sum: Int): Unit = {
    if (_stanKonta < sum)
      printWarning
    else
      _stanKonta -= sum
  }
  private def printWarning = println("WARNING: Not enough money!")
}




