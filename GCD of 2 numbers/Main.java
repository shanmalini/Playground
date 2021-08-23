#include <iostream>
using namespace std;
int gcd(int num1, int num2)
{
  if(num1 == 0 || num2 == 0)
    return 0;
  if(num1 == num2)
    return num1;
  else if(num1 > num2)
    return gcd(num1-num2, num2);
  return gcd(num1, num2-num1);
}
int main() 
{
   	int num1, num2, temp;
  	cin >> num1 >> num2;
  	cout << gcd(num1, num2);
    return 0;
}