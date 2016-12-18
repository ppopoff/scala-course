Стратегии вычисления (Evaluation strategies)
============================================
Статья на [wikipedia][eval-strategy]


Вызов по ссылке/значению
========================
В англоязычной литературе называется как Call by reference и Call by
value. Работает аналогично `Java` или `C#`. По ссылке передаются
наследники [`AnyRef`][anyref], по значению передаются наследники
[`AnyVal`][anyval]. Аргументы переданные функции одним из этих двух способов
будут вычислены в момент вызова данной функции. В отличии от Call by
name...


Call by name
============
Стратегия вычислений, при которой аргумент функции вычисляется каждый
раз когда его используют внутри тела функции. На данный момент лучшая
[статья][call-by-name], по субъективному мнению одного из авторов.
Так же, достаточно простое и понятное [объяснение][scala-by-name-par].


Call by need
============
Стратегия вычислений, при которой аргументы вычисляются только тогда
когда впервые используются внутри тела функции. Представляет собой
[мемоизированный][memoization] вариант для Call by name. В явном виде в
`Scala` не используется, только как часть Call by name.


Call by future
==============
Стратегия вычислений, при которой аргументы функции выполняются
конкурентно внутри тела функции. В `Scala` присутствуют `Futures`,
поэтому подобная стратегия тоже имеет место быть.

[eval-strategy]: https://en.wikipedia.org/wiki/Evaluation_strategy
[anyref]: http://www.scala-lang.org/api/current/scala/AnyRef.html
[anyval]: http://www.scala-lang.org/api/current/scala/AnyVal.html
[call-by-name]: https://tpolecat.github.io/2014/06/26/call-by-name.html
[scala-by-name-par]: http://locrianmode.blogspot.ru/2011/07/scala-by-name-parameter.html
[memoization]: https://en.wikipedia.org/wiki/Memoization

