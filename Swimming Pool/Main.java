#include<iostream>
using namespace std;
int main()
{
  int len, lit;
  cin >> len >> lit;
  int res = len * len * len * 1000;
  if(res > lit)
    cout << "Can store";
  else
    cout << "Cannot store";
}