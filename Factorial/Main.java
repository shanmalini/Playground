#include <iostream>
using namespace std;
long int fact(long int value)
{
  if(value == 0)
    return 1;
  else
    return value * fact(value-1);
}
int main() 
{
   long int value, ans;
  cin >> value;
  ans = fact(value);
  cout << ans;
    return 0;
}