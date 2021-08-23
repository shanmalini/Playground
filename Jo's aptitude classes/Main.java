#include<iostream>
int main()
{
    int a,b,c,gcd1,ans;
    std::cin>>a>>b>>c>>ans;
   int small;
  if(a<b<c) {
    small = a;
  }
  else if(b<a<c) {
    small = b;
  }
  else {
    small = c;
  }
  while(small >= 1) {
    if(a%small == 0 && b%small == 0 && c%small == 0) {
      gcd1 = small;
      break;
    }
    small--;
  }
    if(gcd1 == ans) {
      std::cout<<"Answer is correct.";
    }
    else {
      std::cout<<"Answer is wrong.";
    }
}