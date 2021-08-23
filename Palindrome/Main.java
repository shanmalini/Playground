#include <iostream>
using namespace std;

int main() 
{
   int value, sum = 0;
  cin >> value;
  int temp = value;
  while(value != 0)
  {
    int rem = value%10;
    sum = sum *10 + rem;
    value = value/10;
  }
  if(sum == temp)
    cout << "Palindrome";
  else
    cout << "Not a Palindrome";
    return 0;
}