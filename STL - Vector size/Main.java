#include<iostream>
#include<vector>
using namespace std;
int main()
{
  vector <int> v;
  int n, value, newsize;
  cin >> n;
  for(int i = 0; i < n; i++)
  {
    cin >> value;
    v.push_back(value);
  }
  cin >> newsize;
  return 0;
}