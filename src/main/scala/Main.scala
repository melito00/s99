package mobi.jnkymd

object s99 {
  def last(l: List[Int]): Int = l match {
    case head :: Nil => head
    case head :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }

  def penultimate(l: List[Int]): Int = {
    return 1
  }
}

object Main {
  def main(args: Array[String]) {
    val l = List(1, 1, 2, 3, 5, 8)

    println(f"last = ${s99.last(l)}%d")
    printf("last = %d\n", s99.last(l))
  }
}
