n = int(input())
m = int(input())
count = 0
print("The multiplication table of",n,"is")
for i in range(0,m):
  count = count + 1
  print(count,"*",n,"=",count*n, sep = '')