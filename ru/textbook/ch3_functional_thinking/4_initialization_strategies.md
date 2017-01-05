Стратегии инициализации
=======================
Существует два типа [инициализации][init]: жадная (eager), и [ленивая][lazy]
(lazy). Как известно, многие объектно-ориентированные языки позволяют реализацию
[шаблона][delayed], называемого "Отложенная инициализация". В случае `Scala`,
этот шаблон уже встроен в язык. Отложенная инициализация активируется ключевым
словом `lazy`. Жадная инициализация работает по умолчанию. Есть также и ленивые
по-умолчанию языки, например `Haskell`.


Литература
==========
Достаточно общая [статья][impl-laziness] о ленивых вычислениях. Узнать о том что
под капотом, в скаловской реализации можете узнать [тут][lazy-vals-under-hood].

[init]: https://en.wikipedia.org/wiki/Initialization_(programming)
[lazy]: https://en.wikipedia.org/wiki/Lazy_initialization
[delayed]: http://www.martinfowler.com/bliki/LazyInitialization.html

[impl-laziness]: http://matt.might.net/articles/implementing-laziness/
[lazy-vals-under-hood]: https://blog.codecentric.de/en/2016/02/lazy-vals-scala-look-hood/

