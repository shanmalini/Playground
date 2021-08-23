#include<iostream>
using namespace std;
int main()
{
  int n, temp1, temp2, sum = 0;
  cin >> n;
  int a1[n], a2[n];
  for(int i = 0; i < n; i++)
  {
    cin >> a1[i];
  }
  for(int i = 0; i < n; i++)
  {
    cin >> a2[i];
  }
  for(int i = 0; i < n; i++)
  {
    for(int j = i + 1; j < n; j++)
    {
      if(a1[i] > a1[j])
      {
        temp1 = a1[i];
        a1[i] = a1[j];
        a1[j] = temp1;
      }
    }
  }
  for(int i = 0; i < n; i++)
  {
    for(int j = i + 1; j < n; j++)
    {
      if(a2[i] > a2[j])
      {
        temp2 = a2[i];
        a2[i] = a2[j];
        a2[j] = temp2;
      }
    }
  }
  for(int i = 0; i < n; i++)
  {
    sum = sum + (a1[i] * a2[i]);
  }
  cout << sum;
}