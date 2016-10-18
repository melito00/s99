package mobi.jnkymd

import org.scalatest.FunSpec

class S99Spec extends FunSpec {
  import mobi.jnkymd.s99._
  val l = List(1, 1, 2, 3, 5, 8)
  val str = l.toString

  describe("Working with lists") {
    describe(s"P01: Find the last element of ${str} by last()") {
      it("should equals 8"){
        assert(last(l) == 8)
      }
    }
    describe(s"P02: Find the last but one element of ${str} by penultimate()") {
      it("should equals 5"){
        assert(penultimate(l) == 5)
      }
    }
    describe(s"P03: Find the 2nd element from starting zero of ${str}") {
      it("should equals 2"){
        assert(false)
      }
    }
    describe(s"P04: the number of elements of ${str}") {
      it("should equals 6"){
        assert(false)
      }
    }
    describe(s"P05: Reverse a list ${str}") {
      it("should equals List(8, 5, 3, 2, 1, 1)") {
        assert(false, "pending")
      }
    }
    describe(s"P06: ") {
      it("should equals") (pending)
    }
    describe(s"P07: ") {
      it("should equals") (pending)
    }
  }
}
