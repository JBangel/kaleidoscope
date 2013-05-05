module Euler
  class Problem1
    def self.desc
      "Multiples of 3 and 5"
    end

    def self.sum_multiples(ary, range)
      range.inject(0) do |sum, n|
        ary.any? { |i| n % i == 0 } ? sum + n : sum
      end
    end
  end
end

if __FILE__ == $0
  puts Euler::Problem1::sum_multiples([3,5], 0..999)
end
