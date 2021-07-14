#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int k = 0;
  char str[50], str1[50];
  cin >> str >> str1;
  int len = strlen(str);
  char res[50];
  for(int i = len-1; i >= 0; i--)
  {
    res[k] = str[i];
    k++;
  }
  res[k] = '\0';
  int result = strcmp(res, str1);
  if(result == 0)
    cout << "It is correct";
  else
    cout << "It is wrong";    
}