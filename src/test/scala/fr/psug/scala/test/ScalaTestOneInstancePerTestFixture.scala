package fr.psug.scala.test

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.{OneInstancePerTest, FunSuite}

/**
 * User: ugo
 * Date: 19/12/11
 */

class ScalaTestOneInstancePerTestFixture extends FunSuite with ShouldMatchers with OneInstancePerTest {
    val builder = new StringBuilder("ScalaTest is ")

    test("fixture trait OneINstancePerTest 1") {
        builder.append("Fun !").toString() should be ("ScalaTest is Fun !")
    }

    test("fixture trait OneINstancePerTest 2") {
        builder.append("Cool !").toString() should be ("ScalaTest is Cool !")
    }

    // TODO: sharing test also exist : http://www.scalatest.org/user_guide/sharing_tests
}