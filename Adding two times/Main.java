#include<iostream>
using namespace std;
class Time
{
  public:
  int hr1, min1, sec1, hr2, min2, sec2, thr, tmin, tsec, tempmin, tempsec;
};
int main()
{
	Time t;
  	cin >> t.hr1 >> t.min1 >> t.sec1 >> t.hr2 >> t.min2 >> t.sec2;
  	t.tsec = t.sec1 + t.sec2;
  	if(t.tsec > 60)
    {
      t.tempsec = t.tsec;
      t.tsec = t.tsec%60;
      t.tmin = t.min1 + t.min2 + (t.tempsec/60);
    }
  else
  	t.tmin = t.min1 + t.min2;
  if(t.tmin > 60)
    {
      t.tempmin = t.tmin;
      t.tmin = t.tmin%60;
      t.thr = t.hr1 + t.hr2 + (t.tempmin/60);
    }
  else
    t.thr = t.hr1 + t.hr2;
  cout << t.thr << ":" << t.tmin << ":" << t.tsec;
	return 0;
}