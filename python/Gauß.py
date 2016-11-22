import types
def f(n):
    if type(n) is  types.IntType or n <= 0:
        return None
    return str(int(((n+1)/2*n)))



print(f(9))
print(type(9))