import scala.annotation.tailrec

case class Student(name: String, height: Int)

// Exercise 3.1
def extract_names(l: List[Student]): List[String] = l match {
  case Nil => Nil
  case h :: t => h.name :: extract_names(t)
}

// Exercise 3.2
def tall(l: List[Student]): List[Student] = l match {
  case Nil => Nil
  case h :: t => if (h.height > 170) h :: tall(t) else tall(t)
}

// Exercise 3.3
def length(l: List[Int]): Int = {
  @tailrec def aux(l: List[Int], n: Int): Int = l match {
    case Nil => n
    case h :: t => aux(t, n + 1)
  }
  aux(l, 0)
}

// Exercise 3.4
def append(l: List[Int], n: Int): List[Int] = l match {
  case Nil => List(n)
  case h :: t => h :: append(t, n)
}

@main def main_func: Unit =
  val l_test1: List[Student] = Student("Jim", 165) :: Student("Lyla", 171) :: Student("Tom", 180) :: Nil
  println(extract_names(l_test1))
  println(tall(l_test1))

  val l_test2: List[Int] = List(1, 5, 3, 7, 0, 2)
  println(length(l_test2))
  println(append(l_test2, 9))
