#include<iostream>
using namespace std;
int main()
{
  string str;
  cout << "Enter the input string:" << endl;;
  getline(cin, str);
  int size = str.length();
  cout << "Size of the string: " << size;
}