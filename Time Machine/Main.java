#include<iostream>
using namespace std;
class Time
{
  public:
  int hr1, min1, sec1, hr2, min2, sec2, tsec, tmin, thr;
};
int main()
{
  Time t;
  cout << "Enter time:" << endl;
  cout << "Hours :" << endl;
  cin >> t.hr1;
  cout << "Minutes :" << endl;
  cin >> t.min1;
  cout << "Seconds :" << endl;
  cin >> t.sec1;
  cout << "Enter time:" << endl;
  cout << "Hours :" << endl;
  cin >> t.hr2;
  cout << "Minutes :" << endl;
  cin >> t.min2;
  cout << "Seconds :" << endl;
  cin >> t.sec2;
  t.tsec = t.sec1 + t.sec2;
  if(t.tsec > 60)
  {
    t.tsec = t.tsec - 60;
  	t.tmin = t.min1 + t.min2 + 1;
  }
  else
  {
    t.tmin = t.min1 + t.min2;
  }
  if(t.tmin > 60)
  {
    t.tmin = t.tmin - 60;
  	t.thr = t.hr1 + t.hr2 + 1;
  }
  else
  {
    t.thr = t.hr1 + t.hr2;
  }
  cout << "Time after add: " << t.thr << ":" << t.tmin << ":" << t.tsec << endl;
}