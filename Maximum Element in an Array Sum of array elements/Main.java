list = []
sum = 0
n = int(input())
for i in range(0,n):
  ele = int(input())
  list.append(ele)
  sum = sum + list[i]
print(sum)    