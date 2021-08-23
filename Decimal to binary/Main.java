#include <iostream>
using namespace std;

int main() 
{
   int value, i = 0;
  cin >> value;
  int arr[50];
  while(value != 0)
  {
    arr[i] = value%2;
    value = value/2;
    i++;
  }
  for(int j = i-1; j >= 0; j--)
    cout << arr[j];
    return 0;
}