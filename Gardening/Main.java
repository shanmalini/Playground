#include<iostream>
using namespace std;
int main()
{
  int r, c, t;
  cin >> r >> c >> t;
  if(t >= (r+1) && t <= (2*r) || t >= (r-1)*(c-1) && t <= (c-1) * r)
    cout << "It is an orange tree";
  else
    cout << "It is not an orange tree";
              
}