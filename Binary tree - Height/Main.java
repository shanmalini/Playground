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
int height(struct nodetree *root)
{
  if(root == NULL)
    return 0;
  else
  {
    int lheight = height(root->left);
    int rheight = height(root->right);
    if(lheight > rheight)
      return 1+lheight;
    else
      return 1+rheight;
  }
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
  cout << "Height of the tree is " << height(root);
  return 0;
}