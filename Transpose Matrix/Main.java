#include<iostream>
using namespace std;
int main()
{
  int n;
  cin >> n;
  int a[n][n], res[n][n];
  for(int i = 0; i < n; i++)
  {
    for(int j = 0; j < n; j++)
    {
      cin >> a[i][j];
    }
  }
  for(int i = 0; i < n; i++)
  {
    for(int j = 0; j < n; j++)
    {
      cout << a[i][j] << " ";
    }
    cout << endl;
  }
  cout << "Transpose matrix is:" << endl;
  for(int i = 0; i < n; i++)
  {
    for(int j = 0; j < n; j++)
    {
      res[j][i] = a[i][j];
    }
  }
  for(int i = 0; i < n; i++)
  {
    for(int j = 0; j < n; j++)
    {
      cout << res[i][j] << " ";
    }
    cout << endl;
  }
}