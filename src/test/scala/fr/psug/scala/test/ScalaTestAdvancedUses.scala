package fr.psug.scala.test

import org.scalatest.mock.MockitoSugar

import org.mockito.Mockito._
import org.scalatest.{Tag, BeforeAndAfter, FunSuite}
import org.scalatest.matchers.{BePropertyMatchResult, BePropertyMatcher, ShouldMatchers}

/**
 * User: ugo
 * Date: 11/12/11
 */

trait TotoCustomMatchers {
    class TotoIsRealBePropertyMatcher extends BePropertyMatcher[Toto] {
        def apply(toto: Toto) = BePropertyMatchResult(toto.isReal, "real")
    }

    val real = new TotoIsRealBePropertyMatcher
}

class ScalaTestAdvancedUses extends FunSuite
    with ShouldMatchers
    with BeforeAndAfter
    with MockitoSugar
    with TotoCustomMatchers {

    var toto: String = _
    var num: Int = _

    before {
       toto = "toto"
    }

    after {
        num = 0
    }

    test("toto est valué dans le before") {
        toto should be ("toto")
        num = 5
    }

    test("après chaque test num est remit à zéro") {
        num should be (0)
    }

    test("je peux utiliser des étiquettes pour mes tests", Tag("aTag")) {
        true should be (true) // marche pas avec sbt ???
    }

    test("utilisation doublure de test avec mockito") {
        val testDouble: Toto = mock[Toto]
        when(testDouble.isReal).thenReturn(false)

        testDouble.isReal should be (false)
    }

    test("retour sur les listes, équivalent on property de FestAssert => natif avec Scala !!!") {
        val totos: List[Toto] = List(Toto("toto"), Toto("tata"))

        // Scala ça déchire sa maman quand même
        totos.map( _.name ) should ( have size (2) and contain ("toto") and contain ("tata") )
    }

    test("une alternative fonctionnelle et immutable au before and after => fixture") {
        val fixt = fixture
        fixt.num should be (3)
        // TODO on peut utiliser la fixture sous forme de trait au lieu d'une méthode
    }

    test("custom be property matcher") {
        val toto: Toto = Toto("toto")
        toto should be ('real) // TODO pas statiquement typé, utilise reflexion => moyen d'introduire le custom

        toto should be (real)
    }

    ignore("custom have property matchers") {
        /*Toto("titi", List("oula")) should have (
            name ("titi"),
            list (List("oula"))
        )*/
        // TODO : http://www.scalatest.org/scaladoc/1.6.1/org/scalatest/matchers/HavePropertyMatcher.html
    }

    def fixture = {
        new {
            val num: Int = 3
        }
    }

}