#include<bits/stdc++.h>
using namespace std;
int main()
{
  vector <int> v;
  int value, n, n1, value1, value2, value3;
  cout << "Enter the value to be assigned and how many times:" << endl;
  cin >> value >> n;
  v.assign(n, value);
  cout << "The assigned values are:" << endl;
  copy(v.begin(), v.end(), ostream_iterator<int>(cout, " "));
  cout << endl;
  cout << "Enter the number of values to be inserted:" << endl;
  cin >> n1;
  for(int i = 0; i < n1; i++)
  {
    cout << "Enter the value:" << endl;
    cin >> value1;
    v.push_back(value1);
  }
  cout << "The values are:" << endl;
  copy(v.begin(), v.end(), ostream_iterator<int>(cout, " "));
  cout << endl;
  cout << "The first element erased is " << v.front() << endl;
  v.erase(v.begin());
  cout << "Enter the value to be inserted at the beginning:" << endl;
  cin >> value2;
  v.insert(v.begin(), value2);
  cout << "Enter the value to be inserted at the end:" << endl;
  cin >> value3;
  v.push_back(value3);
  copy(v.begin(), v.end(), ostream_iterator<int>(cout, " "));
  return 0;
}