class SI:
  def calculate(self, p, n, r):
    return (p*n*r)/100
class SICal(SI):
  def display(self, ans):
    print("Principle amount:", p)
    print("No.Of.Years:", n)
    print("Rate of interest:", r)
    print("Simple Interest:", ans)
#main
s = SICal()
p = int(input())
n = int(input())
r = int(input())
ans = s.calculate(p, n, r)
s.display(ans)