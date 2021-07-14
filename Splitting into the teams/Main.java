#include<iostream>
using namespace std;
int main()
{
  int a, b;
  cin >> a >> b;
  int c = a / b;
  int d = a % b;
  cout << "The number of friends in each team is " << c << " and left out is " << d;
}