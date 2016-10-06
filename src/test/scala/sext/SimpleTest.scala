package sext

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import collection.immutable.Queue

@RunWith(classOf[JUnitRunner])
class SimpleTest extends FunSuite{
  test("1 is equal to 1") {
    assert(1 == 1)
  }

  test("failing test") {
    assert(1 == 2)
  }
}
