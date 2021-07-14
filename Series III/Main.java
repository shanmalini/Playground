#include<iostream>
using namespace std;
int main()
{
  int n;
  cin >> n;
  int a = 3;
  cout << a << " ";
  for(int i = 1; i <= n - 1; i++)
  {
    a = a * 3;
    cout << a << " ";
  }
}