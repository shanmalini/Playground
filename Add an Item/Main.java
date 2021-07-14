tup = (4, 6, 2, 8, 3, 1)
tup1 = (tup + (9,))
tup1 = tup1[:5] + (15, 20, 25) + tup1[:5]
list1 = list(tup1)
list1.append(30)
tu = tuple(list1)
print(tu)

