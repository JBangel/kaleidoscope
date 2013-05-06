#!/usr/bin/env scala

object Problem1 {
  def main(args:Array[String]) = println(sum_multiples(List(3,5), 1 to 999))

  def sum_multiples(array:List[Int], range:Range) = {
    range.fold(0) { (total, num) =>
      if (array.exists(x => num % x == 0))
        (total + num)
      else
        total
    }
  }
}
