Ленивые коллекции [факультативно]
=================================

Этот раздел посвящен ленивым коллекциям `Scala`, именуемым
[`Streams`][scaladoc], большая просьба не путать из с *Java 8 Streams*, это
совершенно разные вещи. К вам будет еще одна просьба: не путать
`scala.collection.immutable.Stream` с `Akka streams` или `Reactive Streams`.
К большому сожалению слово `Stream` обильно переиспользовано не только рамках
платформы `JVM`, но и в рамках экосистемы `Scala`.

Характерной чертой ленивых коллекций в `Scala`, является то что они мемоизируют
(memoize) результат (удерживают его в памяти), поэтому они совершенно не
подходят для создания бесконечных структур данных, популярных
во многих функциональных языках.

Неплохим введением в `Streams` послужит [раздел][streams-intro] книги
`Scala Cookbook`. Наглядный пример описан [здесь][streams-intro-2]. Более
подробно про сложности работы с данным типом коллекций, написано в
[первой][streams-1] и [второй][streams-2] части статьи.

Про данный тип коллекций знать надо, но на практике, вам скорее всего не
придется их использовать.

Практических заданий для данного раздела не предусмотрено.

[scaladoc]: http://www.scala-lang.org/api/current/scala/collection/immutable/Stream.html
[streams-intro]: http://alvinalexander.com/scala/how-to-use-stream-class-lazy-list-scala-cookbook
[streams-intro-2]: http://derekwyatt.org/2011/07/29/understanding-scala-streams-through-fibonacci/
[streams-1]: http://blog.dmitryleskov.com/programming/scala/stream-hygiene-i-avoiding-memory-leaks/
[streams-2]: http://blog.dmitryleskov.com/programming/scala/stream-hygiene-ii-hotspot-kicks-in/

