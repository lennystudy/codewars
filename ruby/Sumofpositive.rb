def positive_sum(arr)
  # your code here
  sum = 0
  arr.each { |temp| sum = sum + temp }
  return sum
end

arr = [2,5.2,-1]

puts positive_sum(arr)