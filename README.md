Paris Scala User Group - 19 décembre 2011 - Live Coding - ScalaTest
===================================================================

L'objectif de ce live coding est de démontré les utilisations basiques de la librairie [ScalaTest](http://www.scalatest.org/)

Plus précisemment, il s'agit d'un retour d'expérience de la mise en place et l'utilisation de cette
bibliothèque de test dans un projet codé en Scala 2.9.1 mené de Juin à Décembre 2011 chez VIDAL.

Le live coding sera effectué en **Scala 2.9.1**, compilé avec **SBT 0.11.1**

L'axe principal de la présentation sera les utilisations utiles de la bibliothèque pour le **Test Driven Development**.

usages basiques
---------------

1.  usages pour la déclaration des tests (test() and ignore())
2.  assert de base pour FunSuite
3.  ShouldMatchers
4.  Matcher sur les String
5.  Condition booléenne sur un objet
6.  Tester la référence mémoire
7.  Vérification sur les nombre décimaux
8.  Utilisation des expressions logiques 'and' et 'or'
9.  Matcher 'have' pour vérifier les propriétés d'un objet
10. Vérification sur les exceptions

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