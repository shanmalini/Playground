#include <iostream>
using namespace std;

int main() 
{
   int value, sum = 0;
  cin >> value;
  for(int i = 1; i < value; i++)
  {
    if(value%i == 0)
      sum = sum + i;
  }
  if(sum == value)
    cout << "Yes";
  else
    cout << "No";
    return 0;
}