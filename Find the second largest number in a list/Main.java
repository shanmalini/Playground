list1 = []
n = int(input())
for i in range(0,n):
  ele = int(input())
  list1.append(ele)
  list1.sort()
print(list1[-2])