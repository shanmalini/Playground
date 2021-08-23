#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int nodes, edges, start, end, weight, i, j;
  char type[10];
  cout << "Please enter the number of nodes in the graph" << endl;
  cin >> nodes;
  int matrix[nodes][nodes];
  for(i = 1; i <= nodes; i++)
  {
    for(j = 1; j <= nodes; j++)
    {
      matrix[i][j] = 0;
    }
  }
  cout << "Please enter the number of edges in the graph" << endl;
  cin >> edges;
  cout << "Is the graph directed" << endl;
  cin >> type;
  cout << "Adjacency Matrix Representation:" << endl;
  for(i = 1; i <= nodes; i++)
  {
    for(j = 1; j <= nodes; j++)
    {
     cout << matrix[i][j] << " ";
    }
    cout << endl;
  }
  for(i = 1; i <= edges; i++)
  {
    cout << "Enter the start node, end node and weight of edge no " << i << endl;
    cin >> start >> end >> weight;
    if(strcmp(type, "yes") == 0)
      matrix[start][end] = weight;
    else
    {
      matrix[start][end] = weight;
      matrix[end][start] = weight;
    }
  }
  cout << "Adjacency Matrix Representation:" << endl;
  for(i = 1; i <= nodes; i++)
  {
    for(j = 1; j <= nodes; j++)
    {
     cout << matrix[i][j] << " ";
    }
    cout << endl;
  }
  return 0;
}