#include<iostream>
using namespace std;
int main()
{
  int r, c;
  cin >> r >> c;
  int a1[r][c], a2[r][c], res[r][c];
  for(int i = 0; i < r; i++)
  {
    for(int j = 0; j < c; j++)
    {
      cin >> a1[i][j];
    }
  }
  for(int i = 0; i < r; i++)
  {
    for(int j = 0; j < c; j++)
    {
      cin >> a2[i][j];
    }
  }
  for(int i = 0; i < r; i++)
  {
    for(int j = 0; j < c; j++)
    {
      res[i][j] = a1[i][j] + a2[i][j];
    }
  }
  for(int i = 0; i < r; i++)
  {
    for(int j = 0; j < c; j++)
    {
      cout << res[i][j] << " ";
    }
    cout << endl;
  }
}