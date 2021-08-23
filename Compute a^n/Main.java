#include<iostream>
using namespace std;
int computepower(int a, int n)
{
  if(n == 0)
    return 1;
  else
    return a * computepower(a, n-1);
}
int main()
{
  int a, n;
  cout << "Enter the value of a" << endl;
  cin >> a;
  cout << "Enter the value of n" << endl;
  cin >> n;
  int res = computepower(a, n);
  cout << "The value of " << a << " power " << n << " is " << res;
}