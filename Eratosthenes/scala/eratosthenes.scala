#!/usr/bin/env scala

object Eratosthenes {
  def main(args: Array[String]) = {
    var results = sieve(10000)
    results.foreach(println)
  }

  def sieve(max: Int) = {
    var remainder = (2 to max).toArray
    var results: Array[Int] = Array()

    while( remainder.length > 0 ) {
      var factor = remainder.head
      results = results :+ factor
      remainder = remainder.tail.filterNot( x => x % factor == 0 )
    }

    results
  }
}
