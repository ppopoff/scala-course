Имплиситы
=========
Ключевым словом `implicit` в `Scala` помечается множество различных
сущностей, которые неявным образом передаются, конвертируются, или
добавляют новое поведение (ведут себя как `extension methods`).


## Типы имплиситов

 - Неявные параметры. Самый простой и доступный случай, это неявные
   параметры. Про них можно прочесть [здесь][impl-parameters]
 - Неявные преобразования (implicit conversions). О них вы можете
   прочесть [здесь][impl-conversions] и [здесь][impl-conversions-2].
 - Методы-расширения ([материалы][impl-classes]). Представлены как `implicit`
   классами и объектами

### Поиск имплиситов
О том где и `Scala` ищет имплиситы, вы можете прочесть [здесь][impl-lookup].


## Имплиситы, каррирование и лямбды
В Play Framework, очень популярна следующая конструкция:

    Action { implicit request =>
      Ok("ok: [" + request + "]")
    }

Итак, давайте разберемся с тем, что здесь происходит. Код, записанный
выше, можно переписать так:

    Action { request =>
      implicit val r = request
      Ok("ok: [" + request + "]")
    }

Сигнатура класса `Ok`, приблизительно, выглядит следующим образом:

    class Ok(message: String)(implicit r: Request).

Ключевое слово `implicit`, может использоваться только для *последнего*
каррированного аргумента функции. Оно указывает место, в которое возможно
подставить неявный параметр. Без имплиситов код будет выглядеть следующим образом:

    Action { request =>
      Ok("ok: [" + request + "]")(request)
    }


## В заключение
Использование имплиситов в вашем коде является крайне нежелательным.
Данный инструмент, в первую очередь, предназначается для дизайнеров
библиотек, а так же для разработчиков предметно-ориентированных языков
(Domain Specific Languages). Достаточно старая [статья][pimp-my-lib],
поясняющая сущность данного подхода.

[pimp-my-lib]: http://www.artima.com/weblogs/viewpost.jsp?thread=179766
[impl-conversions]: http://docs.scala-lang.org/tutorials/tour/implicit-conversions
[impl-conversions-2]: http://baddotrobot.com/blog/2015/07/14/scala-implicit-functions/
[impl-parameters]: http://baddotrobot.com/blog/2015/07/03/scala-implicit-parameters/
[impl-classes]: http://docs.scala-lang.org/overviews/core/implicit-classes.html
[impl-lookup]: http://docs.scala-lang.org/tutorials/FAQ/finding-implicits.html

