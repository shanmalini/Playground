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

void sll_delete(struct node **head)
{
  node *temp = *head;
  *head = temp->next;
  delete temp;
}

int main()
{
  struct node *head = NULL;
  
  int value, count = 0;
  while(1)
  {
    cin >> value;
    if(value >= 0)
    {
      sll_insert(&head, value);
      count++;
    }
    else
      break;
  }
  cout << "Before deletion:" << endl;
  sll_print(head);
  for(int i = 1; i <= count; i++)
  {
    cout << "After " << i << " deletion:" << endl;
    sll_delete(&head);
    sll_print(head);
  }
  cout << "No value to delete";
  return 0;
}