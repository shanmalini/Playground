#include<iostream>
using namespace std;

int main()
{
  int n, i, d, res, last, first;
  cin >> n;
  int arr[n];
  for(i = 0; i < n; i++)
  {
    cin >> arr[i];
  }
  first = arr[0];
  last = arr[n-1];
  d = (last - first) / (n - 1);
  for(i = 0; i < n; i++)
  {
    if(arr[i+1] - arr[i] != d)
    {
      res = arr[i] + d;
      break;
    }
  }
  cout << res;
  return 0;
}