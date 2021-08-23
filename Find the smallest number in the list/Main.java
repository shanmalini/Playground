list = []
min = 9999
n = int(input())
for i in range(0,n):
  ele = int(input())
  list.append(ele)
  if(list[i] < min):
    min = list[i]
print(min)