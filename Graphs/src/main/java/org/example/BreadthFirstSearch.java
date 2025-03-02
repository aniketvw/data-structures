package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public static void bFS(int V, ArrayList<ArrayList<Integer>> adj,int s){


        boolean[] visited=new boolean[V+1];

        Queue<Integer>q=new LinkedList<Integer>();

        visited[s]=true;

        q.add(s);

        while (q.isEmpty()==false){

            int u=q.poll();
            System.out.print(u+"");
            for (int v:adj.get(u)){
                if (visited[v]==false){
                    visited[v]=true;
                    q.add(v);
                }
            }

        }


    }

}
