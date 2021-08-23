#include <iostream>
using namespace std;
int fact(int n)
{
  int f = 1;
  for(int i = 1; i <= n; i++)
    f = f * i;
  return f;
}
int main() 
{
   int value, temp, rem, sum = 0;
  cin >> value;
  temp = value;
  while(value != 0)
  {
    rem = value % 10;
    sum = sum + fact(rem);
    value = value/10;
  }
  if(sum == temp)
    cout << "Yes";
  else
    cout << "No";
    return 0;
}