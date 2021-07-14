#include<iostream>
using namespace std;
int main()
{
  int n, res;
  cin >> n;
  int res1 = 1;
  cout << res1 << " ";
  if(n % 2 == 0)
  {
  for(int i = 0; i < (n/2)-1; i++)
  {
    res = res1 * 2;
    cout << res << " ";
    res1 = res + res1;
    cout << res1 << " ";
  }
    cout << res1 * 2 << " ";
  }
  else
  {
    for(int i = 0; i < n/2; i++)
  {
    res = res1 * 2;
    cout << res << " ";
    res1 = res + res1;
    cout << res1 << " ";
  }
  }
}