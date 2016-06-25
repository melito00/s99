package mobi.jnkymd.s99

import org.scalatest.FunSpec
import org.scalatest.DiagrammedAssertions

class S99Spec extends FunSpec with DiagrammedAssertions {
  import mobi.jnkymd.s99._

  val l = List(1, 1, 2, 3, 5, 8)
  val str =   l.toString()

  describe(s"P01: Find the last element of ${str}") {
    it("should equals 8"){
      assert(p01.last2(l) == 8)
    }
  }
  describe(s"P02: Find the last but one element of ${str}") {
    it("should equals 5"){
      assert(false)
    }
  }
  describe(s"P03: Find the 2nd element of ${str} from starting zero") {
    it("should equals 2"){
      assert(false)
    }
  }
  describe(s"P04: Find the number of  element of ${str}") {
    it("should equals 6"){
      assert(false)
    }
  }
}

