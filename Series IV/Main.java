#include<iostream>
#include<cmath>
using namespace std;
/*int main()
{
  int n;
  float a = 0.5f;
  cin >> n;
  cout << a << " ";
  for(int i = 0; i < n-1; i++)
  {
    a = a + pow(3, i);
    cout << a << " ";
  }
}*/
int main()
{
  int n;
  float a = 0.5f;
  cin >> n;
  cout << a << " ";
  for(int i = 1; i <= n-1; i++)
  {
    a = a + a * 2;
    cout << a << " ";
  }
}