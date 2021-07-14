#include<iostream>
using namespace std;
int main()
{
  int blast, visual, auditory, arms, legs;
  cin >> blast >> visual >> auditory >> arms >> legs;
  int res = (blast * 350.34) + (visual * 230.90) + (auditory * 190.55) + (arms * 125.30) + (legs * 180.90);
  if(res < 15000)
    cout << "Yes";
  else
    cout << "No";
}