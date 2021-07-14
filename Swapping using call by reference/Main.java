#include<iostream>
void fun(int &x, int &y)
{
  x = x + y;
  y = x - y;
  x = x - y;
}
int main()
{
  int a, b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b;
  fun(a, b);
  std::cout<<"\nAfter swapping a= "<<a<<" and b="<<b;
}