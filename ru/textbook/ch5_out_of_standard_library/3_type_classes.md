Классы типов
============

Классы типов представляют собой design-pattern, позволяющий реализовать Ad-hoc
полиморфизм. В некоторых языках (например, `Haskell`) классы типов встроены в
язык. Здесь мы покажем, как их можно реализовать в языке `Scala`.

В двух словах, классы типов дают возможность описать поведение объекта
(по его типу), не изменяя код объекта и не наследуясь от него.
Проиллюстрируем это следующим примером.

**Полиморфизм через наследование (inheritance polymorphism)**

    trait Barks {
      def bark = "Wow!"
    }

    // Barks следует добавить в class
    class Dog(tag: String) extends Animal with Barks { ... }

    // где-то в глубине кода
    val jason = new Dog("Jason")
    println(jason.bark)

**Полиморфизм с использованием классов типов (ad-hoc polymorphism)**

    // Собаку мы не трогаем, и код внутри класса не меняем
    class Dog(tag: String) extends Animal

    // используем simulacrum для генерации кода,
    // обеспечивающего наглядный синтаксис вызова метода bark.
    @typeclass trait Barks[D] {
      def bark: String
    }

    // реализуем метод для нашего типа Dog
    implicit object DogBarking extends Barks[Dog] {
        def bark = "Wow, ladies"
    }

    val james = new Dog("James")
    // Вот здесь код, сгенерированный simulacrum, позволяет
    // использовать метод bark как будто он имеется у объекта
    println(james.bark)

Таким образом, в зависимости от типа объекта будет выбран соответствующий
экземпляр `Barks` с реализацией метода.

Классы типов следуют принципу "[Open-closed principle][open-closed]" -
"Открыто для расширения, закрыто для модификации".


Классы типов в стандартной библиотеке
=====================================
Не смотря на то, что классы типов в `Scala` не являются синтаксической
конструкцией они широко используются в качестве паттерна. Примером может
служить [Ordering][ordering]. Следует отметить, что использование данного
класса типов является более идиоматичным, нежели использование
[Ordered][ordered]. Использование `Ordering` дает вам большую гибкость:
для сложных структур вы можете задать тот порядок, который необходим
в конкретной ситуации. Экземпляр Ordering обычно передается следующим
образом:

    def sort [T] (list: List[T]) (implicit ord: Ordering[T]): List[T] = {
      ...
      // где-то внутри кода вызываем один из методов ordering
      ord.gt(x,y)
      ...
    }

Объявляем `Ordering` для произвольного типа данных:

    case class Item (id: Long, name: String, size: Dimension)

    // порядок по умолчанию (поэтому задаем делаем его implicit)
    implicit val byId: Ordering[Item] = Ordering.by(_.id)

    // альтернативный вариант
    val byName: Ordering[Item] = Ordering.by(_.name)

И теперь мы можем сделать так:

    sort(items) // будут отсортированы по id
    sort(items)(byName) // явно заданный порядок

Более подробно про `Ordered` и `Ordering` вы можете прочесть [здесь][both-ords].


Дополнительная литература
=========================
Теперь, когда мы немного познакомились с классами типов,
рекомендуем вам изучить видеоматериалы, в которых
подробно рассказывается о том, как классы типов реализуются в `Scala`.

С теоретической частью можно ознакомиться [здесь][tc-0].

Для выполнения тестовых заданий, вам пригодится библиотека [Simulacrum][simulacrum].
Вы также можете воспользоваться стандартными классами типов из библиотеки `scalaz` или `cats`.

Видеоматериалы
==============

1. [Tutorial: Typeclasses in Scala](https://www.youtube.com/watch?v=sVMES4RZF-8)
2. [The Typeclass Pattern - An Alternative to Inheritance](https://www.youtube.com/watch?v=CCsGHPxA9E0)

[ordering]: http://www.scala-lang.org/api/2.12.0/scala/math/Ordering.html
[ordered]: http://www.scala-lang.org/api/2.12.0/scala/math/Ordered.html
[both-ords]: http://like-a-boss.net/2012/07/30/ordering-and-ordered-in-scala.html
[tc-0]: https://engineering.sharethrough.com/blog/2015/05/18/type-classes-for-the-java-engineer/
[open-closed]: https://en.wikipedia.org/wiki/Open/closed_principle
[simulacrum]: https://github.com/mpilquist/simulacrum

