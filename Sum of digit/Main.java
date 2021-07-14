// C program to compute sum of digits in
// number.
#include <iostream>
using namespace std;

/* Function to get sum of digits */
class gfg {
public:
	int getSum(int n)
	{
		int sum = 0;
		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}
};

// Driver code
int main()
{
	gfg g;
	int n;
  cin >> n;
	cout << g.getSum(n);
	return 0;
}
