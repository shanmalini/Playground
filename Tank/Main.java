#include<iostream>
using namespace std;
int main()
{
  int r, h, lit, time;
  cin >> r >> h >> lit >> time;
  int vol = (22/7) * r * r * h;
  int cap = lit*time;
  if(vol > (cap))
    cout << "The tank cannot be filled within " << time << " hours";
  else
    cout << "The tank can be filled within " << time << " hours";
}