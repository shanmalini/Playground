#include<iostream>
using namespace std;
class abst
{
  protected:
  int n;
  public:
 void draw(int n);
  void input(int a)
  {
    n = a;
  }
  
};
class rectangle:public abst
{
	public:
	void draw(int n)
    {
    	cout << "Rectangle" << endl;
        cout << "The given input is " << n << endl;
     }
};

class circle : public abst
{
	public:
	void draw(int n)
    {
    	cout << "Circle" << endl;
        cout << "The given input is " << n << endl;
     }
};
    
int main()
{
  rectangle r;
  circle c;
  int n;
  cin >> n;
  r.input(n);
  r.draw(n);
  c.draw(n);
  return 0;
}