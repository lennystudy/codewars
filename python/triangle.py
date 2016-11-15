def is_triangle(a, b, c):
    if a + b > c and abs(a - b) < c:
    	return True
    return False


print(is_triangle(3,1,1))
