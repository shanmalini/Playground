#include <iostream>
using namespace std;
 
// Function to check if a given array represents min-heap or not
bool checkMinHeap(int A[], int i, int n)
{
    // if `i` is a leaf node, return true as every leaf node is a heap
    if (2*i + 2 > n) {
        return true;
    }
 
    // if `i` is an internal node
 
    // recursively check if the left child is a heap
    bool left = (A[i] <= A[2*i + 1]) && checkMinHeap(A, 2*i + 1, n);
 
    // recursively check if the right child is a heap (to avoid the array index out
    // of bounds, first check if the right child exists or not)
    bool right = (2*i + 2 == n) || (A[i] <= A[2*i + 2] && checkMinHeap(A, 2*i + 2, n));
 
    // return true if both left and right child are heaps
    return left && right;
}
 
int main()
{
	int n;
  cin >> n;
  int A[n];
  for(int i = 0; i < n; i++)
    cin >> A[i];
 
    // start with index 0 (the root of the heap)
    int index = 0;
 
    if (checkMinHeap(A, index, n)) {
        cout << "Given array is a min heap";
    }
    else {
        cout << "Given array is not a min heap";
    }
 
    return 0;
}