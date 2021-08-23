#include<iostream>
using namespace std;
union employee
{
  char name[50];
  int salary;
};

int main()
{
  union employee e;
  cout << "Enter the Employee details" << endl;
  cout << "Enter the Employee name : " << endl;
  cin >> e.name;
  cout << "Enter the Employee salary : " << endl;
  cin >> e.salary;
  cout << "Employee Details" << endl;
  cout << e.name << " " << e.salary;
}