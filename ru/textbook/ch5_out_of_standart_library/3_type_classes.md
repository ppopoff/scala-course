Классы типов
============
Их так же называют Ad-hoc полиморфизмом. Собственно это design-pattern. В
некоторых языках (например `Haskell`) классы типов встроены в язык. Концепция
достаточно простая и понятная.

В двух словах, это возможность описать поведение для некоего объекта (по типу
интерфейса), не залезая в сам объект.

Полиморфизм по наследованию (inheritance polymorphism))):

    trait Barks {
      def bark = "Wow!"
    }

    // Barks следует добавить в class
    class Dog(tag: String) extends Animal with Barks { ... }

    // где-то в глубине кода
    val jason = new Dog("Jason")
    println(jason.bark)


Классы типов (ad-hoc polymorphism):

    // Собаку мы не трогаем, и код внутри класса не меняем
    class Dog(tag: String) extends Animal

    // Это псевдокод. В Scala, к сожалению, такой
    // конструкции нет
    typeclass Barks [Dog] {
      def bark = "Wow, ladies"
    }

    val james = new Dog("James")
    println(james.bark)

Теперь вам более или менее понятно отличие классов типов от
интерфейсов в традиционном ООП. Классы типов следуют
[Open-closed principle][open-closed] Открыто для расширения, закрыто
для модификации.

Теперь, когда вам более менее понятно, что представляют собой
классы типов, рекомендую вам ознакомиться с материалами, где
подробно рассказывается о том как классы типов реализуются в `Scala`.

Ознакомиться можно [здесь][tc-0].



Литература
==========
https://www.youtube.com/watch?v=CCsGHPxA9E0
https://www.youtube.com/watch?v=sVMES4RZF-8
https://youtu.be/yYo0gANYViE


[tc-0]: https://engineering.sharethrough.com/blog/2015/05/18/type-classes-for-the-java-engineer/
[tc-1]: http://danielwestheide.com/blog/2013/02/06/the-neophytes-guide-to-scala-part-12-type-classes.html

[open-closed]: https://en.wikipedia.org/wiki/Open/closed_principle

