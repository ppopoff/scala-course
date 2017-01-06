Assignments for chapter 2
=========================

## Your personal list
Implement your personal list as `ADT` (Cons, Nil) The List should be linked
(single linked) and immutable. You should also implement `companion` object
with `apply` method that will allow you to construct list with following
syntax: `val myList = MyList(1,2,3,4,5)`.

All methods that are listed below must be implemented *recursively*:

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

    // Returns first n elements of the list
    // if n > list size it will return the whole list
    def take (n: Int): MyList[A]

    // returns last n elements of the list
    def takeRight(n: Int): MyList[A]

    def reverse: MyList[A]

    def zip [B] (that: MyList[B]): List[(A, B)]
    def zipWithIndex: List[(A, Long)]

    def append(that: MyList[A]): List[A]

    // appends element to the beginning of list
    def cons(a: A): List[A]

Various algorithmic optimizations are welcome. But nor required.

