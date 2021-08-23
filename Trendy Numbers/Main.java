n = input()
count = 0
n1 = (n // 10) % 10
while(n != 0):
	n = n/10
	count = count + 1
if(count == 3 and n1%3 == 0):
	print("Trendy Number")
else:
	print("Not a Trendy Number")