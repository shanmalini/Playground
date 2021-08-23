class Parent:
  def __init__(self, name, num):
    self.name = name;
    self.id = num;
class Child(Parent):
  def __init__(self, name, num):
    Parent.__init__(self, name, num)
    print(name)
    print(num)
name = input()
num = int(input())
c = Child(name, num)