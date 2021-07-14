n = input()
count = 0
count1 = 0
temp = n
while(n!=0):
  n=n//10
  count = count + 1
sqr = temp * temp
temp1 = sqr
while(sqr!=0):
  sqr=sqr//10
  count1 = count1 + 1
if(count == 1):
  ans = (temp1 // 10) + (temp1 % 10)
elif(count == 2):
  ans = (temp1 // 100) + (temp1 % 100)
elif(count == 3):
  ans = (temp1 // 1000) + (temp1 % 1000)
if(ans == temp):
    print("Kaprekar Number")
else:
    print("Not A Kaprekar Number")
