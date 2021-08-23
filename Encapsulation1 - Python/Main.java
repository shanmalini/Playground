import sys
class Customer:
  def __init__(self, ac_no, List):
    self.__ac_no = ac_no
    self.__List = List
  def __processAccount(self):
    flag = 0
    for i in range(len(self.__List)):
      if self.__ac_no == self.__List[i]:
        print("Processing Account")
        flag = 1;
    if flag == 0:
      print("Account Not Found")
  def getAccountNumber(self):
    return self.__ac_no
#main
ac_no = int(input())
List = []
while True:
  listvalues = int(input())
  if listvalues != -1:
    List.append(listvalues)
  else:
    break
c = Customer(ac_no, List)
print("Customer Account Number :", c.getAccountNumber())
c._Customer__processAccount()