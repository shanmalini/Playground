#include<iostream>
using namespace std;
int main()
{
  char str[50];
  cin >> str;
  for(int i = 0; str[i] != '\0'; i++)
  {
    str[i] = str[i] + 32;
  }
  cout << "String in lowercase is " << str;
}