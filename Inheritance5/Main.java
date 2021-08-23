class Item:
  def __init__(self, price):
    self.price = price
class Customer:
  def __init__(self, product, quantity):
    self.product = product
    self.quantity = quantity
class Bill(Customer, Item):
  def __init__(self):
    Customer.__init__(self, product, quantity)
    Item.__init__(self, price)
  def display(self, price, quantity):
    print("Total Price is:", price*quantity)
#main
product = input()
price = int(input())
quantity = int(input())
b = Bill()
b.display(price, quantity)