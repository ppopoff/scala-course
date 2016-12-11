Классы типов
============
Их так же называют Ad-hoc полиморфизмом. Собственно это design-pattern.
В некоторых языках (например `Haskell`) классы типов встроены в язык.
Концепция достаточно простая и понятная.

В двух словах, это возможность описать поведение для некоего объекта
(по типу интерфейса), не изменяя код самого объекта, и не наследуясь от
него, проиллюстрируем это следующим примером.

**Полиморфизм по наследованию (inheritance polymorphism)**

    trait Barks {
      def bark = "Wow!"
    }

    // Barks следует добавить в class
    class Dog(tag: String) extends Animal with Barks { ... }

    // где-то в глубине кода
    val jason = new Dog("Jason")
    println(jason.bark)

**Классы типов (ad-hoc polymorphism)**

    // Собаку мы не трогаем, и код внутри класса не меняем
    class Dog(tag: String) extends Animal

    // используем simulacrum для более наглядного синтаксиса
    @typeclass trait Dog [D] {
      def bark = "Wow, ladies"
    }

    import package.where.barks.is.Barks

    val james = new Dog("James")
    println(james.bark)

Теперь вам более или менее понятно отличие классов типов от
интерфейсов в традиционном ООП. Классы типов следуют
[Open-closed principle][open-closed] Открыто для расширения, закрыто
для модификации. Как вы наверное догадались, данный паттерн реализуется
в `Scala` при помощи `implicit`.

Теперь, когда вам более менее понятно, что представляют собой
классы типов, рекомендуем вам ознакомиться с материалами, где
подробно рассказывается о том как классы типов реализуются в `Scala`.

Ознакомиться с теоретической частью можно [здесь][tc-0]. Также вашему
вниманию предлагается ряд видеоматериалов, представленных ниже.

Для выполнения тестовых заданий, предлагаем вам ознакомиться с
библиотекой [Simulacrum][simulacrum]. На данный момент в ней нет полной
поддержки `2.12`. Вы также можете воспользоваться классами типов из
библиотеки `scalaz`.

Видеоматериалы
==============
[Tutorial: Typeclasses in Scala](https://www.youtube.com/watch?v=sVMES4RZF-8)
[The Typeclass Pattern - An Alternative to Inheritance](https://www.youtube.com/watch?v=CCsGHPxA9E0)

[tc-0]: https://engineering.sharethrough.com/blog/2015/05/18/type-classes-for-the-java-engineer/
[open-closed]: https://en.wikipedia.org/wiki/Open/closed_principle
[simulacrum]: https://github.com/mpilquist/simulacrum

