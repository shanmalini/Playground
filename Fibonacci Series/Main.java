#include<iostream>
using namespace std;
int func(int n)
{
  if(n == 1)
    return 0;
  else if(n == 2)
    return 1;
  else
    return func(n-1) + func(n-2);
}
int main()
{
  int n;
  cin >> n;
  int res = func(n);
  cout << "The term " << n << " in the fibonacci series is " << res;
}