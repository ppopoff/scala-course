Scala beans
===========

Scala предоставляет отличное взаимодействие с Java. Она также способна
облегчить вам жизнь при дизайне так называемых Beans. Если вы не знакомы с
Java или концепцией Beans, советуем [ознакомиться][java-beans].


## Геттеры и сеттеры
В Scala имеется механизм, схожий с [Project Lombok][project-lombok]. Он
называется BeanProperty и является частью стандартной библиотеки.
Все, что вам нужно, — создать bean и добавить аннотацию “BeanProperty” к каждому
полю, для которого хотите создать getter или setter.
[Здесь][bean-property-alvin] вы можете подробнее прочитать об использовании
данного свойства. Документацию к “BeanProperty” вы можете найти
[здесь][bean-property-doc].

Если вы хотите создать getter и setter для переменной логического типа,
[данный класс][bool-prop] может вам в этом помочь: на выходе вы получите метод
вида `isProperty`.


## Неинициализируемые значения
Scala также поддерживает неинициализированные значения. Эта функциональность
как раз потребуется вам при создании beans. Давайте посмотрим на следующий
пример на Java:

    class MyClass {
        // По-умолчанию, любой наследник AnyRef инциализируется в ноль.
        // Примитивные типы инициализируются со своими значениями по-умолчанию.
        String uninitialized;
    }

То же самое можно проделать и в Scala:


    class {
      // синтаксис с нижним подчеркиванием говорит Scala, что
      // данное поле не будет инциализированно.
      var uninitialized: String = _
    }

Пожалуйста, **не делайте этого**. Инициализируйте значения везде, где можете.
Используйте подобную функциональность, только если используемый вами фреймворк
или библиотека яростно на этом настаивают. При неаккуратном использовании вы
можете получить тонны `NullPointerException`. Однако знать об этой функции
следует, однажды подобное знание сэкономит время. Если вы
хотите отложить инициализацию, используйте ключевое слово `lazy`.

[java-beans]: https://en.wikipedia.org/wiki/JavaBeans
[project-lombok]: https://projectlombok.org/
[bean-property-doc]: https://www.scala-lang.org/api/2.12.0/scala/beans/BeanProperty.html
[bean-property-alvin]: http://alvinalexander.com/scala/how-to-create-scala-javabeans-beanproperty-java-libraries
[bean-property-illustrated]: https://daily-scala.blogspot.ru/2009/09/beanproperties.html
[bool-prop]: http://www.scala-lang.org/api/2.12.0/scala/beans/BooleanBeanProperty.html

