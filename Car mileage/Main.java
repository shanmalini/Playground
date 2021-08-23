#include<iostream>
using namespace std;
int main()
{
  float mil;
  int pet, dis;
  cin >> mil >> pet >> dis;
  int res = mil * pet;
  if(res > dis)
    cout << "Can reach";
  else
    cout << "Cannot reach";
}