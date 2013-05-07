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
    var results = Array(0, 1)

    while( results.length < count ) {
      results = results :+ results.takeRight(2).fold(0)((total, n) => total + n)
    }

    results.take(count)
  }
}
