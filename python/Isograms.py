def is_isogram(string):
    #your code here
    string = string.lower()
    hashMap = {}
    for x in string:
    	if x in hashMap:
    		return False
    	hashMap[x] = 1
    return  True

def is_isogram(string):
    return len(string) == len(set(string.lower()))

a = {"1":2}
print(a)

string = "heelo"
print(is_isogram(string))

print(set(string))