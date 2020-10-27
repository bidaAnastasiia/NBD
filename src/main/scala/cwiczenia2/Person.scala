package cwiczenia2

class Person (private var _name:String = "Marta" , private var _surname:String = "Nielson" , private var _tax:Double = 0){
  def name: String = _name
  def surname:String =_surname
  def tax:Double = _tax
}

trait Student extends Person {
  override def tax:Double = 0
}

trait Teacher extends Worker {
  override def tax:Double = 0.1
}

trait Worker extends Person {
  private var _salary:Double = 0
  def salary = _salary
  def salary_= (newValue:Double):Unit = _salary = newValue * (1-tax)
  override def tax:Double = 0.2
}

