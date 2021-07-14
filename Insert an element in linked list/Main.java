#include<iostream>
using namespace std;
struct Node
{
  int data;
  struct Node *next;
};
void ll_insert(struct Node **head, int in)
{
  Node *newnode = new Node;
  Node *last = *head;
  newnode -> data = in;
  newnode -> next = NULL;
  if(*head == NULL)
  {
    *head = newnode;
  }
  else
  {
    while(last -> next != NULL)
      last = last -> next;
    last -> next = newnode;
  }
}
  void print_ll(struct Node **head)
  {
    Node *temp = *head;
    while(temp != NULL)
    {
      cout << temp -> data << endl;
      temp = temp -> next;
    }
  }
int main()
{
  Node *head = NULL;
  int in;
  while(1)
  {
  	cin >> in;
    if(in >= 0)
      ll_insert(&head, in);
    else
      break;
  }
  print_ll(&head);
  return 0;
}