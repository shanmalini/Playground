#include<bits/stdc++.h>
using namespace std;
int main()
{
  vector <int> v;
  int n, value, pos;
  cout << "Enter the number of values to be inserted:" << endl;
  cin >> n;
  if(n>0)
  {
    for(int i = 0; i < n; i++)
    {
      cout << "Enter the value to be inserted:" << endl;
      cin >> value;
      v.push_back(value);
    }
    cout << "Enter the position:" << endl;
    cin >> pos;
    cout << "The reference of given position is " << v.at(pos) << endl;
    cout << "The first element of vector is " << v.front() << endl;
    cout << "The last element of vector is " << v.back() << endl;
  }
  else
    cout << "No value has been inserted";
  return 0;
}