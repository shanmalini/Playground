#include<iostream>
using namespace std;
class perfect
{
  private:
  int n, i, div, sum = 0;
  public:
  void calc()
  {
	cin >> n;
	for(i = 1; i < n; i++)
	{
      div = n % i;
      if(div == 0)
        sum = sum + i;
    }
  }
  void check()
  {
    if(sum == n)
      cout << "Yes";
    else
      cout << "No";
  }
};

int main()
{
  perfect p;
  p.calc();
  p.check();
  return 0;
}