#include<iostream>
using namespace std;
int sumofdigits(int n)
{
  if(n == 0)
    return 0;
  else
    return n % 10 + sumofdigits(n/10);
}
int main()
{
  int n;
  cout << "Enter the value of n" << endl;
  cin >> n;
  int res = sumofdigits(n);
  cout << "The sum of digits in " << n << " is " << res;
}