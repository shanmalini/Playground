#include<iostream>
using namespace std;
int main()
{
  int L1, L2, L3;
  cin >> L1 >> L2 >> L3;
  if(L1 < L2 && L1 < L3)
    cout << "L1";
  else if(L2 < L1 && L2 < L3)
    cout << "L2";
  else
    cout << "L3";
}