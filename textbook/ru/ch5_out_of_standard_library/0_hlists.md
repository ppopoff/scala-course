Гетерогенные списки
===================

В данном разделе мы поговорим пожалуй о самой многообещающей структуре данных,
которая так же будет реализована в `Dotty`, и возможно последующих версиях
`Scala`. Гетерогенные листы были впервые реализованы для
[Haskell][hlists-haskell] в 2004 году. В Мире `Scala` они нашли свое место как
часть библиотеки `shapeless`, разработанной Miles Sabin для обобщенного
программирования на `Scala`. `Shapeless` используется внутри таких библиотек
как `Parboiled`, `Finch` и ряда [других][built-with-shapeless].

Вы можете думать об `HList` как о кортеже с функциями списка. Вот,
иллюстрирующий это пример:

    // обычный связанный список
    val list = "i" :: "love" :: "cookies" :: Nil

    // гетерогенный список
    import shapeless._

    val hlist = "i" :: 'ate :: 8 :: "cookies" :: HNil

[Здесь][hlist-tutorial] вы можете найти неплохой туториал про гетерогенные
списки.

Некоторые ошибки в `HList` способны проявлять себя уже на этапе компиляции:

    scala> ("head" :: HNil).head
    res0: String = head

    // ошибка компиляции
    scala> HNil.head
    error: could not find implicit value for parameter c:
    shapeless.ops.hlist.IsHCons[shapeless.HNil.type] HNil.head

Compared to List.head?

    // исключение времени выполнения
    scala> Nil.head
    java.util.NoSuchElementException: head of empty list
      at scala.collection.immutable.Nil$.head(List.scala:417)
      ... 29 elided

Что вам больше нравится??
Вы так же можете найти больше информации о гетерогенных списках
[здесь][hlist-tutorial-2].


Кортежи на стероидах
====================
`Shapeless` позволяет кортежам из стандартной библиотеки `Scala` вести себя
сродни гетерогенным спискам. Все что вам необходимо, это добавить следующий
имплисит в вашу область видимости:

    import syntax.std.tuple._

И кортежи превращаются в... списки:

    scala> ("life", 'begins, "at", 40).tail
    res1: (Symbol, String, Int) = ('begins, "at", 40)

Более подробно про листовое использование кортежей `Scala` вы можете прочесть
[здесь][tuples-as-hlists].


Дальнейшее чтение
=================
Вы также можете ознакомиться с официальной [документацией][old-doc]. Скорее
всего она немножечко устарела. Но для понятия сути явления ее будет достаточно.
Предлагаем вам ознакомиться с таблицей функций, которые поддерживают
гетерогенные списки: [таблица функций][hlist-fun-table].

[hlists-haskell]: http://hackage.haskell.org/package/HList
[hlist-builders]: http://ivanyu.me/blog/2016/01/11/type-safe-query-builders-in-scala-revisited-shapeless/
[built-with-shapeless]: https://github.com/milessabin/shapeless/wiki/Built-with-shapeless
[hlist-tutorial]: http://enear.github.io/2016/04/05/bits-shapeless-1-hlists/
[hlist-tutorial-2]: http://akmetiuk.com/blog/2016/09/30/dissecting-shapeless-hlists.html
[tuples-as-hlists]: https://github.com/milessabin/shapeless/wiki/Feature-overview:-shapeless-2.0.0#hlist-style-operations-on-standard-scala-tuples
[hlist-fun-table]: https://github.com/milessabin/shapeless/wiki/Feature-overview:-shapeless-2.1.0#operations-on-hlistsrecordscoproductsunionstuplesproducts
[old-doc]: https://github.com/milessabin/shapeless/wiki/Feature-overview:-shapeless-2.0.0#heterogenous-lists

