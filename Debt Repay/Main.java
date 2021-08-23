#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int p, r, n;
  cin >> p >> r >> n;
  float i = ((float)p*(float)n*(float)r)/100;
  float a = (float)p + i;
  float d = 2*i/100;
  float s = a - d;
  cout << fixed << setprecision(2) << i << endl;
  cout << fixed << setprecision(2) << a << endl;
  cout << fixed << setprecision(2) << d << endl;
  cout << fixed << setprecision(2) << s << endl;
}