#include<iostream>
using namespace std;
int main()
{
  int x1, x2, y1, y2;
  cin >> x1 >> y1 >> x2 >> y2;
  float o1 = ((float)x1 + (float)x2) / 2;
  float o2 = ((float)y1 + (float)y2) / 2;
  cout << "Rachel's house is located at(" << o1 << "," << o2 << ")";
}