Типы и перечисления
===================

Для многих из нам перечисления вещь незаменимая. Даже если язык не обладает
поддержкой перечисления (enumerations), кто-то обязательно ее переизобретает.
В `Scala` нет ключевого слова `enum` или даже `enumeration`. И многие, пришедшие
из `Java` и `C#` пытаются придумать что-то свое, например:

    // Весьма жизненный пример :)
    object Weekday {
      val Monday = 0
      ...
      val Sunday = 6
    }

А потом пытаются использовать это так как используют перечисление из мира `Java`

    if (weekday == Weekday.Friday) {
       stop(wearing, Tie)
    }

А что если где-то глубоко случится "непоправимое"? И кто-то забудет о
том, что наши дни недели начинаются с 0?

    val sunday = 7

Данное решение вопроса, возможно имеет право на жизнь, если только недолгую и
несчастную. В `Scala` есть лучший способ создания перечислимых типов. И сделано
это более продвинуто нежели в `Java` или `C#`


## Наше первое перечисление

    sealed trait TrafficLight
    case object Green extends TrafficLight
    case object Yellow extends TrafficLight
    case object Red extends TrafficLight
    case object Broken extends TrafficLight

Теперь давайте разберемся с деталями.

## Ключевое слово `case`
перед `object` говорит о том, что данный объект может быть использован
для сопоставления с образцом (pattern matching). Так же для этого
объекта существует поддержка `equals` и `hashcode`, сериализация
по-умолчанию и предопределенная реализация `toString`.

## О слове Sealed
Существует в `Scala` такое ключевое слово, как `sealed` и делает оно
следующее: запирает структуру данных от наследования вне модуля
компиляции (compilation unit). В нашем случае это файл. Зачем это нужно?
Чтобы мы заранее (на этапе компиляции) знали о всех возможных
наследниках данного типа, и могли использовать это при операции
сопоставления с образцом. Вместо `trait` в данном случае можно
использовать и `sealed abstract class`. Это полезно, если ваш код будет
тесно проинтегрирован с кодом на `Java`. Использование `trait` более
идиоматично.

Объявим следующую функцию:

    def tellWhatTheLightIs(tl: TrafficLight): Unit = tl match {
      case Red => println("No cars go!")
      case Green => println("Don't stop me now!")
      case Yellow => println("Ooohhh you better stop!")
    }

И получим:

    warning: match may not be exhaustive.
    It would fail on the following input: Broken
           def tellWhatTheLightIs(tl: TrafficLight): Unit = tl match {
                                                            ^
    tellWhatTheLightIs: (tl: TrafficLight)Unit

Так же можно объявлять рекурсивные структуры, для этой цели следует
использовать `case class`:

    sealed trait Tree
    case class Leaf(value: Int) extends Tree
    case class Node(l: Tree, r: Tree) extends Tree

Конечно, мы можем предположить что наш светофор никогда не сломается, и
отмахнуться от ошибки:

    def tellWhatTheLightIs(tl: TrafficLight): Unit = tl match {
      case Red => println("No cars go!")
      case Green => println("Don't stop me now!")
      case Yellow => println("Ooohhh you better stop!")
      case _ => println("Baby I Don't Care")
    }

Но так делать *не следует*. Если вы готовы отмахнуться от результатов
при сопоставлении с образцом, задайте себе несколько раз вопрос:
"А вы уверены зачем вы это делаете?"

Собственно для этого там и нужно использовать ключевое слово `sealed`.

Вот и все, мы создали идиоматическое перечисление
идиоматичное для языка `Scala`. Есть только одно но... Мы описали не
перечисление, мы описали Алгебраический тип данных, или [ADT][adt-wiki].

Многие типы данных в Scala реализованы как ADT: Списки, Option, Try, и
многие другие. Если вы хотите узнать больше о том что такое ADT,
обратитесь к ссылкам в данном разделе.

Литература
==========
Неплохо про алгебраические типы данных рассказано, как ни странно в
[Википедии][adt-wiki]. Касательно `Scala` есть достаточно доступный
[пост][scala-adt] и [презентация][scala-adt-2], которая, возможно,
покажется вам интересной.

[adt-wiki]: https://en.wikipedia.org/wiki/Algebraic_data_type
[scala-adt]: https://gleichmann.wordpress.com/2011/01/30/functional-scala-algebraic-datatypes-enumerated-types/
[scala-adt-2]: http://tpolecat.github.io/presentations/algebraic_types.html#18

