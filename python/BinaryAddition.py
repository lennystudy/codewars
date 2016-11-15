def add_binary(a,b):
    #your code here
    temp = a + b
    ans = ""
    while temp != 0:
    	ans = str(temp%2) + ans
    	temp = temp//2
    return ans

print(add_binary(2,5))


def add_binary(a,b):
    return bin(a+b)[2:]