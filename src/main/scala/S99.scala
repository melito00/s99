package mobi.jnkymd.s99

object p01 {
  def last2[A](l: List[A]): A = {
    l.last
  }
}

object S99 {
  def main(args: Array[String]): Unit = {
    import p01._
    println(last2(List(1,2,3,4)))
  }
}
