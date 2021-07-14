list = []
n = int(input())
for i in range(0,n):
  ele = int(input())
  list.append(ele)
  max = list[i]
  if(list[i] > max):
    max = list[i]
print(max)