#include<iostream>
using namespace std;

int smallest(int n1, int n2, int n3)
{
  if(n1 < n2 && n1 < n3) 
     return n1;
  else if(n2 < n1 && n2 < n3)
     return n2;
  else
     return n3;
}

int greatest(int n1, int n2, int n3)
{
  if(n1 > n2 && n1 > n3) 
     return n1;
  else if(n2 > n1 && n2 > n3)
     return n2;
  else
     return n3;
}

int main()
{
  int n1, n2, n3, res1, res2, res3, res4, res;
  cin>>n1>>n2>>n3;
  res1 = smallest(n1/1000, n2/1000, n3/1000);
  res2 = greatest((n1/100)%10, (n2/100)%10, (n3/100)%10);
  res3 = smallest((n1/10)%10, (n2/10)%10, (n3/10)%10);
  res4 = greatest(n1%10, n2%10, n3%10);
  res = (res1*1000) + (res2*100) + (res3*10) + res4;
  cout<<res;
  return 0;
}