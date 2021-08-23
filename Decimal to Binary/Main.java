#include<iostream>
using namespace std;
int dectobin(int n)
{
  if(n == 0)
     return 0;
  else
    return n % 2 + 10 * dectobin(n/2);
}
int main()
{
  int n;
  cin >> n;
  int res = dectobin(n);
  cout << res;
}