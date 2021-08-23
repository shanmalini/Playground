#include<iostream>
using namespace std;

int gcd(int a, int b)
{
  if(a == 0 || b == 0)
    return 0;
  if(a == b)
    return a;
  if(a > b)
    return gcd(a-b,b);
  return gcd(a,b-a);
}
int main()
{
  int n1, n2, n3, res;
  cin >> n1 >> n2 >> n3;
  if(n1 >= n2 && n1 >= n3)
  {
    if(n2 >= n3)
      res = n2;
    else
      res = n3;
  }
  else if(n2 >= n1 && n2 >= n3)
  {
    if(n1 >= n3)
      res = n1;
    else
      res = n3;
  }
  else if(n3 >= n1 && n3 >= n2)
  {
    if(n1 >= n2)
      res = n1;
    else
      res = n2;
  }
  cout << "The treasure is in box which has number " << res << endl;
  int res1 = gcd(n1, n2);
  int res2 = gcd(res1, n3);
  cout << "The code to open the box is " << res2;
}