#include<stdio.h>  
#include<stdlib.h>  

struct node  
{  
    int data;  
    struct node *left;   
    struct node *right;   
};  
struct node *root;  
void insert(int item)  
{  
    struct node *ptr, *parentptr , *nodeptr;  
    ptr = (struct node *) malloc(sizeof (struct node));  
    if(ptr == NULL)  
    {  
        printf("can't insert");  
    }  
    else   
    {  
    ptr -> data = item;  
    ptr -> left = NULL;  
    ptr -> right = NULL;   
    if(root == NULL)  
    {  
        root = ptr;  
        root -> left = NULL;  
        root -> right = NULL;  
    }  
    else   
    {  
        parentptr = NULL;  
        nodeptr = root;   
        while(nodeptr != NULL)  
        {  
            parentptr = nodeptr;   
            if(item < nodeptr->data)  
            {  
                nodeptr = nodeptr -> left;   
            }   
            else   
            {  
                nodeptr = nodeptr -> right;  
            }  
        }  
        if(item < parentptr -> data)  
        {  
            parentptr -> left = ptr;   
        }  
        else   
        {  
            parentptr -> right = ptr;   
        }  
    }  
    }  
}  
struct node *lca(struct node* root, int n1, int n2)
{
    if (root == NULL) return NULL;
  
    // If both n1 and n2 are smaller than root, then LCA lies in left
    if (root->data > n1 && root->data > n2)
        return lca(root->left, n1, n2);
  
    // If both n1 and n2 are greater than root, then LCA lies in right
    if (root->data < n1 && root->data < n2)
        return lca(root->right, n1, n2);
  
    return root;
}
int main ()  
{  
    int choice,item, n1, n2;  
    while(1)
    {
      scanf("%d",&item);  
      if(item != -1)
       insert(item);  
      else
        break;
    }
  printf("Enter the value of n1 and n2:\n");
  scanf("%d %d", &n1, &n2);
   struct node *t = lca(root, n1, n2);
  printf("Common ancestor of %d and %d is %d",n1, n2, t->data);
}  