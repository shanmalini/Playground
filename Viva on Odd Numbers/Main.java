sum = 0
for i in range(0,3):
	i = input()
	if(i%2 != 0):
		sum = sum + 1
	elif(i < 0):
		break
	else:
		sum = sum - 0.5
print('%.1f'%sum)