class Person:
  def __init__(self, name):
    self.name = name
  def display(self):
    print("Name of Person =", name)
class Staff(Person):
  def __init__(self, id):
    self.id = id
  def display(self):
    print("Staff Id is  =", id)
class TemporaryStaff(Staff):
  def __init__(self, days, hours):
    self.days = days
    self.hours = hours
  def display(self, salary):
    print("No. of Days =", days)
    print("No. of Hours Worked =", hours)
    print("Total Salary =", salary)
  def salary(self):
    return days*hours*150
#main
name = input()
id = int(input())
days = int(input())
hours = int(input())
p = Person(name)
s = Staff(id)
t = TemporaryStaff(days, hours)
p.display()
s.display()
salary = t.salary()
t.display(salary)