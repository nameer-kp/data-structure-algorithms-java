package Graphs;

import java.util.Hashtable;
import java.util.LinkedList;

public class Graph {
    @Override
    public String toString() {
        return "Graph{" +
                "noOfNodes=" + noOfNodes +
                ", connections=" + connections +
                '}';
    }

    private int noOfNodes;
    private Hashtable<Integer, LinkedList<Integer>> connections;
    public Graph(){
        noOfNodes=0;
        connections = new Hashtable<>();
    }
    public void addVertex (int a){
        noOfNodes++;
        connections.put(a,new LinkedList<Integer>());

    }
    public void addEdge(int a,int b){
        if(connections.containsKey(a)&& connections.containsKey(b)){
            connections.get(a).add(b);//adding b to a's connection list
            connections.get(b).add(a);//adding a to b's connection list   ...since its is a undirected graph
        }
        else System.out.println("vertex "+a+"or "+b+" is not found");
    }

    public static void main(String[] args) {
        Graph graph=new Graph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addEdge(3,1);
        graph.addEdge(3,4);
        graph.addEdge(4,2);
        graph.addEdge(4,5);
        graph.addEdge(1,2);
        graph.addEdge(1,0);
        graph.addEdge(0,2);
        graph.addEdge(6,5);
        System.out.println(graph);
    }


}
