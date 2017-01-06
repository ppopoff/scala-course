Assignments for Chapter 0
=========================

  - Install `Scala`
  - Try some `Repl`
  - Write a small imperative `wc`. Details below.


Before you begin
================
Please read about one very notable trait from the standard library. The trait
is called `DelayedInit`. More details [here][delayed-init].

What does it mean, and why I gave you the information about it right now?
Ok, let me explain The `App` trait that is extended in countless tutorials and
examples is broken. `App` extends `DelayedInit`, so both are broken. You may
find more information in the official [documentation][app-doc].

That's why you should know it before you start writing your first application
and not use `App` trait. Instead you should use standard `main` method.


Your small and cozy wc
======================
For unfamiliar with UNIX, wc is not a place for mediation. It's a small utility
from `coreutils` package that counts a number of words and lines for given file.
In our case, you should write a simplified wc, by using the given template,
which you may find in your `codebook`.

The program should be ran from command line, and it should accept two arguments:

 - parameter
 - file name

The only exception is the `-h` key. It doesn't allow any other keys or
parameters. If a file is the only parameter use `-w` by default.

Parameter should accept the following values: `-l`, `-m`, `-w`, `-h`.
If program is ran without a single parameter, help must be shown.

 * `-h` -- shows help
 * `-l` -- counts the number of lines for given file (count `\n` chars)
 * `-w` -- counts the number of words

> To implement `-w` you should count the number of sequential whitespaces:
> it can be ` ` or `\n`, and add 1 to the resulting number.

There's no need for multi-file support. One file will be enough.
You **CAN NOT** use regular expressions. And you are free to use any tools
you may find useful.

[app-doc]: http://www.scala-lang.org/api/current/scala/App.html
[delayed-init]: http://www.scala-lang.org/api/current/scala/DelayedInit.html

