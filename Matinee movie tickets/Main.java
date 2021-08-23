#include<iostream>
using namespace std;
int main()
{
  int age;
  float time, res = 13.30f;
  cin >> age >> time;
  if(age <= 13)
  {
    if(time == res)
      cout << "$2.00";
    else
      cout << "$4.00";
  }
  else
  {
    if(time == res)
      cout << "$5.00";
    else
      cout << "$8.00";
  }
}