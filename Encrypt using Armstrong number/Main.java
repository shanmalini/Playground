#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    int count = 0;
    int res, last;
    int temp = n;
    int final = n;
    while(n != 0)
    {
      n = n /10;
      count++;
    }
    while(temp != 0)
    { 
      last = temp % 10;
      res = res + power(last, count);
      temp = temp/10;
    }
    if(res == final) {
        return 1;
    }
    else {
        return 0;
    }
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}