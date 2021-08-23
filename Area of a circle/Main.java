#include <iostream>
#include<iomanip>
using namespace std;

int main() 
{
   int dia;
   float area, r;
  cin >> dia;
  r = (float)dia/2;
  area = 3.14*r*r;
  cout << fixed << setprecision(2) << area;
    return 0;
}