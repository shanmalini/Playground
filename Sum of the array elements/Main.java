#include<iostream>
using namespace std;
int sumofarray(int arr[], int n)
{
  if(n <= 0)
    return 0;
  else
    return arr[n-1] + sumofarray(arr, n-1);
}
int main()
{
  int n; // n - array size
  cin >> n;
  int arr[n];
  for(int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }
  int res = sumofarray(arr, n);
  cout << res;
}