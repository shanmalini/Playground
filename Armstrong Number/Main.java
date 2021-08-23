#include <iostream>
#include<math.h>
using namespace std;

int main() 
{
  int value, count = 0, sum = 0;
  cin >> value;
  int temp = value;
  int temp1 = value;
  while(value != 0)
  {
    count++;
    value = value/10;
  }
  while(temp != 0)
  {
    int rem = temp%10;
    sum = sum + pow(rem, count);
    temp = temp/10;
  }
  if(sum == temp1)
    cout << "ARMSTRONG";
  else
    cout << "NOT AN ARMSTRONG";
    return 0;
}