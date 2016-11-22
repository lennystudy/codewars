def sum_dig_pow(a, b): # range(a, b + 1) will be studied by the function
    # your code here
    ans = []
    sum_temp = 0
    temp = []
    while a < b:
    	temp_a = a
        while a >= 10:
            temp.append(a % 10)
            a = a // 10
        temp.append(a)
        i = 1
        for x in temp:
        	sum_temp = sum_temp + x ** 1
        a = a + 1
    return []


print(sum_dig_pow(1,100))

# 遍历求出这个数中的每一位元素　将其丢入到数组中 