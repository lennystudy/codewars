def vampire_test(x, y):
	ans = list(str(x * y))
	for c in list(str(x)):
		if c in ans:
			ans.remove(c)
		else:
			return False
	for c in list(str(y)):
		if c in ans:
			ans.remove(c)
		else:
			return False
	if ans == []:
		return True
	return False
	return ans
print(vampire_test(6,2))
print(list(str(233)))
