require './fizzbuzz'

describe 'fbprint' do
  it 'returns "Fizz" for factors of 3' do
    result = fbprint 48
    result.should eq 'Fizz'
  end

  it 'returns "Buzz" for factors of 5' do
    result = fbprint 25
    result.should eq 'Buzz'
  end

  it 'returns "FizzBuzz" for factors of 3 and 5' do
    result = fbprint 60
    result.should eq 'FizzBuzz'
  end

  it 'returns the integer for anything else' do
    result = fbprint 71
    result.should eq 71
  end
end
