#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[50];
  cin >> str;
  char str1[50];
  strcpy(str1, str);
  cout << "The copied string is " << str1;
}