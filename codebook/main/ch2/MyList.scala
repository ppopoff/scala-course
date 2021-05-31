package scalacourse
package ch2

trait List [+A] {
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
  
  // High order functions
  // Recursively implement the following methods:
  def map [B] (f: (A) => B): List[B]
  def filter (predicate: (A) => Boolean): MyList[A]

  def count(predicate: (A) => Boolean): Int
  def find (predicate: (A) => Boolean): Option[A]
  def exists(predicate: (A) => Boolean): Boolean
  
  // Partial function
  // creates a new collection by its partial application to all elements
  // of given list where this function is defined
  def collect(pfun: PartialFunction[A,B]): MyList[B]
  
  // Currying
  def foldLeft [B] (z: B) (operator: (B, A) => B): B
  def foldRight [B] (z: B) (operator: (A, B) => B): B
}


object List {
  def apply (items: A**) = ???


  def fill [T] (value: T)(size: Int) = ???
  def empty: MyList = ???
}

// case class Cons() extends List[+A]
// case class Nil() extends List[+A]


// something else is also missing ;)?

