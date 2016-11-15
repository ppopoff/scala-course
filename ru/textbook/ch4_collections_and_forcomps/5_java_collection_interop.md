Взаимодействие с коллекциями Java
=================================

Иногда возникает необходимость работать с коллекциями реализованными
для `Java`, например, зачастую бывает необходимо использовать коллекции
из пакета `java.util.concurrent` вроде `ConcurrentHashMap`, или
`BlockingQueue`.

`Scala` позволяет вам использовать стандартные методы `Collections API`
для коллекций `Java`.

В стандартной библиотеке `Scala` существует два объекта (на момент
написания данного раздела):

 - ~~[scala.collection.JavaConversions][conversions]~~
 - [scala.collection.JavaConverters][converters]

Первый объект в версии `2.12` помечен как устаревший. Вам не нужно его
использовать.

В [документации][converters] к `JavaConverters`, подробно и достаточно
доходчиво написано, как пользоваться конвертерами.

[conversions]: http://www.scala-lang.org/api/current/scala/collection/JavaConversions$.html
[converters]: http://www.scala-lang.org/api/current/scala/collection/JavaConverters$.html

