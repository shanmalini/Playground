#include<iostream>
using namespace std;
int main()
{
  char ch;
  cin >> ch;
  if(isalpha(ch))
  {
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
      cout << "Vowel";
    else
      cout << "Consonant";
  }
  else
    cout << "Not an alphabet";
}