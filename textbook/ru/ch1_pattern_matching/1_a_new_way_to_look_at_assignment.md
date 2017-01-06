Еще раз о присваивании
======================
Давайте вернемся к операции присваивания, и увидим что она не так проста
как вам может показаться на первый взгляд:

    // это было простым связыванием, ничто не предвещало беды
    scala> val address = ("localhost", 80)
    address: (String, Int) = (localhost,80)

    scala> val (host, port) = address
    host: String = localhost
    port: Int = 80

Мы только что разобрали кортеж на две переменные, однако кортежами дело
не ограничивается:

    scala> val first::rest = List(1,2,3,4,5)
    first: Int = 1
    rest: List[Int] = List(2, 3, 4, 5)

Аналогичные операции мы можем провести и с `case class`ами :

    case class Person(name: String, age: Int)

    val max = Person("Max", 36)
    // max: Person = Person(Max,36)

    val Person(n, a) = max
    // n: String = Max
    // a: Int = 36

Более того:

    scala> val p @ Person(n, a) = max
    // p: Person = Person(Max,36)
    // n: String = Max
    // a: Int = 36

В последнем случае, по имени `p` мы получим саму запись `case class`,
по имени `n` мы получим имя, и по `a` мы получим возраст.

Как видите операция присваивания не так проста как кажется. Подобное
реализовано и в других языках, например `Python` и `Erlang`.

