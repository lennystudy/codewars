def persistence(n):
    # your code
    if n < 10:
    	return 0
    ans = 1
    count = 0
    while n > 0:
    	ans = ans * (n % 10)
    	n = n // 10
    	if n == 0 and ans >= 10:
    		count = count + 1
    		n = ans
    		ans = 1
    return count+1


#https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/python

print(persistence(999))



