#include <iostream>
#include<math.h>
#include<iomanip>
using namespace std;

int main() 
{
   	int value, flag = 0;
  	cin >> value;
  	for(int i = 2; i < sqrt(value); i++)
    {
      if(value % i == 0)
      {
        flag = 1;
        break;
      }
    }
  if(flag == 0)
    cout << fixed << setprecision(2) << sqrt(value);
  else 
    cout << "0.00"; 
    return 0;
}