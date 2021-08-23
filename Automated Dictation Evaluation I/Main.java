#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str1[50], str2[50];
  cin >> str1 >> str2;
  int res = strcmp(str1, str2);
  if(res == 0)
    cout << "It is correct";
  else
    cout << "It is wrong";
}