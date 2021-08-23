#include<iostream>
using namespace std;
int main()
{
  int a, b, c;
   cin >> a >> b >> c;
  int cp = a * c;
  int sp = a * b;
  int profit = sp - cp - 100;
  cout << profit;
}