#include<iostream>
using namespace std;
int numberofdigits(int n)
{
  if(n <= 9)
    return 1;
  else
    return 1 + numberofdigits(n/10);
}
int main()
{
  int n;
  cout << "Enter the value of n" << endl;
  cin >> n;
  int res = numberofdigits(n);
  cout << "The number of digits in " << n << " is " << res;
}