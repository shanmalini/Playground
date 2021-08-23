#include<iostream>
using namespace std;
int main()
{
  int a, b, c;
  cin >> a >> b >> c;
  int ben = a * b / 100;
  int black = c * (a - ben) / 100 ;
  int rem = (a - (ben + black)) / 3;
  cout << ben << endl << black << endl << rem;
}