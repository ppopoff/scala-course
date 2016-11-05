package chr3
package lists

package listimpl {

  sealed trait MyList [A]
  case class Nil [A]() extends MyList[Nothing]
  case class Cons [A] (head: A, tail: MyList[A]) extends MyList[A]


  // test
  // val xs = Cons(7, Cons(6, Nil))
}






object Main {
  def main(args: Array[String]): Unit = {
    println("stub")
  }
}
