#include<iostream>
using namespace std;
class abst
{
  protected:
  int a, b, sum;
  public:
    void input()
  {
    cin >> a >> b;
    }
  void output()
  {
   sum = a + b;
    cout << "Sum: " << sum;
  }
};
int main()
{
  abst a;
  a.input();
  a.output();
  return 0;
}