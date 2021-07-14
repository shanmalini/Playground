// C++ program to find the min and max element
// of Array using sort() in STL

#include <bits/stdc++.h>
using namespace std;

int main()
{
	// Get the array
	int n;
  cin >> n;
  int arr[n];
	for(int i = 0; i < n; i++)
      cin >> arr[i];
	
// Find the maximum element
	cout << "Maximum element in array: "
		<< *max_element(arr, arr + n);
  cout << endl;
	// Find the minimum element
	cout << "Minimum element in array:"
		<< *min_element(arr, arr + n);

	
	return 0;
}
