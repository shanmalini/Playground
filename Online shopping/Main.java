#include<iostream>
using namespace std;
int main()
{
  int fa, fd, fs, sa, sd, ss, aa, ad, as, f, s, a;
  cin >> fa >> fd >> fs >> sa >> sd >> ss >> aa >> ad >> as;
  f = fa - (fa/100*fd) + fs;
  s = sa - (sa/100*sd) + ss;
  a = aa - (aa/100*ad) + as;
  cout << "In Flipkart Rs." << f << endl;
  cout << "In Snapdeal Rs." << s << endl;
  cout << "In Amazon Rs." << a << endl;
  if(f < s && f < a)
    cout << "He will prefer Flipkart";
  else if(s < f && s < a)
    cout << "He will prefer Snapdeal";
  else if(a < f && a < s)
    cout << "He will prefer Amazon";
  else if(f == s && f < a)
    cout << "He will prefer Flipkart";
  else if(f == s && a < f)
    cout << "He will prefer Amazon";
}