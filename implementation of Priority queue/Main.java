#include <iostream>  
#include<queue>  
using namespace std;  
int main()  
{  
 priority_queue<int> p;  // variable declaration.  
  int val;
  while(1)
  {
    cin >> val;
    if(val != -1)
      p.push(val); 
    else
      break;
  }

 while(!p.empty())  
 {  
     std::cout << p.top() << " ";   
     p.pop();  
 }  
 return 0;  
}  