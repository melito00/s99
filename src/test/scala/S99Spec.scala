package mobi.jnkymd

import org.scalatest._
import matchers.should._
import org.scalatest.funspec.AnyFunSpec

class S99Spec extends AnyFunSpec with Matchers with GivenWhenThen {
  import mobi.jnkymd.s99._
  val l = List(1, 1, 2, 3, 5, 8)
  val str = l.toString

  describe(s"Working with lists ${l}") {
    describe(s"P01: Finding the last element of a list by last()") {
      it("should equal 8"){
        assert(last(l) == 8)
      }
    }
    describe(s"P02: Find the last but one element of a list by penultimate()") {
      it("should equal 5"){
        assert(penultimate(l) == 5)
      }
    }
    describe(s"P03: Find the 2nd element from starting zero of ${str}") {
      it("should equal 2"){
        assert(false)
      }
    }
    describe(s"P04: the number of elements of ${str}") {
      it("should equal 6"){
        assert(false)
      }
    }
    describe(s"P05: Reverse a list ${str}") {
      it("should equal List(8, 5, 3, 2, 1, 1)") {
        assert(false, "pending")
      }
    }
    describe(s"P06: Find out whether a list is a palindrome") {
      it("should equal") (pending)
    }
    describe(s"P07: Flatten a nested list structure.") {
      it("should equal") (pending)
    }
  }
}
