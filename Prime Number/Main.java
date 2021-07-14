#include<iostream>
using namespace std;
int prime(int n, int i)
{
  if(i == 1)
    return 1;
  else if(n % i == 0)
    return 0;
  else
    return prime(n, i-1);
}
int main()
{
  int n;
  cin >> n;
  int res = prime(n, n/2);
  if(res == 0)
    cout << "Not a Prime Number";
  else
    cout << "Prime Number";
}