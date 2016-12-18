Functional programming principles in Scala
==========================================

The course is available in both languages.

  - Русский (пролистайте пониже)
  - English


## What this course is all about?
This course is not only about Scala. Scala is complicated language, and
it will be impossible to cover all syntactic features in the scope of this
course. And we're not even trying. If you want to learn all syntactic elements
of the language, I would propose you to study them by yourself.

The target of this course is to teach you functional thinking. Because it is
the most sophisticated thing you may face with, while programming in Scala.
Scala is widely adopted language in the industry. It resembles parts of
classical Object-oriented programming and elements of Functional programming.
It has glide learning curve. That's why Scala is used as a host language for
this course.


## Preconditions
We assume that you learned the basics of Object-Oriented programming. We expect
you to know the differences between classes and objects, abstract classes and
interfaces, knowledge of gang of four patterns like singleton or factory.
It could be great if you already know what is lambda expression or high-order
functions. But this knowledge is not required.
If you know the various differences between different types of morphisms. If you
know differences between isomorphism and catamorphism, you better to check
another course. And yes. It was the last time I used those words. Trust me!
(fingers crossed)


## The course organization
The course consists of tho parts: textbook and codebook.
Textbook contains a number of chapters that are represented as markdown files.
Each chapter contains a number of parts that contain theoretical materials, and
assignments in `assignment.md` file.

  1. the Textbook consists of
    - a number of topics that contain theoretical materials that will be enough
      to complete the practical part of the course.
    - hyperlinks to various resources where you can read more about the topic
  2. Code book contains a set of templates for practical part.


## How to view the course materials.
To view `Markdown` text you can:

  - View rendered text on `Github`
  - Read those documents as `plain text`. Markdown is human-readable format, so
    I don't think that it will be problematic.
  - You can also find an [offline viewer][markdown-tools] that suit your needs.

You can also use the script that is located inside `assembly` directory to
build HTML file. But you must have UNIX environment and `pandoc` installed.

## The course structure
Before you start completing the exercises you should definitely read the course
material. Course contains a number of chapters:

  - [Chapter 0. Beginning Scala](en/textbook/ch0_beginning_scala)
  - [Chapter 1. Pattern matching](en/textbook/ch1_pattern_matching)
  - [Chapter 2. Types, Data, Data Structures](en/textbook/ch2_types_data_datastructures)
  - [Chapter 3. Functional Thinking](en/textbook/ch3_functional_thinking)
  - [Chapter 4. Collections and Comprehensions](en/textbook/ch4_collections_and_forcomps)
  - [Chapter 5. Out of standard library](en/textbook/ch5_out_of_standard_library)
  - [Chapter 6. Conclusion](en/textbook/ch6_conclusion)

And now, let's take a closed look to each chapter:

### Chapter 0. Beginning Scala
Here you will learn basics of Scala. And I am talking about the syntax. When you
done, you can implement the simple `CLI` application that mimicries one of the
very famous program from `coreutils` package.

### Chapter 1. Pattern Matching
This chapter will you a better understanding of the most powerful syntactic
features of `Scala` (and other functional languages). For many of you it may
look like a simple variation of `switch/case` statement that behaves like an
expression. It is true and false. Pattern matching is much more complicated than
you may think. You will have to finish some recursion exercises that are
represented at the end of the chapter.

### Chapter 2. Types, Data, Data Structures
Lots of languages contain compound data structures, like lists or tuples.
`Scala` is not an exception. You will also learn about Scala's records which
are called `case class`es.

### Chapter 3. Functional Thinking
That's the place where you will learn about currying, immutability, function
composition and other concepts of functional programming

### Chapter 4. Collections and Comprehensions
In chapter you will learn more about Scala's collections library. Knowledge
of collections library will help you to master `Apache Spark` which can be a
pretty good thing in your toolbox. You will also learn more about
list-comprehensions aka generators.

### Chapter 5. Out of standard library
In this chapter you will learn functional concepts that are not present in
Scala's standard library, like lenses, type classes or h-lists.
Here you will meet `Shapeless`, `cats` and `scalaz`.

### Chapter 6. Conclusion
Contains a number of links with sources for further reading.

## Feedback
If you have any questions you can ask them directly - just open an issue and we
will discuss it. I will be also glad to receive your pull-requests.


Принципы функционального программирования на Scala
==================================================

## О чем этот курс?
Этот курс не совсем о Scala. Автор курса не ставит изучение синтаксиса этого
языка целью курса. Scala язык достаточно большой, и всех нюансов мы покрыть
не сможем, более того, даже не будем пытаться. Так что если вы хотите усвоить
синтаксис данного языка — вы можете сделать это самостоятельно.

Цель этого курса — научить вас мыслить функционально. Потому что это, зачастую,
самое сложное с чем вам придется столкнуться. Scala — язык достаточно широко
используемый в индустрии. Scala сочетает в себе классическое ООП с элементами
функционального программирования, при этом обладает достаточно низким порогом
вхождения. Именно поэтому она использована в качестве host языка для данного
курса.


