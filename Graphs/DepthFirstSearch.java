package Graphs;

import java.util.*;

class DepthFirstSearch
{ 
    private int V;

    private LinkedList<Integer> adj[]; 

    DepthFirstSearch(int v)
    { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 

    void addEdge(int v, int w) 
    { 
        adj[v].add(w);
    } 

    void DFSUtil(int v,boolean visited[]) 
    {
        visited[v] = true; 
        System.out.print(v+" "); 

        Iterator<Integer> i = adj[v].listIterator(); 
        while (i.hasNext()) 
        { 
            int n = i.next(); 
            if (!visited[n]) 
                DFSUtil(n, visited); 
        } 
    } 

    void DFS(int v) 
    {
        boolean visited[] = new boolean[V]; 

        DFSUtil(v, visited); 
    } 
  
    public static void main(String args[]) 
    { 
        DepthFirstSearch g = new DepthFirstSearch(4);
  
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Insert two points for the edge : ");
            g.addEdge(sc.nextInt(), sc.nextInt());
            System.out.print("Continue? (y/n) : ");
            if(sc.next().charAt(0) == 'n'){
                break;
            }
        }
  
        System.out.println("Following is Depth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        g.DFS(2); 
    } 
} 