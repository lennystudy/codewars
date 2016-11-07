def count_sheeps(arrayOfSheeps):
  # TODO May the force be with you
  count = 0
  for x in arrayOfSheeps:
  	if x == True:
  		count = count + 1
  return count

#best practice
def count_sheeps(arrayOfSheeps):
  return arrayOfSheeps.count(True)

array = [1,2,True];

print(count_sheeps(array))

#这个居然不校验０和１的