#include <iostream>
#include<iomanip>
#include<math.h>
using namespace std;

int main() 
{
    float oppo, adj, hyp;
  	cin >> oppo >> adj;
  	hyp = sqrt((oppo*oppo) + (adj*adj));
  	cout << fixed << setprecision(2) << hyp;
    return 0;
}