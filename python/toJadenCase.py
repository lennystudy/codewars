def toJadenCase(string):
    # ...
	if string is None or string == "":
	 	return string
	list1 = list(string)
	for x in range(1,len(list1)):
		if x == " ":
			x = x + 1
			list1[x].capitalize()
	string = str(list1)
	return string

	# str1 = " ".join(arr)
	# for x in range(0,len(string)-1):
	# 	if string[x] == " ":
	# 		x = x + 1
	# 		temp = string[x].capitalize()
	# 		string[x] = temp
	# return string

# str1 = "he is what you think"
# print(len(str1))
# print(type(str1[1]))
# print(str1[1].capitalize())
# print(str1.capitalize())
# print(toJadenCase(str1))

# print(str1.title())

str1 = "hello is what"

print(toJadenCase(str1))



# list1 = list(str1)
# for x in range(0,len(list1)):
# 	print(1)

# print(list1)

# str2 = str(list1)

# arr = str1.split(" ")
# print(arr)
# for x in arr:
# 	x = x.capitalize()
# 	print(x)


# print(arr)

# print(str1)