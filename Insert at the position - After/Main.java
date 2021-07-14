#include<iostream>
using namespace std;

struct node
{
  int data;
  struct node *next;
};
struct node *head = NULL;

void sll_insert(struct node **head, int value)
{
  struct node *newnode = (struct node*)malloc(sizeof(struct node));
  node *temp = *head;
  newnode->data = value;
  newnode -> next = NULL;
  if(*head == NULL)
  {
    *head = newnode;
  }
  else
  {
    while(temp->next != NULL)
    {
      temp = temp->next;
    }
    temp->next = newnode;
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

void insert_at_before_postion(int pos, int val)
{
  int count = 0;
  struct node *newnode = (struct node*)malloc(sizeof(struct node));
  node *temp = head;
  while(temp->next != NULL && (pos-1) != count)
  {
    temp=temp->next;
    count++;
  }
  if((pos-1) == count)
  {
    newnode->data = val;
    newnode->next = temp->next;
    temp->next = newnode;
  }
}
int main()
{
  int value;
  while(1)
  {
    cin >> value;
    if(value >= 0)
      sll_insert(&head, value);
    else
      break;
  }
  cout << "Before inserting the value:" << endl;
  sll_print(head);
  cout << "Enter the position and value to be inserted:" << endl;
  cout << "After inserting the value:" << endl;
  int pos, val;
  cin >> pos >> val;
  insert_at_before_postion(pos, val);
  sll_print(head);
  return 0;
}