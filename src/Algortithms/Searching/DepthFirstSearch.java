package Algortithms.Searching;
import DataStructures.Trees.*;

import java.util.ArrayList;
import java.util.List;


public class DepthFirstSearch {
    public static void DepthFirstSearchPostOrder(BinarySearchTree tree)
    {
    }
public static void DepthFirstSearchInOrder(BinarySearchTree tree)
    {
        List<Integer> list = new ArrayList<>();
        System.out.println(traverseInOrder(tree.getRoot(),list));
}
public static void DepthFirstSearchPreOrder(BinarySearchTree tree){

    }
    public static List<Integer> traverseInOrder(BinaryNode node,List<Integer> list){
        if(node.getLeft()!=null){
            traverseInOrder(node.getLeft(),list); //this recursion goes to very left nodes
        }
        list.add(node.getValue()); // this adds the element to the list
        if(node.getRight()!=null){
            traverseInOrder(node.getRight(),list); //this goes to the right nodes
        }

        return list;
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
        DepthFirstSearchInOrder(tree);
    }
}
