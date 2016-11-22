def remove_smallest(numbers):
	if numbers == []:
		return numbers
	min_num = min(numbers)
	numbers.remove(min_num)
	return min_num


arr = [1,2,3,4,1]
print(arr)
arr.remove(3)
print(arr)
arr.remove(1)
print(arr)