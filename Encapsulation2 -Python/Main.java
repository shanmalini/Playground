class Account:
  def __init__(self, ac_no, name, secret, debit, credit):
    self.__accountnumber = ac_no
    self.__holdername = name
    self.__secretcode = secret
    self.__amountdebited = debit
    self.__amountcredited = credit
  def display(self):
    print("****Statement****")
    print("Account Number :", self.__accountnumber)
    print("Holder Name :", self.__holdername)
    print("Number of Debits :", self.__amountdebited)
    print("Number of Credits :", self.__amountcredited)
  def generateStatement(self, check):
    if self.__secretcode == check:
      self.display()
    else:
      print("Invalid Login")
#main
ac_no = input()
name = input()
secret = input()
debit = input()
credit = input()
a = Account(ac_no, name, secret, debit, credit)
check = input()
a.generateStatement(check)