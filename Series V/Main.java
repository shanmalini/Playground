#include<iostream>
using namespace std;
int main()
{
  int n;
  cin >> n;
  int a = 11;
  for(int i = 1; i <= n; i++)
  {
    int res = a * a;
    cout << res << " ";
    a = a + 4;
  }
}