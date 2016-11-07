Case classes & Case objects
===========================
Из предыдущей главы вы узнали что собой представляют `object` и `class`.
В `Scala` существуют особые формы классов и объектов -- те, которые
поддерживают операцию сопоставления с образцом ([pattern matching][0]).
Более подробно об операции сопоставления с образцом вы узнаете далее
в этой главе.

На `case classes` можно смотреть как за записи в функциональных языках,
или как неизменяемые (immutable) java beans, выглядят они следующим
образом:

    case class Monster(health: Int = 100,
                       wearpon: Wearpon = Claws,
                       name: String)
                       
    val richard = Monster(250, Handgun, "Richard")


Экземпляр данного класса может быть использован для сопоставления с
образцом, для него определены `equals` и `hashcode`, сериализация и
`toString`. Также он является наследнком трейта `Product`. Аналогичным
образом себя ведут и `case objects`

Для каждого `case class` существует объект-компаньен (companion object),
который содержит метод `apply`. Поэтому для создания `case class` не
требуется ключевое слово `new`.

И да, у `case class`ов есть замечательный метод `copy`. Многие из нас,
и я в том числе, городили огромное количество `update` методов по
незнанию. В `case class` есть метод `copy` и им надо пользоваться.

Литература
==========
Подробнее про `case class` вы можете прочитать [здесь][1] и [здесь][2]
(более подробно)

[0]: https://en.wikipedia.org/wiki/Pattern_matching
[1]: https://twitter.github.io/scala_school/basics2.html#caseclass
[2]: http://docs.scala-lang.org/tutorials/tour/case-classes.html