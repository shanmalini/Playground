#include<iostream>
using namespace std;
class Nailah
{
  public:
  void print(int age)
  {
    cout << age <<endl;
  }
  void print(float height)
  {
    cout << height;
  }
};
int main()
{
	Nailah n;
  	int age;
  	float height;
  	cin >> age >> height;
  	n.print(age);
  	n.print(height);
	return 0;
}