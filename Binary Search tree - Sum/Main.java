#include<iostream>
using namespace std;
struct nodetree
{
  int data;
  struct nodetree *left;
  struct nodetree *right;
};
void insert(struct nodetree **root, int value)
{
    struct nodetree *newnode = (struct nodetree*)malloc(sizeof(struct nodetree));
    newnode -> data = value;
    newnode -> left = NULL;
    newnode -> right = NULL;
    if(*root == NULL)
        *root = newnode;
    else
    {
        struct nodetree *temp = *root;
        while(1)
        {
            if(value < temp->data)  // inserting left child
            {
                if(temp->left == NULL)
                {
                    temp->left = newnode;
                    return;
                }
                temp = temp->left;
            }
            else // inserting right child
            {
                if(temp->right == NULL)
                {
                    temp->right = newnode;
                    return;
                }
                temp = temp->right;
            }
        }
    }
}
int sumofnodes(struct nodetree *root)
{
  if(root == NULL)
    return 0;
  else
    return root->data + sumofnodes(root->left) + sumofnodes(root->right);
}
int main()
{
  struct nodetree *root = NULL;
  int value;
  while(1)
  {
    cin >> value;
    if(value >= 0)
      insert(&root, value);
    else
      break;
  }
  int sum = sumofnodes(root);
  cout << "Sum of all nodes are " << sum;
  return 0;
}