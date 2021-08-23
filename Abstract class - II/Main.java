#include<iostream>
using namespace std;
class abst
{
  protected:
  int n;
  public:
  
  abst()
  {
    cout << "Base class constructor" << endl;
  }
  void input()
  {
    cin >> n;
  }
};
class derived:public abst
{
	public:
    derived()
    {
    	cout << "Derived class constructor" << endl;
     }
     void output()
     {
     	cout << "The given input is " << n ;
     }
  };
int main()
{
  derived d;
  d.input();
  d.output();
  return 0;
}