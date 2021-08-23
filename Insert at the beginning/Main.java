#include<iostream>
using namespace std;

struct node
{
  int data; // 8 bytes
  struct node *next; // 8 bytes
};

void sll_insert_begin(struct node **head, int value)
{
  struct node *newnode = (struct node*)malloc(sizeof(struct node));
  newnode->data = value;
  newnode->next = *head;
  *head = newnode;
}

void sll_print(struct node *head)
{
  node *temp = head;
  while(temp != NULL)
  {
    cout << temp->data << endl;
    temp = temp -> next;
  }
}
int main()
{
  struct node *head = NULL;
  int value;
  while(1)
  {
    cin >> value;
    if(value >= 0)
      sll_insert_begin(&head, value);
    else
      break;
  }
  sll_print(head);
  return 0;
}