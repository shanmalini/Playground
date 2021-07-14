#include<iostream>
using namespace std;
int main()
{
  int r, l;
  cin >> r >> l;
  if(r > l/2)
    cout << "Circle cannot be inside a square";
  else
    cout << "Circle can be inside a square";
}