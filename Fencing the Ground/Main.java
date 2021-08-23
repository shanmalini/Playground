#include<iostream>
using namespace std;
int main()
{
  int l, b;
  cin >> l >> b;
  int len = 2*(l + b);
  int area = l * b;
  cout << "Required length is " << len << " m" << endl;
  cout << "Required area of carpet is " << area << " sqm";
}