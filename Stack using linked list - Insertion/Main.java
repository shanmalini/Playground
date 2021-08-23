#include<iostream>
using namespace std;
struct Node
{
  int data;
  struct Node *next;
};
void stack_insert(struct Node **top, int in)
{
  Node *newnode = new Node;
  Node *last = *top;
  newnode -> data = in;
  newnode -> next = NULL;
  if(*top == NULL)
  {
    *top = newnode;
  }
  else
  {
    *top = newnode;
    newnode -> next = last;
  }
}
  void print_stack(struct Node **top)
  {
    Node *temp = *top;
    while(temp != NULL)
    {
      cout << temp -> data << ' ';
      temp = temp -> next;
    }
  }
int main()
{
  Node *top = NULL;
  int in;
  while(1)
  {
  	cin >> in;
    if(in >= 0)
      stack_insert(&top, in);
    else
      break;
  }
  print_stack(&top);
  return 0;
}