#include<iostream>
using namespace std;
int main()
{
  int birth, current, res;
  cin >> birth >> current;
  if(current == 0)
    res = 100 - birth;
  if(birth < current)
    res = current - birth;
  else
    res = (100 + current) - birth;
  cout << res;
}