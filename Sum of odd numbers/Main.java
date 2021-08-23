#include<iostream>
using namespace std;
class sum
{
  public:
  int i, sum = 0;
  void cal();
  void display();
};
void sum::cal()
{
  int val;
  cin >> val;
  for(i = 1; i <= val; i = i+2)
  {
    sum = sum + i;
  }
}
void sum::display()
{
  cout << sum;
}
int main()
{
	sum s;
  	s.cal();
  	s.display();
	return 0;
}