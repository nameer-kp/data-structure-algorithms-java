package Algortithms.Searching;
import DataStructures.Trees.*;

import java.net.BindException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    public static void breadthFirstSearch(BinarySearchTree BST) {
        if(BST.getRoot()==null){
            System.out.println("provide a valid BST");
            return;
        }
        BinaryNode currentNode = BST.getRoot(); //this holds the root not
        Queue<BinaryNode> queue = new LinkedList<>();  //this holds the root nodes of all levels
        List<Integer> list = new ArrayList<>();
        queue.add(currentNode);

        while (queue.size() > 0) {
            BinaryNode element = queue.remove(); //this holds current queue node
            list.add(element.getValue());  //adding value to bfs list
            if (element.getLeft() != null) {   //if the current node has left node add that to the queue
                queue.add(element.getLeft());
            }
            if (element.getRight() != null) { // if the current node has right node add that to the queue
                queue.add(element.getRight());
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(20);
        tree.insert(1);
        tree.insert(6);

        tree.insert(170);
        tree.insert(15);
        breadthFirstSearch(tree);

    }
}