package cwiczenia10

trait  Maybe[A]  {
  def map[R,B](f: R => B, list: List[R]): List[B] = {
    for {
      x <- list
    } yield f(x)
  }

  def flatmap[R,B] (f: R =>List[B], list: List[R]):List[B]={
    val mapping = map(f,list)
    for{
      x <- mapping
      y <- x
    } yield y
  }

}
class No extends Maybe[Nothing]{
  def applyFunction[R](f:Nothing=>R): Maybe[Nothing] ={
    new No
  }
  def getOrElse[B >: Nothing](default: ⇒ B): B = default
}

 class Yes[A](value:A) extends Maybe[A] {
  var _value:A = value
  def getValue: A = _value
  def applyFunction[R](f:A=>R): Yes[R] ={
    new Yes[R](f(_value))
  }
  def getOrElse[B >: A](default: ⇒ B): A=value

}

