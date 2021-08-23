list1 = []
list2 = []
list3 = []
n = int(input())
for i in range(0,n):
  ele = int(input())
  list1.append(ele)
  if(list1[i]%2 == 0):
    list2.append(list1[i])
  else:
    list3.append(list1[i])
print(list2)
print(list3)