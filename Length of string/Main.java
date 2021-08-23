#include <iostream>
#include<string.h>
using namespace std;

int main() 
{
  int count = 0;
  char str[50];
  cin.getline(str, 50);
  for(int i = 0; str[i] != '\0'; i++)
  {
    count++;
  }
  cout << count;
    return 0;
}