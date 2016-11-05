Case classes
============

Из предыдущего раздела вы узнали о том, что представляют собой
`case object`. На `case classes` можно смотреть как за записи в
функциональных языках, или как неизменяемые (immutable) java beans.

Экземпляр данного класса может быть использован для сопоставления с
образцом, для него определены `equals` и `hashcode`, сериализация и
`toString`. Также он является наследнком трейта `Product`.

`case class`ы так же широко используются для составления `ADT` как и
`case objects`.

Для каждого `case class` существует объект-компаньер (companion object),
который содержит метод `apply`. Поэтому для создания `case class` не
требуется ключевое слово `new`.

    case class Monster(health: Int = 100,
                       wearpon: Wearpon = Claws,
                       name: String)
                       
    val richard = Monster(250, Handgun, "Richard")


И да, у `case class`ов есть замечательный метод `copy`. Многие из нас,
и я в том числе, городили огромное количество `update` методов по
незнанию. В `case class` есть метод `copy` и им надо пользоваться.

Литература
==========
Подробнее про `case class`ы вы можете прочитать [здесь][1] и [здесь][2]
(более подробно)

[1]: https://twitter.github.io/scala_school/basics2.html#caseclass
[2]: http://docs.scala-lang.org/tutorials/tour/case-classes.html