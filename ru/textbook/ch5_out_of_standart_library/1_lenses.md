Линзы
=====

Мы можете создавать структуры основанные на case-классах, обладающие
огромной вложенностью. Но рано или поздно вам придется менять данные.
Для простого случая, и пример будет простым:

    case class Dog (name: String, age: Int)
    
    val fido = Dog("Fido", 6)
    val olderFido = fido.copy(age = 7)

А что делать в таком случае?

    case class Address(street : String,
                       city : String,
                       postcode : String)
    
    case class Person(name : String, age : Int, address : Address)
                      
Каждый раз разбирать и собирать все объекты вручную для того чтобы
изменить одно единственное поле? Не находите, что это не самый лучший
способ это сделать? Именно здесь, вам на помощь придут линзы.

Почему линзы? Потому что они способны сфокусироваться на главном. Вы
фокусируете линзу на определенную часть структуры, и получаете ее,
вместе с возможностью ее (структуру) обновить.
                      
Предположим, что у нас есть  персонаж состарился на год. Как мы
отреагируем на это изменнеие?

    val person = Person("Joe Grey", 37,
                        Address("Southover Street",
                                "Brighton", "BN2 9UA"))
    
    // Read a field
    val age1 = ageLens.get(person) // Type inferred is Int
    // age1 == 37

    // Update a field
    val person2 = ageLens.set(person)(38)
    // person2.age == 38
   
Аналогичную операцию вы можете совершить и над адресом. Как видите,
достаточно просто. К сожалению, а может быть и к счастью, `Scala` не
имеет встроенных линз. Поэтому, вам придется использовать стороннюю
библиотеку. Мы предлагаем вам использовать `shapeless`. Собственно,
приведенный выше пример, был написан с использованием этой замечательной
и понятной библиотеки.

Существует множество других реализаций для линз, если хотите, вы можете
использовать [scalaz][scalazl], [monocle][monocle].

Библиотека `shapeless` уже включена в `CLASSPATH`, поэтому рекомендуем
вам использовать именно ее.

Литература
==========
Более наглядно, использование линз в `shapeless` продемонстрированно
[здесь][1].


[1]: https://github.com/milessabin/shapeless/blob/master/examples/src/main/scala/shapeless/examples/lenses.scala
[scalazl]:  http://eed3si9n.com/learning-scalaz/Lens.html
[monocle]: https://github.com/julien-truffaut/Monocle