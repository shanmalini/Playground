#include<iostream>
using namespace std;
int main()
{
  int a1, b1, a2, b2, a3, b3;
  cin >> a1 >> b1 >> a2 >> b2 >> a3 >> b3;
  float o1 = ((float)a1 + (float)a2 + (float)a3) / 3;
  float o2 = ((float)b1 + (float)b2 + (float)b3) / 3;
  cout << o1 << endl;
  cout << o2;
}