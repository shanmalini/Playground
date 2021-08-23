#include<iostream>
using namespace std;
int main()
{
  float f1, f2;
  int p;
  cin >> f1 >> f2 >> p;
  float t = f1 + f2;
  float d = p*t/100;
  float f = t - d;
  cout << t << endl;
  cout << f << endl;
  cout << d;
}