#include<iostream>
using namespace std;
int main()
{
  int n;
  cin >> n;
  int a = 6, b = 5;
  cout << a << " ";
  for(int i = 1; i <= n-1; i++)
  {
    a = a + (b * i);
    cout << a << " ";
  }
}