#!/usr/bin/env scala

/** Fibonacci Sequence
  *
  * Return the first ARG[0] elements
  * of the fibonacci sequence
  */

object Fibonacci {
  def main(args: Array[String]): Unit = {
    val num_steps = args(0).toInt
    fib_stream take num_steps foreach println
  }

  def find_fib_with_index(index: Int): Int = {
    index match {
      case 0 => 0
      case 1 => 1
      case _ => (find_fib_with_index(index-1) + find_fib_with_index(index-2))
    }
  }

  val fib_stream: Stream[Int] = {
    def rloop(a: Int, b:Int): Stream[Int] = a #:: rloop(b, a+b)
    rloop(1,1)
  }
}
