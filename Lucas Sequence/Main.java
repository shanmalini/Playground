def lucas(v):
	if(v == 1):
		return 0
	elif(v == 2):
		return 0
	elif(v == 3):
		return 1
	else:
		return lucas(v-1) + lucas(v-2) + lucas(v-3)

n = int(input())
for n in range(1,n+1):
	print(lucas(n),end=' ')

	