require 'problem1'

describe Euler::Problem1 do
  let(:problem1) { Euler::Problem1 }

  describe '#desc' do
    it 'responds with "Multiples of 3 and 5"' do
      response = problem1::desc
      response.should eq "Multiples of 3 and 5"
    end
  end

  describe "#sum_multiples" do
    it 'responds correctly to the sample situation' do
      # If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
      # The sum of these multiples is 23.
      response = problem1::sum_multiples( [3, 5], 0..9 )
      response.should eq 23
    end
  end
end
