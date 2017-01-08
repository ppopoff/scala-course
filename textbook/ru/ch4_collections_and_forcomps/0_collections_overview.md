Scala Collections library
=========================
У `Scala` достаточно сложная библиотека коллекций. И сложна она в первую очередь
в виду своей структуры и архитектуры. В Последующих версиях коллекции могут
претерпеть изменения, как они, например изменились начиная с версии `2.8`.
Сейчас, `Scala` находится на пути упрощению, не исключено что библиотека
коллекций также заметно упростится. В данный момент мы рассматриваем актуальную
версию коллекций `2.12`, которая не претерпела значительных изменений после
версии `2.8`. Кто знает, изменится ли библиотека коллекций снова? :)


## Обзор
В начале мы рекомендуем вам ознакомиться с кратким [обзором][overview_1_aa]
архитектуры библиотеки коллекций. Там содержится достаточно простое и общее
описание чтобы получить общую картину. После этого рекомендуем вам ознакомиться
со [статьей][overview_2] которая даст вам больше деталей. Теперь, когда вы
о коллекциях достаточно, мы можем поделить библиотеку коллекций на три части:

  - `scala.collection`
  - `scala.collection.mutable`
  - `scala.collection.immutable`

На вершине иерархии находится `Traversable`. Внутри него объявлены наиболее
общие операции над коллекциями. Некоторые источники говорят что этот trait
содержит только определение метода `foreach`. [Это не так][methods_from_traversable_like].

Библиотека коллекций использует так называемый *Cake pattern*, более подробно
о котором вы можете прочесть [здесь][cake_pattern]. Суть использования данного
подхода заключается в том, чтобы за счет увеличения количества атомарных traitов
повысить модульность вашего кода.

Всегда предпочитайте неизменяемые (immutable) коллекции. Они ковариантны и
потокобезопасны. Если вы используйте изменяемые (mutable) коллекции используйте
префикс `mutable` явно. Узнать больше о "Best practices" вы можете
[здесь][collections_best_practices].

Наиболее важные и заметные типы коллекций рассмотрены [здесь][collections]. Вы
также можете найти там описания основных методов объявленных внутри каждого
трейта. Для того чтобы узнать больше о каждом из типов коллекции вы можете
воспользоваться [документацией][scaladoc]. Подробное изложение архитектуры
коллекций `Scala` вы можете найти [здесь][arch].


## Массивы и строки
В `Scala` массивы являют собой *инвариантные* [коллекции][collections_arrays].
Строки [также][collections_strings] являются коллекциями.


## Параллельные коллекции
Начиная с версии `2.9` `Scala` поддерживает параллельные коллекции. Почему так
важна информация о версии? Я не исключаю того что вы можете читать книгу
посвященную `Scala 2.8`, в которой параллельные коллекции не описаны. Пожалуйста
имейте это в виду. Краткий обзор параллельных коллекций вы можете найти
[здесь][parallel_brief].Более детальную информацию о параллельных коллекциях
можно найти в официальной [документации][parallel_doc].

Существует два типа параллельных коллекций:

  - [mutable][parallel_mutable]
  - [immutable][parallel_immutable]

Простой совет -- не используйте параллельные коллекции совсем. В большинстве
случаев они не дадут вам лучшую производительность. А в тех случаях когда они
могут оказаться вам полезны, скорее всего `Spark` будет лучшим выбором.

Если вы все же решились использовать параллельные коллекции, не совершайте
побочных эффектов во время операций. Это приведет к "состоянию гонки".

[overview_1_aa]: http://alvinalexander.com/scala/understanding-scala-collections-hierarchy-cookbook
[overview_2]: http://www.47deg.com/blog/adventures-with-scala-collections
[methods_from_traversable_like]: http://bit.ly/2hX38tv
[cake_pattern]: http://www.cakesolutions.net/teamblogs/2011/12/19/cake-pattern-in-depth
[collections_best_practices]: https://twitter.github.io/effectivescala/#Collections-Use

[arch]: http://docs.scala-lang.org/overviews/core/architecture-of-scala-collections.html
[scaladoc]: https://www.scala-lang.org/api/current/index.html

[collections]: http://docs.scala-lang.org/overviews/collections/introduction
[collections_arrays]: http://docs.scala-lang.org/overviews/collections/arrays.html
[collections_strings]: http://docs.scala-lang.org/overviews/collections/strings

[parallel_brief]: http://alvinalexander.com/scala/how-to-use-parallel-collections-in-scala-performance
[parallel_doc]: http://docs.scala-lang.org/overviews/parallel-collections/overview.html
[parallel_immutable]: https://www.scala-lang.org/api/current/index.html#scala.collection.parallel.immutable.package
[parallel_mutable]: http://www.scala-lang.org/api/current/index.html#scala.collection.parallel.mutable.package

