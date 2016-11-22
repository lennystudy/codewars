def iq_test(numbers):
	array = numbers.split(" ")
	odd = 0
	even = 0
	tempodd = 0
	tempeven = 0
	for x in range(0,len(array)):
		if int(array[x]) % 2 == 0:
			even = even + 1
			tempodd = x + 1
		else:
			odd = odd + 1
			tempeven = x + 1
		if even > 1 and odd == 1:
			return tempeven
		if odd > 1 and even == 1:
			return tempodd


#别人的解法
def iq_test(numbers):
    e = [int(i) % 2 == 0 for i in numbers.split()]

    return e.index(True) + 1 if e.count(True) == 1 else e.index(False) + 1

	


print(iq_test("2 2 5 2 4"))

print(iq_test("1 2 2"))

