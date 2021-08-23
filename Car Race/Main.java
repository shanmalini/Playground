#include<iostream>
using namespace std;
int main()
{
  int ra, rb, rc, n;
  cin >> ra >> rb >> rc >> n;
  if(ra % n == 0)
    cout << "Car 1 goes into road A";
  else if(rb % n == 0)
    cout << "Car 1 goes into road B";
  else if(rc % n == 0)
    cout << "Car 1 goes into road C";
  else
    cout << "No path exist";
}