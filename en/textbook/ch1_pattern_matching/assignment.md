Assignment for Chapter 1
========================

Here you will master recursion and pattern matching. There's no place to tell
about the recursion, because we expect that you learned it in high-school.
All of those tasks should be solved recursively with help of pattern matching.

## Exercise 1
You should an sub-string entrance count for given string. For given function:

    def substringCount(s: String, sub: String): Int = ???

the following output is expected:

    substringCount("catcowcat", "cat") -> 2
    substringCount("catcowcat", "c")   -> 3
    substringCount("abracadabra", "z") -> 0

and for the following case:

    substringCount("aaaaa", "aa") -> 4


## Exercise 2
You should write a function that accepts a list of characters and returns
`true` if opening and enclosing parentheses are balanced.

## Exercise 3
You should write an utility that counts a disk space usage for given directory,
including all nested files/directories. The program should have command line
interface. It should accept a directory which size will be counted as the only
command line argument. If there's no parameter given, the program should count
disk usage for the current directory. If it is not possible to read the file,
the program should print an error message with their name on the `stdin`.


Further reading
===============
Try to use tail recursion when possible. The `@tailrec` annotation will help
you. You can read more about tail calls [here]

[Here][trampolines] you may read about trampolines and [here][scala-rec-fun]
about the ways they can be useful in `Scala`.

A very interesting article on [Dr. Dobbs's][tcall-opt] website. You may read
there about specifics of tail recursion implementation for JVM.

[tail-call]: https://en.wikipedia.org/wiki/Tail_call
[trampolines]: http://blog.richdougherty.com/2009/04/tail-calls-tailrec-and-trampolines.html
[scala-rec-fun]: http://fruzenshtein.com/scala-recursive-function/
[tcall-opt]: http://www.drdobbs.com/jvm/tail-call-optimization-and-java/240167044

