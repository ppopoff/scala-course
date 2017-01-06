Assignments for chapter 3
=========================

## Purity and side-effects
For code in file `SideEffects.scala`, add `@SideEffect` where as you think side
effects take their places.

## High order functions
For previously defined list, **recursively** implement the following methods:

    def map [B] (f: (A) => B): List[B]
    def filter (predicate: (A) => Boolean): MyList[A]

    def count(predicate: (A) => Boolean): Int
    def find (predicate: (A) => Boolean): Option[A]
    def exists(predicate: (A) => Boolean): Boolean


## Partial functions
Implement the following function for your list:

    // creates a new collection by its partial application to all elements
    // of given list where this function is defined
    def collect(pfun: PartialFunction[A,B]): MyList[B]


## Currying
Add the following methods to your list:

    def foldLeft [B] (z: B) (operator: (B, A) => B): B
    def foldRight [B] (z: B) (operator: (A, B) => B): B

By using function that were defined above, **in a separate file** implement
`reduceLeft` and `reduceRight` for both `Int`egral and `Double` types.

