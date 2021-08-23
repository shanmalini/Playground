#include<iostream>
using namespace std;
class Dora
{
  public:
  int d, s;
  int operator +()
  {
    return d+s;
  }
};
int main()
{
	Dora n;
  	cin >> n.d >> n.s;
  	cout << +n;
	return 0;
}