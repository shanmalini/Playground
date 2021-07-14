// C++ program to print DFS traversal from
// a given vertex in a given graph
#include <bits/stdc++.h>
using namespace std;

// Graph class represents a directed graph
// using adjacency list representation
class Graph
{
public:
	map<int, bool> visited;
	map<int, list<int>> adj;
	// function to add an edge to graph
	void addEdge(int v, int w);

	// DFS traversal of the vertices
	// reachable from v
	void DFS(int v);
};

void Graph::addEdge(int v, int w)
{
	adj[v].push_back(w); // Add w to v’s list.
}

void Graph::DFS(int v)
{
	// Mark the current node as visited and
	// print it
	visited[v] = true;
	cout << v << " ";

	// Recur for all the vertices adjacent
	// to this vertex
	list<int>::iterator i;
	for (i = adj[v].begin(); i != adj[v].end(); ++i)
		if (!visited[*i])
			DFS(*i);
}

// Driver code
int main()
{
	int n, snode, enode;
  cin >> n;
  Graph g;
  if(n == 0)
    cout << "Graph doesn't exist";
  else
  {
  while(1)
  {
    cin >> snode >> enode;
    if(snode != -1 && enode != -1)
  		g.addEdge(snode, enode);
    else
      break;
  }
  cout << "DFS : ";
	g.DFS(0);
  }
	return 0;
}

// improved by Vishnudev C
