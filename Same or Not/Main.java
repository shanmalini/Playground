#include<iostream>
using namespace std;
int main()
{
  int size1, size2, sum1 = 0, sum2 = 0;
  cin >> size1 >> size2;
  int arr1[size1];
  int arr2[size2];
  for(int i = 0; i < size1; i++)
  {
    cin >> arr1[i];
  }
  for(int i = 0; i < size2; i++)
  {
    cin >> arr2[i];
  }
  for(int i = 0; i < size1; i++)
  {
    sum1 = sum1 + arr1[i];
  }
  for(int i = 0; i < size2; i++)
  {
    sum2 = sum2 + arr2[i];
  }
  if(sum1 == sum2 && size1 == size2)
    cout << "Same";
  else
    cout << "Not Same";
}