#只排数组中的奇数
def sort_array(source_array):
    # Return a sorted array.
	if source_array == []:
		return source_array
	oddarr = []
	for x in source_array:
		if x % 2 == 1:
			oddarr.append(x)
	oddarr.sort()
	temp = 0
	for i in range(0,len(source_array)):
		if source_array[i] % 2 == 1:
			source_array[i] = oddarr[temp]
			temp = temp + 1
	return source_array

#要试着去学习python的这种写法　
def sort_array(arr):
  odds = sorted((x for x in arr if x%2 != 0), reverse=True)
  return [x if x%2==0 else odds.pop() for x in arr]


arr = [0, 1, 2, 3, 4, 5, 8, 7, 6, 5]

print(arr)

print(sort_array(arr))
