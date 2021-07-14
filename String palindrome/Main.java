#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[50];
  cin >> str;
  int len = strlen(str);
  if(str[0] == str[len-1])
    cout << "Palindrome";
  else
    cout << "Not a Palindrome";
  //for(int i = 
}