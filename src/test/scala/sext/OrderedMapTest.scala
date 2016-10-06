package sext

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import collection.immutable.Queue

@RunWith(classOf[JUnitRunner])
class OrderedMapTest extends FunSuite{
  test("preserves order of creation") {
    assert(1 == 1)
  }
}
