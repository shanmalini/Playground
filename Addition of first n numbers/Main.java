#include<iostream>
using namespace std;

int add(int n)
{
  if(n == 0)
    return 0;
  else
    return n + add(n-1);
}
int main()
{
 	int n;
  	cin >> n;
  	int res = add(n);
  cout << res;
}