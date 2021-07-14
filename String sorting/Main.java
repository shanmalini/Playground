#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[50];
  char temp;
  cin >> str;
  int len = strlen(str);
  for(int i = 0; i < len; i++)
  {
    for(int j = i+1; j < len; j++)
    {
      if(str[i] > str[j])
      {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
      }
    }
  }
  cout << "The sorted string is " << str;
}