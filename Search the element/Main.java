#include<iostream>
using namespace std;
int searchelement(int arr[], int start, int end, int search)
{
  if(start > end)
    return -1;
  if(arr[start] == search)
    return arr[start];
  else if(arr[end] == search)
    return arr[end];
  else
    return searchelement(arr, start+1, end-1, search);
}
int main()
{
  int n, search;
  cin >> n;
  int arr[n];
  for(int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }
  cin >> search;
  int res = searchelement(arr, 0, n-1, search);
  if(res == -1)
    cout << "The number is not present in the list";
  else
    cout << res;
}