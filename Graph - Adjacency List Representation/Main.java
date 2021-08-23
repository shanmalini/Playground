#include<iostream>
#include<list>
using namespace std;
void print(list<int> adj_list[], int nodes)
{
  for(int i = 0; i < nodes; i++)
  {
    cout << i << "--->";
    list<int> :: iterator it;
    for(it=adj_list[i].begin(); it!=adj_list[i].end(); it++)
    {
      cout << *it << " ";
    }
    cout << endl;
  }
}
int main()
{
  int nodes, edges, start, end, i;
  cout << "Enter the number of vertices:" << endl;
  cin >> nodes;
  list<int> adj_list[nodes];
  cout << "Enter the number of edges:" << endl;
  cin >> edges;
  for(i = 0; i < edges; i++)
  {
    cout << "Enter the Start node and End node of edge " << i+1 << endl;
    cin >> start >> end;
    adj_list[start].push_back(end);
    adj_list[end].push_back(start);
  }
  cout << "Adjacency List:" << endl;
  print(adj_list, nodes);
}
