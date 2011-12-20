package fr.psug.scala.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import collection.immutable.Map

/**
 * User: ugo
 * Date: 04/12/11
 */

case class Toto(name: String, list: List[String] = List("yep", "yop")) {

    def doThat: String = "I do that"

    def isReal: Boolean = true

    def isToto: Boolean = this.isInstanceOf[Toto]
}

class ScalaTestBasicUses /*extends FunSuite with ShouldMatchers*/ {

    //TODO [Commentaire] Pourquoi j'étend FunSuite alors que c'est un trait ?
    // Parce que je vais utiliser d'autres traits ensuite qui étendent FunSuite

    /*ignore("ce test ne va pas s'executer") {
        false should be (true)
    }

    test("assert de base de FunSuite") {
        assert("toto" === "toto")
    }

    test("utilisation basic des 'matchers' should") {
        true should be (true)                        //TODO pourquoi on doit mettre des () après be
        Toto("toto") should not be Toto("tata")     //TODO pourquoi les () ne sont pas nécessaires
        Toto("toto") should be (Toto("toto"))
        Toto("titi") should equal (Toto("titi"))

        3 should be > 2
        3 should  be >= 3
        3 should be < 7
        3 should be <= 3
    }

    test("utilisation sur les Collections") {
        List(1,2,3) should contain (2)
        List(1,2,3) should not contain 4
        List(1,2,3) should have size 3
        List(1,2,3) should have length 3

        Map((1,"toto")) should contain value "toto"
        Map((1,"toto")) should contain key 1
    }

    test("matcher sur les String") {
        val testingString = "Hello man, how are you ?"

        testingString should startWith ("Hello")
        testingString should endWith ("?")
        testingString should include ("how")

        //TODO [Commentaire] propose que length et pas size car string => infère sur les type testés
        testingString should have length testingString.length()

        testingString should include regex "H*o"
        testingString should  startWith regex ".ello"
        //testingString should fullyMatch regex "Hello man, how are you ?"
    }

    test("condition booleènne sur un objet") {
        //TODO [Commentaire] - si un objet possède une méthode sans paramètre qui retourne un boolean
        List() should be ('empty)

        List(1,2,3).hasDefiniteSize should be (true)
        List(1,2,3) should be ('hasDefiniteSize)

        Toto("toto") should be ('isReal)
        Toto("toto") should be ('real)
        Toto("toto") should be a 'toto
    }

    test("tester la référence mémoire") {
        val toto = Toto("toto")
        toto should be theSameInstanceAs toto
    }

    test("vérification sur un nombre décimal") {
        val seven = 7.0
        seven should be (7.0)
        seven should be (6.9 plusOrMinus 0.2)
    }

    test("utilisation des expressions logiques 'and' et 'or' ") {
        3 should (
            be < 4 and
            be > 2
        )

        "toto" should (
            startWith ("tata") or       //TODO remplace par and pour illuster TODO suivant
            endWith {println("yo man !");"toto"}
        )
        // TODO [Commentaire] - execute chaque condition même si la première lève une TestFailedException
        // TODO [Commentaire] - map should (not be (null) and contain key ("ouch")) renvoie NullPointerException, faut séparer les deux assertions si on veut une exception plus claire
        // TODO [Commentaire] - à la différence de && et ||, 'and' et 'or' ont la meme précédance
    }

    test("vérification des propriétés d'un objet avec le mot 'have' ") {
        Toto("toto") should have (
            'name ("toto"),
            'list (List("yep", "yop"))
        )
        // TODO [Commentaire] - marche avec les propriétés publiques, ou avec les méthode de type javaBean get ou is
    }

    test("et les exceptions") {
        val exception = evaluating {
            throw new IllegalArgumentException("une exception")
        } should produce[IllegalArgumentException]

        exception should have ('message ("une exception"))
    }*/
}