Scala type system
=================
This topic is about `Scala` type system. As the main source of inspiration, we
recommend you to read the corresponding section of
[Twitter Scala School][type-basics], and
[Scala's Types of types][types-of-types] which I guess is the most powerful
description of `Scala` types for newcomers.

## Bounds
If you're reading about Bounds, stop doing this. Since `2.11` those beasts are
considered deprecated. `Dotty` doesn't have them, so it means that future
versions of `Scala`, won't have them too. Save your time for something bigger.

## Variance
An [article][variance], that will give you a good explanation of variance in
`Scala`.

## Value types
also exists in `Scala` you can find more information [here][value-types].

## Type aliases
Use them when possible. They will make your code more readable. Let's be honest
that `Map[Username, Key]` looks a way better than `Map[String, String]`. You
may find a number of examples [here][type-aliases], just skip to `Example`
section.

[variance]: https://blog.codecentric.de/en/2015/03/scala-type-system-parameterized-types-variances-part-1/
[type-basics]: https://twitter.github.io/scala_school/type-basics.html
[types-of-types]: http://ktoso.github.io/scala-types-of-types/
[value-types]: http://docs.scala-lang.org/overviews/core/value-classes.html
[type-aliases]: http://www.scala-lang.org/files/archive/spec/2.12/04-basic-declarations-and-definitions.html#type-declarations-and-type-aliases

