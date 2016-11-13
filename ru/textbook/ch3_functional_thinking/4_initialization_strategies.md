Стратегии инициализации
=======================
Существует два типа [инициализации][0]: жадная (eager), и
[ленивая][1] (lazy).
Как известно, во многих объектно-ориентированных языках существует
[паттерн][2], называемый "Отложенная инициализация". В случае `Scala`,
этот паттерн встроен в язык. Отложенная инициализация активируется
ключевым словом `lazy`. Жадная инициализация работает по умолчанию.


Литература
==========
Достаточно общая [статья][3] о ленивых вычислениях.
О том что под капотом, можете узнать [здесь][4].

[0]: https://en.wikipedia.org/wiki/Initialization_(programming)
[1]: https://en.wikipedia.org/wiki/Lazy_initialization
[2]: http://www.martinfowler.com/bliki/LazyInitialization.html

[3]: http://matt.might.net/articles/implementing-laziness/
[4]: https://blog.codecentric.de/en/2016/02/lazy-vals-scala-look-hood/

