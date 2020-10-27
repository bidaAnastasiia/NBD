package cwiczenia2

object Main {
  def main(args: Array[String]): Unit = {
    val workdays = List("PONIEDZIAŁEK", "WTOREK", "ŚRODA", "CZWARTEK", "PIĄTEK")
    println("TASK 1")
    println("wtorek - " + checkDay("wtorek"))
    println("sobota - " + checkDay("sobota"))
    println("monday - " + checkDay("monday"))

    println()
    println("TASK 2")
    val kontoBankowe = new KontoBankowe(100)
    println("KONTO 1. Stan konta: " + kontoBankowe.stanKonta)
    println("Wplata +200")
    kontoBankowe.wplata(200)
    println("KONTO 1. Stan konta: " + kontoBankowe.stanKonta)
    println("Wyplata -150")
    kontoBankowe.wyplata(150)
    println("KONTO 1. Stan konta: " + kontoBankowe.stanKonta)
    val kontoBankowe2 = new KontoBankowe()
    println("KONTO 2. Stan konta: " + kontoBankowe2.stanKonta)
    println("Wyplata -150")
    kontoBankowe2.wyplata(150)
    println("KONTO 2. Stan konta: " + kontoBankowe2.stanKonta)

    println()
    println("TASK 3")
    val person1 = new PersonHello("Harry", "Potter")
    val person2 = new PersonHello("Newton", "Scamander")
    val person3 = new PersonHello("Tom", "Riddle")
    val person4 = new PersonHello("Ryan", "Murphy")
    greetings(person1)
    greetings(person2)
    greetings(person3)
    greetings(person4)

    println()
    println("TASK 4")

    def square(n: Int) = n * n

    def squared3(f: Int => Int, number: Int) = f(f(f(number)))

    var res = squared3(square, 2)
    println(res)

    println()
    println("TASK 5")
    var student = new Student {}
    var worker = new Worker {}
    var teacher = new Teacher {}
    worker.salary = 4000
    teacher.salary = 3500
    println("Student tax = " + student.tax)
    println("Worker tax = " + worker.tax)
    println("Worker salary = " + worker.salary)
    println("Teacher tax = " + teacher.tax)
    println("Teacher salary = " + teacher.salary)
    var personStudentWorker = new Student with Worker {}
    var personWorkerStudent = new Worker with Student {}
    personStudentWorker.salary = 3000
    personWorkerStudent.salary = 3000
    println("new Student with Worker tax = " + personStudentWorker.tax)
    println("new Student with Worker salary = " + personStudentWorker.salary)
    println("new Worker with Student tax = " + personWorkerStudent.tax)
    println("new Worker with Student salary = " + personWorkerStudent.salary)
  }

  def checkDay(s: String) = s match {
    case a if List("poniedziałek", "wtorek", "środa", "czwartek", "piątek").contains(a) => "Praca"
    case b if List("sobota", "niedziela").contains(b) => "Weekend"
    case _ => "Nie ma takiego dnia"
  }

  case class PersonHello(name: String, surname: String)

  def greetings(p: PersonHello): Unit = p match {
    case PersonHello("Harry", "Potter") => println(s"Welcome to Gryffindor, ${p.name}!")
    case PersonHello("Newton", "Scamander") => println(s"Welcome to Hufflepuff, ${p.name}!")
    case PersonHello("Tom", "Riddle") => println(s"Welcome to Slytherin, ${p.name}!")
    case PersonHello(name, surname) => println("Hi, muggle, " + name + " " + surname + "!")
  }
}
