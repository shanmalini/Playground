class Calculator:
  def add(self, num1, num2):
    return num1+num2
  def sub(self, num1, num2):
    return num1-num2
class AdvancedCalculator(Calculator):
  def mul(self, num1, num2):
    return num1*num2
  def div(self, num1, num2):
    return num1//num2
#main
a = AdvancedCalculator()
num1 = int(input())
num2 = int(input())
print("Addition :", a.add(num1, num2))
print("Subtraction :", a.sub(num1, num2))
print("Multiplication :", a.mul(num1, num2))
print("Floor Division :", a.div(num1, num2))