О списках
=========

## Headshot
У `Option` есть `get`, у списка есть `head` а еще у него есть `init` и
`tail`. Вот что мы можете получить, вызывая вышеописанные методы:

    // Для пустого списка:
    init: java.lang.UnsupportedOperationException
    head: java.lang.NoSuchElementException
    last: java.lang.NoSuchElementException
    tail: java.lang.UnsupportedOperationException

конечно, с вами этого никогда не случится, если вы проверяете лист
на пустоту. Каждый раз? Да ладно, с этим списком никогда ничего не может
случиться. Он никогда не будет пустым? Правда?

Вызов `list.head` и сотоварищей -- один из самых лучших способов
выстрелить себе "в голову" при работе со списками.

> Извивайтесь гремучей змеей, делайте все возможное чтобы не 
> использовать list.head и его друзей.

Вместо `head` неплохим вариантом будет использование метода
`headOption`, если для вас наличие дополнительного контейнера проблемой
не является. Метод `lastOption` ведет себя аналогично. Если вы
каким-либо образом привязаны к индексам, можете воспользоваться методом
`isDefinedAt`, который принимает целочисленный аргумент (индекс)
в качестве параметра.
Все описанное выше по-прежнему подразумевает проверки, которые можно
забыть. Найдется еще 1001 одна причина чтобы вы их опустили сознательно.
Правильной и идиоматичной альтернативой будет использование
сопоставления с образцом. Тот факт, что лист является алгебраическим
типом, не даст вам забыть о `Nil`, вы сможете спокойно избежать вызовов
`head` и `tail`, а также сэкономить несколько строчек кода:

    def printRec(list: List[String]): Unit = list match {
      case Nil  => () 
      case x:xs => println(x)
                   printRec(xs)
    }

*Немного о производительности*
> С точки зрения производительности, для односвязанного списка, коим
> является скаловский List (он же `scala.collection.immutable.List`)
> Наиболее дешевой операцией, будет запись в начало списка, нежели
> в конец. Для записи в конец списка требуется пройти весь список до
> конца. Сложность записи в начало списка O(1), в конец O(n).
> не забывайте об этом.

## Возможно список
В коде только что познакомившихся со `Scala`, с завидной периодичностью
вчтречаю в аргументах функции, или в качестве возвращаемого типа 
`Option[List[A]]`. Как встречаю, спрашиваю написавшего зачем он нужен.
А мне отвечают: "Так у нас список может быть, а может и не быть, что
же я буду вместо него `null` использовать?". И слышу это от достаточно
взрослых инженеров. Список может быть пустым так же, как и `Option`, 
поэтому можно спокойно передавать пустой список, если что-то пойдет не
так. Дополнительный контейнер не нужен.

## ::Nil
Ранее мы рассматривали следующий способ конструирования списков:

    val mylist = 1 :: 2 :: 3 :: 4 :: 5 :: Nil

`::` не является оператором, встроенным в язык. Это имя класса/метода,
который обычно называется `Cons`. Более того, `::` это один из редких
операторов Scala, который обладает правой ассоциативностью, поэтому,
увидев `Nil` справа, компилятор догадывается что мы конструируем список
и вызывает меетод `::` получив аргумент в который, компилятор в
состоянии определить тип списка. Более подробно об этом написано в книге
Одерски `Programming in scala`. К тому же использование `Nil` более
[идиоматично][5], чем использование `List.empty` или `List()`

    scala> println (Nil == List())
    true

    scala> println (Nil eq List())
    true

    scala> println (Nil equals List())
    true

    scala> System.identityHashCode(Nil)
    374527572

    scala> System.identityHashCode(List())
    374527572
 
 
Литература
==========
Более подробно о списках и других типах коллекций, вы можете прочитать
на сайте [Twitter Scala School][0]. У Alvin Alexander существует ряд
неплохих туториалов про списки, [здесь][1] [здесь][2] и [здесь][3].
Официальная [документация][4] всегда будет кстати.

[0]: https://twitter.github.io/scala_school/collections.html
[1]: http://alvinalexander.com/scala/scala-list-class-examples
[2]: http://alvinalexander.com/scala/how-create-scala-list-range-fill-tabulate-constructors
[3]: http://alvinalexander.com/scala/how-add-elements-to-a-list-in-scala-listbuffer-immutable
[4]: http://www.scala-lang.org/api/current/scala/collection/immutable/List.html
[5]: http://stackoverflow.com/questions/5981850/scala-nil-vs-list