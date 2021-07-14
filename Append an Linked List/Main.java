#include<iostream>
using namespace std;
// node declaration
struct node  // 16 bytes
{
  int data;  // 4 bytes + 4 bytes(structure padding)
  struct node *next;  // 8 bytes
};

void sll_insert(struct node **head, int value)
{
  struct node *newnode = (struct node*)malloc(sizeof(struct node));
  node *temp = *head;
  newnode->data = value;
  newnode->next = NULL;
  if(*head == NULL)
  {
    *head = newnode;  // appending the 1st node
  }
  else
  {
    while(temp->next != NULL)
    {
      temp = temp -> next;
    }
    temp->next = newnode;  // appending the 2nd, 3rd, etc nodes
  }
}
void sll_print(struct node *head)
{
  node *temp = head;
  while(temp != NULL)
  {
    cout << temp->data << endl;
    temp = temp->next;
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
      sll_insert(&head, value);
    else
      break;
  }
  sll_print(head);
  return 0;
}