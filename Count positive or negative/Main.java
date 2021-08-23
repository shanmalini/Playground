n = int(input())
sum = 0
count = 0
for i in range(0, n):
  i = int(input())
  if(i>0):
    count = count + 1
    sum = sum + i
print("Number of positive numbers entered is",count,"and the sum is",sum)