#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str1[50], str2[50];
  cin >> str1 >> str2;
  cout << "The concatenated string is " << strcat(str1, str2);
}