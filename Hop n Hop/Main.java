#include<iostream>
using namespace std;
int main()
{
  int a = 3, b = 4, x, y;
  cin >> x >> y;
  int c = x - a;
  int d = y - b;
  c > d ? cout << c : cout << d;
}