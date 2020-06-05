package graph_traversal;

import java.io.*; 
import java.util.*; 

class breadthFirstSearch 
{ 
    private int V;
    private LinkedList<Integer> adj[]; 

    breadthFirstSearch(int v) 
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
  
            Iterator<Integer> i = adj[s].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        } 
    } 
  
    public static void main(String args[]) 
    { 
        breadthFirstSearch g = new breadthFirstSearch(4); 
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Insert two points for the edge : ");
            g.addEdge(sc.nextInt(), sc.nextInt());
            System.out.print("Continue? (y/n) : ");
            if(sc.next().charAt(0) == 'n'){
                break;
            }
        }
  
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        g.BFS(2);
        sc.close();
    }
}