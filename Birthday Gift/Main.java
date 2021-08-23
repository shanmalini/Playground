#include<iostream>
using namespace std;
class Ramu
{
  public:
  int calculate(int m, int l)
  {
    return m+l;
  }
  int calculate(int m, int l, int b)
  {
    return m+l+b;
  }
};
int main()
{
	Ramu r;
  	int m, l, b;
  	cin >> m >> l >> b;
  	cout << r.calculate(m, l) << endl;
  	cout << r.calculate(m, l, b);
	return 0;
}