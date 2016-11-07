Задания для главы 3
===================

## Чистота и сайд эффекты.
Для имеющегося кода в файле `SideEffects.scala`, проставить аннотацию
`@SideEffect` там где по вашему мнению проявляются побочные эффекты.

## Функции высшего порядка.
TODO:

Для созданного ранее списка реализовать следующие функции:

    def map [B] (f: (A) => B): List[B]
    def filter (predicate: (A) => Boolean): MyList[A]

    def count(predicate: (A) => Boolean): Int
    def find (predicate: (A) => Boolean): Option[A]
    def exists(predicate: (A) => Boolean): Boolean

    def foldl [B] (z: B) (operator: (B, A) => B): B
    def foldr [B] (z: B) (operator: (A, B) => B): B

    // создает новую коллекцию путем применения частичной
    // функции ко всем элементам данного листа, на которых
    // определена данная функция
    def collect(pfun: PartialFunction[A,B]): MyList[B]

