#include <iostream>
#include<iomanip>
using namespace std;

int main() 
{
  float p, n;
  float r, si;
  cin >> p >> n >> r;
  si = (p*n*r)/100;
  cout << fixed << setprecision(6) << si;
  return 0;
}