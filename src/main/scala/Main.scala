package mobi.jnkymd

object s99 {
  def last(l: List[Int]): Int = l match {
    case head :: Nil => head
    case head :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }

  def penultimate[A](l: List[A]): A = {
    l match {
      case x :: y :: Nil => x
      case x :: xs => penultimate(xs)
      case _ => throw new NoSuchElementException
    }
  }
}

//   def pack[A](l: List[A]): List[List[A]] = {
//
//   }
// }

object Main {
  def main(args: Array[String]): Unit = {
    val l = List(1, 1, 2, 3, 5, 8)

    println(f"last = ${s99.last(l)}%d")
    printf("last = %d\n", s99.last(l))
  }
}
