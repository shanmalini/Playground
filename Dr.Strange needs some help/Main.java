#include<iostream>
int main()
{
  int m, n, req;
  std::cin >> m;
  std::cin >> n;
  std::cin >> req;
  int res = m;
  for(int i = 1; i < n; i++)
  {
    res = res * m;
  }
  if(res >= req)
  {
    std::cout << "Doctor, you can proceed with your experiment.";
  }
  else 
  {
    std::cout << "Sorry Doctor! You need more bacteria.";
  }
}  