#include<iostream>
using namespace std;
class Nut
{
  public:
  int calculate(int l, int b)
  {
    return l*b;
  }
};
class Nut1
{
  public:
  int calculate(int b, int h)
  {
    return (b*h)/2;
  }
};
int main()
{
	Nut n;
  	Nut1 n1;
  	int x1, x2;
  	cin >> x1 >> x2;
  	cout << n.calculate(x1, x2) << endl;
  	cout << n1.calculate(x1, x2);
	return 0;
}