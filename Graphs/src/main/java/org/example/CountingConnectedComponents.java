package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CountingConnectedComponents {


    public int BFS(ArrayList<ArrayList<Integer>> adj, int V) {

        boolean[] visited = new boolean[V + 1];
        int count = 0;
        for (int i = 0; i < V; i++) {

            if (visited[i] == false) {
                worker(adj, i, visited);
                count++;
            }

        }
        return count;

    }

    private void worker(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {

        Queue<Integer>q =new LinkedList<Integer>();
        visited[s]=true;
        q.add(s);

        while (q.isEmpty()==false){
            int u= q.poll();
            System.out.print(u + " ");
            for (int v:adj.get(u)){
                if (visited[v]==false){
                    visited[v]=true;
                    q.add(v);
                }
            }
        }

    }

}
