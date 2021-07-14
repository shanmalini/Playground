#include<iostream>
using namespace std;
class Student
{
  public:
  string name;
  int roll, marks;
  float percentage;
};
int main()
{
  Student st;
  cout << "Enter name:" << endl;
  getline(cin, st.name);
  cout << "Enter roll number:" << endl;
  cin >> st.roll;
  cout << "Enter total marks outof 500:" << endl;
  cin >> st.marks;
  cout << "Student details:" << endl;
  cout << "Name: " << st.name << endl;
  cout << "Roll Number: " << st.roll << endl;
  cout << "Total: " << st.marks << endl;
  st.percentage = ((float)st.marks*100)/500;
  cout << "Percentage: " << st.percentage << endl;
}