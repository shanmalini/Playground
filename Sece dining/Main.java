#include<iostream>
using namespace std;
int main()
{
  string str;
  int n;
  cin >> str >> n;
  if((str == "front" || str == "FRONT" && n == 1) || (str == "rear" || str == "REAR" && n ==2))
    cout << "Left Handed";
  else
    cout << "Right Handed";
}