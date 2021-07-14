#include<iostream>
using namespace std;

int sumDigit(int i)
{
    int sum = 0;
    while(i != 0)
    {
      i = i % 10;
      sum = sum + i;
      i = i / 10;
    }
    return sum;
}

int main()
{
  int n, d, i, temp, sum;
  cin >> n;
  cin >> d;
  int count = 0;
  for(i = 1; i <= n; i++)
  {
    temp = i;
    sum = sumDigit(i);
    if((temp - sum) >= d)
    {
      count = count + 1;
    }
  }
  cout << count;
  return 0;
}