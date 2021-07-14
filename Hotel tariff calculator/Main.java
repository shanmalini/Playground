#include<iostream>
using namespace std;
int main()
{
  int month, rent, n;
  cin >> month >> rent >> n;
  int res = rent * n;
  if(month > 12)
    cout << "Invalid Input";
  else
  {
  if(month == 4 || month == 5 || month == 6 || month == 11 || month == 12)
    res = res + (res/100*20);
  cout << res;
  }
}