#include<iostream>
using namespace std;
int binary_search(int arr[], int low, int high, int element)
{
  int mid;
  if(low <= high)
  {
    mid = (low + high) / 2;
  if(arr[mid] == element)
  {
    return mid;
  }
  else if(arr[mid] >= element)
  {
    return binary_search(arr, 0, mid-1, element);
  }
  else if(arr[mid] <= element)
  {
    return binary_search(arr, mid+1, high, element);
  }
  }
  return -1;
}
int main()
{
  int size, element, index;
  cin >> size;
  int arr[size];
  for(int i = 0; i < size; i++)
  {
    cin >> arr[i];
  }
  cin >> element;
  index = binary_search(arr, 0, size, element);
  if(index >= 0)
  {
    cout << index;
  }
  else
  {
    cout << "Not found";
  }
  return 0;
}