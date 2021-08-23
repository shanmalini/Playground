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

void preorder(struct nodetree *root)  // root left right
{
    if(root == NULL)
        return;
    cout << root -> data << " ";
    preorder(root->left);
    preorder(root->right);
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
  cout << "Preorder Traversal:" << endl;
  preorder(root);
  return 0;
}