#include<iostream>
using namespace std;
int main()
{
  int n;
  cin >> n;
  int temp = n, rem, sum = 0;
  while(n != 0)
  {
    rem = n % 10;
    sum = sum + rem;
    n = n / 10;
  }
  if(temp % sum == 0)
    cout << "Harshad Number";
  else
    cout << "Not Harshad Number";
}