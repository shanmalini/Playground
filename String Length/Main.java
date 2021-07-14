#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int count = 0;
  string str;
  cin >> str;
  /*for(int i = 0; str[i] != '\0'; i++) 
  {
    count++;
  }*/
  count = str.length();
  cout << "The length of word " << str << " is " << count;
}