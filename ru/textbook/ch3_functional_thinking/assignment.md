Задания для главы 3
===================

## Чистота и побочные эффекты.
Для имеющегося кода в файле `SideEffects.scala`, проставить аннотацию
`@SideEffect` там где по вашему мнению проявляются побочные эффекты.

## Функции высшего порядка.
Для созданного ранее списка рекурсивно реализовать следующие функции:

    def map [B] (f: (A) => B): List[B]
    def filter (predicate: (A) => Boolean): MyList[A]

    def count(predicate: (A) => Boolean): Int
    def find (predicate: (A) => Boolean): Option[A]
    def exists(predicate: (A) => Boolean): Boolean


## Partial functions
Реализовать данную функцию, для вашего списка:

    // создает новую коллекцию путем применения частичной
    // функции ко всем элементам данного листа, на которых
    // определена данная функция
    def collect(pfun: PartialFunction[A,B]): MyList[B]


## Каррирование
Добавить к вашему списку следующие функции:

    def foldLeft [B] (z: B) (operator: (B, A) => B): B
    def foldRight [B] (z: B) (operator: (A, B) => B): B

Используя указанные выше функции, в отдельном файле реализовать
функции `reduceLeft` и `reduceRight` для целочисленного и вещественного
(`Double`) типов.

