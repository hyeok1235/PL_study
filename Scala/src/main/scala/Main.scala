// Exercise 4.1
def incBy(l: List[Int], n: Int): List[Int] = {
  l.map(_ + n)
}

// Exercise 4.2
def gt(l: List[Int], n: Int): List[Int] = {
  l.filter(_ <= n)
}

// Exercise 4.3
def append(l: List[Int], n: Int): List[Int] = {
  l.foldRight(n :: Nil)(_ :: _)
}

// Exercise 4.4
def reverse(l: List[Int]): List[Int] = {
  l.foldLeft(Nil: List[Int])((h, t) => t :: h)
}

@main def main_func: Unit =
  println(incBy(List(1, 3, 5, 7), 3))
  println(gt(List(1, 3, 5, 7), 4))
  println(append(List(1, 3, 5, 7), 9))
  println(reverse(List(1, 3, 5, 7)))
