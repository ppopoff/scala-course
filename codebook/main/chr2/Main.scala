package chr2
package recursion


object Main {

  /** Here's an example of recursive algorithm.
    * @param  a list of natural numbers
    * @return the sum of the elements
    */
  def sum(numbers: List[Int]): Int = numbers match {
    case x :: xs => first + sum(rest)
    case Nil     => 0
  }

  /** And here's the another example.
    * It uses nested function for the recursion.
    * @return the largest element of the list
    */
  def max(numbers: List[Int]): Int = {
    // the given list should not be empty, or exception will be trown
    require(numbers.nonEmpty)

    def maxRec(theLargest: Int, numbers: List[Int]) = numbers match {
      case x :: xs => maxRec(math.max(x, theLargest), xs)
      case Nil     => theLargest
    }

    maxRec(numbers.head, numbers.tail)
  }


  // TODO: add a couple of recursive functions here


  /** You have to use recursive algorithm to tell, whether
    * the parentheses are balanced or not.
    *
    * Input:
    * ------
    * A list of arbitrary characters.
    *
    * To do:
    * ------
    * The function must return true, if
    *
    * Hint:
    * ----------
    * use headOpt and Tail methods of the list
    */
  def isBalanced(chars: List[Char]): Boolean = {
    // a template for the nested function that should be used.
    // it contains counter variable that should be used as part
    // of the internal state
    def balanceRec(chars: List[Char], counter: Int): Boolean = ???

    // here you should call your recursive implementation
    // with a state parameter
    ???
  }


  /**
    */
  def main(args: Array[String]): Unit = ()

}
