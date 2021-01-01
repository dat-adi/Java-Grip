package Graphs;

import java.util.*;

class BreadthFirstSearch
{ 
    private int V;
    private LinkedList<Integer> adj[];

    BreadthFirstSearch(int v)
    { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
  
    void addEdge(int v,int w) 
    { 
        adj[v].add(w); 
    } 
  
    void BFS(int s) 
    { 
        boolean visited[] = new boolean[V]; 
  
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
  
        visited[s]=true; 
        queue.add(s); 
  
        while (queue.size() != 0) 
        { 
            s = queue.poll(); 
            System.out.print(s+" ");
    
            for (int n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            } 
        } 
    } 
  
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        BreadthFirstSearch g = new BreadthFirstSearch(4);
    
        do {
            System.out.println("Insert two points for the edge : ");
            g.addEdge(sc.nextInt(), sc.nextInt());
            System.out.print("Continue? (y/n) : ");
        } while (sc.next().charAt(0) != 'n');
  
        System.out.println("Following is Breadth First Traversal (starting from vertex 2)");
        g.BFS(2);
        sc.close();
    }
}