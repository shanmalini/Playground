#include<iostream>
using namespace std;
class Shape
{
  	public:
	virtual void Enter_data() = 0; // 1st pure virtual function
  	virtual void Perimeter() = 0; // 2nd pure virtual function
};
class Rectangle : public Shape
{
	public:
	float length, breadth;
    void Enter_data()
    {
    	cin >> length >> breadth;
    }
    void Perimeter()
    {
    	cout << "Perimeter of rectangle: " << 2 * (length + breadth)<<endl;
    }
};
 
class Circle : public Shape 
{
	public:
	float radius;
    void Enter_data()
    {
    	cin >> radius;
    }
    void Perimeter()
    {
    	cout << "Perimeter of circle: " << 2 * 3.14 * radius;
    }
};
int main()
{
	Rectangle r;
  	Circle c;
  	r.Enter_data();
  	r.Perimeter();
  	c.Enter_data();
  	c.Perimeter();
}