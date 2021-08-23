class Employee:
  def __init__(self, name, acc, bal, depo, withdraw):
    self.name = name
    self.acc = acc
    self.bal = bal
    self.depo = depo
    self.withdraw = withdraw
class Sub(Employee):
  def display(self):
  	print("Employee Details:")
  	print("\nCustomer name: ", name)
  	print("\nAccount number: ", acc)
  	print("\nBalance: ", bal)
  	print("\nDeposits: ", depo)
  	print("\nWithdrawal: ", withdraw)
name = input()
acc = int(input())
bal = int(input())
depo = int(input())
withdraw = int(input())
s = Sub(name, acc, bal, depo, withdraw)
s.display()