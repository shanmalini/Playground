#include <iostream>
#include<algorithm>
#include<iterator>
#include<vector>
using namespace std;
int main() 
{
    vector <int> v;
  	int n, value;
  	cin >> n;
  	if(n>0)
    {
      cout << "Enter the number of values to be inserted:" << endl;
      for(int i = 0; i < n; i++)
      {
        cout << "Enter the value to be inserted:" << endl;
        cin >> value;
        v.push_back(value);
      }
      cout << "The values are:" << endl;
      reverse(v.begin(), v.end());
	  copy(v.begin(), v.end(), ostream_iterator<int>(cout, " "));
    }
  	else
      cout << "No value has been inserted";
    return 0;
}