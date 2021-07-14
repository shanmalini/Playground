#include<iostream>
using namespace std;
int main()
{
  float s, d, time;
  cin >> s >> d >> time;
  float t = s / d;
  if(t < time)
    cout << "No";
  else
    cout << "Yes";
}