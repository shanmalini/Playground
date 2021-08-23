#include<iostream>
using namespace std;
class Ree
{
  public:
  int calculate(int side)
  {
    return side*side;
  }
  int calculate(int l, int b)
  {
    return l*b;
  }
};
int main()
{
	Ree r;
  	int side, l, b;
  cin >> side >> l >> b;
  cout << r.calculate(side) << endl;
  cout << r.calculate(l, b);
	return 0;
}