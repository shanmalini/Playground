count = 0
while(True):
    v = int(input())
    if(v%8 == 0):
        count = count + 1
        continue
    else:
        break
print("The number of valid numbers entered is",count)