## Необходимые условия
Предполагается, что вы знакомы с основами ООП. Знаете в чем состоит отличие
класса от объекта, абстрактного класса от интерфейса, а также про singleton
и фабрику. Если вы знаете что такое лямбда выражение или функции высших
порядков (high order functions) — еще лучше.
А вот если вы уже знаете, чем изоморфизм отличается от катаморфизма, то вы,
скорее всего, попали не по адресу. И да, таких странных слов, как в последнем
предложении, вы больше в курсе не увидите. Обещаю (скрестив пальцы)


## Организация материалов курса
Материалы курса состоят из двух частей: textbook и codebook.
Textbook представляет собой набор глав, представленных в виде текстовых файлов
в формате markdown. Каждая такая глава представляет собой теоретическую вводную
часть, которой, обычно, достаточно для выполнения заданий, а также сами задания
в файле `assignment.md`

  1. Textbook представляет собой
    - набор тем в формате markdown. Каждая из тем содержит теоретическую вводную
      часть, которой достаточно для выполнения заданий.
    - ссылки на литературу для дополнительного чтения по данной теме.
  2. Code book содержит набор шаблонов для выполнения практических заданий.


## Просмотр материалов курса
Для просмотра текста в формате `Markdown` вы можете:

  - Просматривать отрендеренный текст на github
  - Открывать и читать их как `plain text`, что выглядит вполне читаемым
  - Вы также можете найти [инструмент][markdown-tools] для offline просмотра

Вы также можете воспользоваться скриптом, который создаст вам актуальный `pdf`
файл содержащий текстовую часть курса.


## Cтруктура курса:
Перед выполнением заданий из каждой главы, следует ознакомиться с
соответствующим главе разделом textbook. Курс разбит на следующие главы:

  - [Глава 0. Подступаемся к Scala](ru/textbook/ch0_beginning_scala)
  - [Глава 1. Сопоставление с образцом](ru/textbook/ch1_pattern_matching)
  - [Глава 2. Типы, данные, структуры данных](ru/textbook/ch2_types_data_datastructures)
  - [Глава 3. Функциональное мышление](ru/textbook/ch3_functional_thinking)
  - [Глава 4. Коллекции, и генераторы](ru/textbook/ch4_collections_and_forcomps)
  - [Глава 5. За пределами стандартной библиотеки](ru/textbook/ch5_out_of_standard_library)
  - [Глава 6. Заключение](ru/textbook/ch6_conclusion)

А теперь, давайте подробнее рассмотрим каждую из глав:

### Глава 0. Подступаемся к Scala
Выполнение упражнений этой главы позволит вам быстро освоиться с синтаксисом
языка. После ознакомления с материалами главы, вам будет предложено написать
простейшее консольное приложение, дублирующее функциональность одной,
достаточно известной утилиты пакета `coreutils`.

### Глава 1. Сопоставление с образцом
Эта глава познакомит вас с одним из мощнейших языковых средств `Scala`, да и
многих других функциональных языков. Сопоставление с образцом можно
использовать как выражение, ведущее себя аналогично `switch/case` в ряде
императивных языков. Однако, это лишь верхушка айсберга возможностей,
предоставляемых вам данной синтаксической конструкцией. В конце главы
вам будут предложены простейшие задачи на рекурсию. Авторы этого курса
полагают, что с понятием рекурсии вы успели в свое время ознакомиться.
Вы сможете найти дополнительные материалы по данной теме в файле, содержащем
задания этой главы.

### Глава 2. Типы, данные, структуры данных
Многие языки содержат встроенные в синтаксис языка составные (compound)
структуры данных: списки, кортежи, записи. `Scala` не является здесь каким-то
исключением.  В этой главе вы так же познакомитесь с местным аналогом записей —
`case class`ами.

### Глава 3. Функциональное мышление
Здесь вы узнаете про каррирование, функции высшего порядка, иммутабельность,
композицию функций и другие столпы функционального программирования.

### Глава 4. Коллекции, и генераторы
В данной главе вы познакомитесь со стандартной библиотекой коллекций `Scala`.
Ознакомившись с принципами работы скаловских коллекций, вы сможете с легкостью
освоить `Apache Spark`, который, возможно, окажется полезным для вас
инструментом. Вы так же познакомитесь с генераторами списков
(list comprehensions).

### Глава 5. За пределами стандартной библиотеки
В данной главе вы познакомитесь с функциональными концепциями, которые не
вошли `Scala`: линзы, классы типов, гетерогенные списки. Эти концепции, однако,
нашли свое место в библиотеках, позволяющих расширить возможности
языка: `Shapeless`, `cats`, `scalaz`.

### Глава 6. Заключение
Заключительная глава данного курса. Содержит ссылки на источники для дальнейшего
изучения.

## Обратная связь
Если у вас есть идеи и предложения, открывайте issue - обсудим. Если вы видите
какую-либо неточность, буду рад вашим pull-запросам :)

[markdown-tools]: http://mashable.com/2013/06/24/markdown-tools

