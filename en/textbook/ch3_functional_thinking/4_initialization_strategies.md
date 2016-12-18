Стратегии инициализации
=======================
Существует два типа [инициализации][init]: жадная (eager), и
[ленивая][lazy] (lazy).
Как известно, во многих объектно-ориентированных языках существует
[паттерн][delayed], называемый "Отложенная инициализация". В случае `Scala`,
этот паттерн встроен в язык. Отложенная инициализация активируется
ключевым словом `lazy`. Жадная инициализация работает по умолчанию.


Литература
==========
Достаточно общая [статья][impl-laziness] о ленивых вычислениях.
О том что под капотом, можете узнать [здесь][lazy-vals-under-hood].

[init]: https://en.wikipedia.org/wiki/Initialization_(programming)
[lazy]: https://en.wikipedia.org/wiki/Lazy_initialization
[delayed]: http://www.martinfowler.com/bliki/LazyInitialization.html

[impl-laziness]: http://matt.might.net/articles/implementing-laziness/
[lazy-vals-under-hood]: https://blog.codecentric.de/en/2016/02/lazy-vals-scala-look-hood/

