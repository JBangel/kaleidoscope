#!/usr/bin/env scala

def fbprint(x:Int) = x match {
  case i:Int if i % 15 == 0 => "FizzBuzz"
  case i:Int if i %  3 == 0 => "Fizz"
  case i:Int if i %  5 == 0 => "Buzz"
  case _                    => x
}

(1 until 100).foreach { x =>
  println(fbprint(x))
}
