package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//O(V+E)
public class BFSv2 {


    public void bfsDisc(ArrayList<ArrayList<Integer>> adj,int V){
        boolean[] visited=new boolean[V+1];
        for (int i=0;i<V;i++){
            if (visited[i]==false){
                BFS(adj,i,visited);
            }
        }


    }

    private void BFS(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {

        Queue<Integer> q=new LinkedList<Integer>();
        visited[s]=true;
        q.add(s);
        while (q.isEmpty()==false){
            int u= q.poll();
            System.out.print(u + "");

            for (int v:adj.get(u)){
                if (visited[v]==false){
                    visited[v]=true;
                    q.add(v);
                }
            }

        }
    }

}
