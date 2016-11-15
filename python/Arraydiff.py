def array_diff(a, b):
    #your code here
    for x in b:
    	if a.count(x) > 0:
    		for k in range(0,a.count(x)):
    			a.remove(x)
    return a

def array_diff(a, b):
    return [x for x in a if x not in b]


array = [1,3,3,4,1,3,6,4]
array1 = [1,3]

print(array_diff(array,array1))

for x in array:
	print(x)