def mxdiflg(a1, a2):
    # your code
    if a1 == [] or a2 == []:
    	return -1
    array1 = []
    array2 = []
    for x in a1:
    	array1.append(len(x))
    for y in a2:
    	array2.append(len(y))
    return max(abs(max(array1)-min(array2)),abs(max(array2)-min(array1)))

#别人的解法
def mxdiflg(a1, a2):
    if a1 and a2:
        return max(abs(len(x) - len(y)) for x in a1 for y in a2)
    return -1

a1 = ["abc","bf"]
a2 = ["a","b"]

print(mxdiflg(a1,a2))
