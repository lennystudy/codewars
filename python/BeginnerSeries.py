def get_sum(a,b):
    #good luck!
    if a == b:
    	return a
    return int((a + b) / 2 * (abs(a - b) + 1))
#    return a == b?a : int((a + b) / 2 * (abs(a - b) + 1))

print(get_sum(2,2))