#include <iostream>
#include<math.h>
using namespace std;

int main() 
{
   int value, temp;
  cin >> value;
  temp = sqrt(value);
  if(temp*temp == value)
    cout << "YES";
  else
    cout << "NO";
    return 0;
}