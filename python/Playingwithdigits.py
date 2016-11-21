def dig_pow(n, p):
    # your code
    arr = []
    n1 = n
    ans = 0
    temp = 0
    while n >= 10:
    	temp = n % 10
    	n = n // 10
    	arr.append(temp)
    arr.append(n)
    p = p + len(arr) - 1
    for x in arr:
    	ans = ans + x ** p
    	p = p - 1
    if ans % n1 == 0:
    	return ans/n1
    return -1


print(dig_pow(156,2))
