#include <iostream>
using namespace std;

void merging_array(int arr[], int low, int mid, int high)
{
  int i, j, k;
  int n1 = mid - low + 1;
  int n2 = high - mid;
  int left[n1], right[n2];
  for(i = 0; i < n1; i++)
  {
    left[i] = arr[low + i];
  }
  for(j = 0; j < n2; j++)
  {
    right[j] = arr[mid + 1 + j];
  }
  i = 0;
  j = 0;
  k = low;
  while(i < n1 && j < n2)
  {
    if(left[i] <= right[j])
    {
      arr[k] = left[i];
      i++;
    }
    else
    {
      arr[k] = right[j];
      j++;
    }
    k++;;
  }
  while(i < n1)
  {
    arr[k] = left[i];
    i++;
    k++;
  }
  while(j < n2)
  {
    arr[k] = right[j];
    j++;
    k++;
  }
}

void merge_sort(int arr[], int low, int high)
{
  if(low < high)
  {
    int mid = (low + high) / 2;
    merge_sort(arr, low, mid);
    merge_sort(arr, mid + 1, high);
    merging_array(arr, low, mid, high);
  }
}

int main() 
{
  int size;
  cin >> size;
  int arr[size];
  for(int i = 0; i < size; i++)
  {
    cin >> arr[i];
  }
  cout << "Before Sort:" << endl;
  for(int i = 0; i < size; i++)
  {
    cout << arr[i] << " ";
  }
  merge_sort(arr, 0, size - 1);
  cout << endl;
  cout << "After Sort:" << endl;
  for(int i = 0; i < size; i++)
  {
    cout << arr[i] << " ";
  }
    return 0;
}