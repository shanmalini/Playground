list = []
n = int(input())
for i in range(0,n):
  ele = int(input())
  list.append(ele)
for i in range(0,n):
	count = 0
	for j in range(0,i):
		if(list[i] != list[j]):
			count = count + 1
print(count-1)