def binary_array_to_number(arr):
  # your code
  length = len(arr)
  ans = 0
  for x in arr:
  	length = length - 1
  	if x == 1:
  		ans = ans + pow(2, length) 	
  return ans

def binary_array_to_number(arr):
  return int("".join(map(str, arr)), 2)


array = [1,0,0,1]
print(binary_array_to_number(array))
