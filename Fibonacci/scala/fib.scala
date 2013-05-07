#!/usr/bin/env scala

/** Fibonacci Sequence
  *
  * Return the first ARG[0] elements
  * of the fibonacci sequence
  */

object Fibonacci {
  def main(args: Array[String]): Unit = {
    val num_steps = args(0).toInt
    fib(num_steps).foreach(println)
  }

  def fib(count: Int): Array[Int] = {
    var results = Array(1, 1)

    while( results.length < count ) {
      results = results :+ results.takeRight(2).fold(0)((total, n) => total + n)
    }

    results.take(count)
  }

  /** fib_expensive()
    *
    * There is no good reason to use this method.
    * It was added to demonstrate that find_fib_with_index()
    * is working correctly.
    */

  def fib_expensive(count: Int): Array[Int] = {
    var results = Array[Int]()

    (1 to count).map(x => results :+= find_fib_with_index(x))

    results
  }

  def find_fib_with_index(index: Int): Int = {
    index match {
      case 0 => 0
      case 1 => 1
      case _ => (find_fib_with_index(index-1) + find_fib_with_index(index-2))
    }
  }
}
