Live Coding - ScalaTest
===================================================================

L'objectif de ce live coding est de démontrer les utilisations basiques de la librairie [ScalaTest](http://www.scalatest.org/)

Le live coding sera effectué en **Scala 2.9.1**, compilé avec **SBT 0.11.1**

L'axe principal de la présentation sera les utilisations utiles de la bibliothèque pour le **Test Driven Development**.

usages basiques
---------------

1.  [usages pour la déclaration des tests (test() and ignore())](https://github.com/ubourdon/psugScalaTest/blob/master/src/test/scala/fr/psug/scala/test/ScalaTestBasicUses.scala#L26)
2.  [assert de base pour FunSuite](https://github.com/ubourdon/psugScalaTest/blob/master/src/test/scala/fr/psug/scala/test/ScalaTestBasicUses.scala#L30)
3.  [ShouldMatchers](https://github.com/ubourdon/psugScalaTest/blob/master/src/test/scala/fr/psug/scala/test/ScalaTestBasicUses.scala#L34)
4.  [Collections](https://github.com/ubourdon/psugScalaTest/blob/master/src/test/scala/fr/psug/scala/test/ScalaTestBasicUses.scala#L46)
5.  [Matcher sur les String](https://github.com/ubourdon/psugScalaTest/blob/master/src/test/scala/fr/psug/scala/test/ScalaTestBasicUses.scala#L56)
6.  [Condition booléenne sur un objet](https://github.com/ubourdon/psugScalaTest/blob/master/src/test/scala/fr/psug/scala/test/ScalaTestBasicUses.scala#L71)
7.  [Tester la référence mémoire](https://github.com/ubourdon/psugScalaTest/blob/master/src/test/scala/fr/psug/scala/test/ScalaTestBasicUses.scala#L83)
8.  [Vérification sur les nombre décimaux](https://github.com/ubourdon/psugScalaTest/blob/master/src/test/scala/fr/psug/scala/test/ScalaTestBasicUses.scala#L88)
9.  [Utilisation des expressions logiques 'and' et 'or'](https://github.com/ubourdon/psugScalaTest/blob/master/src/test/scala/fr/psug/scala/test/ScalaTestBasicUses.scala#L94)
10. [Matcher 'have' pour vérifier les propriétés d'un objet](https://github.com/ubourdon/psugScalaTest/blob/master/src/test/scala/fr/psug/scala/test/ScalaTestBasicUses.scala#L109)
11. [Vérification sur les exceptions](https://github.com/ubourdon/psugScalaTest/blob/master/src/test/scala/fr/psug/scala/test/ScalaTestBasicUses.scala#L117)

usages "avancés"
----------------

1.  BeforeAndAfter Trait
2.  Tag ??? marche pas avec mon sbt pour l'instant (ou je sais pas l'utiliser plutôt :) )
3.  Mockito
4.  travail sur les propriétés de listes d'objets
5.  fixture (alternative immutable de before and after)
6.  OneInstancePerTest Trait voir *ScalaTestOneInstancePerTestFixture*
7.  [Custom Be Property Matchers](http://www.scalatest.org/scaladoc/1.6.1/org/scalatest/matchers/BePropertyMatcher.html)
8.  [Custom Have Property Matchers](http://www.scalatest.org/scaladoc/1.6.1/org/scalatest/matchers/HavePropertyMatcher.html)
