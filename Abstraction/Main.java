#include<iostream>
using namespace std;
class abst
{
  private:
  int a, b;
  public:
  void set(int x, int y)
  {
    a = x;
    b = y;
  }
  void display()
  {
    cout << "a = " << a << endl;
    cout << "b = " << b << endl;
  }
};
int main()
{
  abst a;
  int n1, n2;
  cin >> n1 >> n2;
  a.set(n1, n2);
  a.display();
  return 0;
}