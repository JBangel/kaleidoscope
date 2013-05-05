def fbprint x
  if x % 15 == 0
    return "FizzBuzz"
  elsif x % 3 == 0
    return "Fizz"
  elsif x % 5 == 0
    return "Buzz"
  end

  x
end

if __FILE__ == $0
  (1..100).each { |x| puts(fbprint x) }
end
