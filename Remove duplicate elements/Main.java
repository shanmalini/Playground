#include<iostream>
using namespace std;
int main()
{
  int n, j;
  cin >> n;
  int arr[n], b[n], k = 0;
  for(int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }
  for(int i = 0; i < n; i++)
  {
    for(j = 0; j < k; j++)
    {
      if(arr[i] == b[j])
        break;
    }
    if(j == k)
    {
      b[k] = arr[i];
      k++;
    }
  }
  for(int i = 0; i < k; i++)
  {
    cout << b[i] << endl;
  }
}