Классы типов
============

Классы типов представляют собой design-pattern, позволяющий реализовать Ad-hoc полиморфизм.
В некоторых языках (например, `Haskell`) классы типов встроены в язык. Здесь мы покажем, как их 
можно реализовать в языке `Scala`.

В двух словах, классы типов дают возможность описать поведение объекта
(по его типу), не изменяя код объекта и не наследуясь от
него. Проиллюстрируем это следующим примером.

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

    // используем simulacrum для генерации кода, обеспечивающего наглядный синтаксис вызова метода bark.
    @typeclass trait Barks[D] {
      def bark: String
    }
    // реализуем метод для нашего типа Dog
    implicit object DogBarking extends Barks[Dog] {
        def bark = "Wow, ladies"
    }
    
    val james = new Dog("James")
    println(james.bark) // Вот здесь код, сгенерированный simulacrum, позволяет использовать метод bark как будто он имеется у объекта

Таким образом, в зависимости от типа объекта будет выбран соответствующий экземпляр `Barks` с реализацией метода.

Классы типов следуют принципу "[Open-closed principle][open-closed]" - "Открыто для расширения, закрыто
для модификации".

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

[tc-0]: https://engineering.sharethrough.com/blog/2015/05/18/type-classes-for-the-java-engineer/
[open-closed]: https://en.wikipedia.org/wiki/Open/closed_principle
[simulacrum]: https://github.com/mpilquist/simulacrum

