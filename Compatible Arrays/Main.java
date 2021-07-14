list1 = []
list2 = []
flag = 0
n = int(input())
for i in range(0,n):
  ele1 = int(input())
  list1.append(ele1)
for i in range(0,n):
  ele2 = int(input())
  list2.append(ele2)
for i in range(0,n):
	if(list1[i] >= list2[i]):
		flag = 1
if(flag == 1):
  print("Compatible")