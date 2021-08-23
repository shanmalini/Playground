// Binary Search Tree operations in C

#include <stdio.h>
#include <stdlib.h>
#include<iostream>
using namespace std;
struct node {
  int key;
  struct node *left, *right;
};

// Create a node
struct node *newNode(int item) {
  struct node *temp = (struct node *)malloc(sizeof(struct node));
  temp->key = item;
  temp->left = temp->right = NULL;
  return temp;
}



// Insert a node
struct node *insert(struct node *node, int key) {
  // Return a new node if the tree is empty
  if (node == NULL) return newNode(key);

  // Traverse to the right place and insert the node
  if (key < node->key)
    node->left = insert(node->left, key);
  else
    node->right = insert(node->right, key);

  return node;
}

void leafSum(struct node *root, int& sum){
    if (!root)
        return;
  
    // add root data to sum if 
    // root is a leaf node
    if (!root->left && !root->right)
        sum += root->key;
  
    // propagate recursively in left
    // and right subtree
    leafSum(root->left, sum);
    leafSum(root->right, sum);
}


// Driver code
int main() {
  struct node *root = NULL;
  int val;
  while(1)
  {
    scanf("%d", &val);
    if(val != -1)
    	root = insert(root, val);
    else
      break;
  }
  int sum = 0;
    leafSum(root, sum);
    cout << "Sum of all leaf nodes are " << sum << endl;
}