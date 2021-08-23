#include<iostream>
using namespace std;
int main()
{
  int w, a, c;
  cin >> w >> a >> c;
  int totwei = (a * 75) + (c * 30);
  if(totwei > w)
    cout << "Boat will sink";
  else
    cout << "Boat is stable";
}