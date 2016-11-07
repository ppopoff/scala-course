Задания для главы 2
===================

## Ваш персональный список
Реализуйте ваш персональный список, в виде ADT (Cons, Nil). Список
должен быть односвязным и иммутабельным. Для списка реализуйте companion
object, с методом `apply`, который будет позволять конструкцию элементов
следующим образом: `val myList = MyList(1,2,3,4,5)`.

Для списка должны быть *рекурсивным* образом реализованный следующие
методы:

    def size: Long

    def isEmpty: Boolean

    def head: A
    def last: A
    def headOpt: Option[A]
    def lastOpt: Option[A]
    def tail: MyList[A]
    def init: MyList[A]

    // should return index of given element
    def indexOf(elem: A): Long

    // Возвращает первые n элементов списка
    // если n больше
    def take (n: Int): MyList[A]

    // Возвращает n последних элементов списка
    def takeRight(n: Int): MyList[A]

    def reverse: MyList[A]

    def zip [B] (that: MyList[B]): List[(A, B)]
    def zipWithIndex: List[(A, Long)]

    def append(that: MyList[A]): List[A]

    // операция которая дописывает в начало списка.
    def cons(a: A): List[A]

Использование различных алгоритмических оптимизацией приветствуется,
но не является обязательным.
