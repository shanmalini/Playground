#include<iostream>
using namespace std;
int product(int arr[], int size)
{
  int left[size], right[size];
  left[0] = 1; 
  right[size - 1] = 1; 
  int prod[size];
	for (int i = 1; i < size; i++) 
		left[i] = arr[i - 1] * left[i - 1];
	for (int j = size - 2; j >= 0; j--) 
		right[j] = arr[j + 1] * right[j + 1]; 
	for (int i = 0; i < size; i++) 
		prod[i] = left[i] * right[i];
  for(int i = 0; i < size; i++)
  {
    cout << prod[i] << "\n";
  }
}
int main()
{
  int size;
  cin>>size;
  int arr[size];
  for(int i = 0; i < size; i++)
  {
    cin >> arr[i];
  }
  product(arr, size);
  return 0;
}