package Trees;

import java.net.BindException;

public class BinarySearchTree {
    private BinaryNode root;

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }

    public void insert(int value) {
        BinaryNode node = new BinaryNode();
        node.setValue(value);
        if (root == null) {
            root = node;
            return;
        }
        BinaryNode current = root;
        //loop untill we set value
        while (true) {
            ////Left part
            if (value < current.getValue()) {
                //we only set new node as left iff current left is null
                if (current.getLeft() == null) {
                    current.setLeft(node);
                    return;
                }
                //updating current with left node
                current = current.getLeft();
            } else {////Right Part
                //we only set new node as Right iff current Right is null
                    if(current.getRight()==null){
                        current.setRight(node);
                        return;
                    }
                    //updating current with right node
                    current = current.getRight();
                }

            }

        }
        public void lookup(int value){
        int depth = 0; //this depth counts the level at which lookup element is found
        BinaryNode current=root;
        if(root.getValue()==value){
            System.out.println("value found at root");
            return;
        }
        while (current!=null){
            depth++;
            //right path
            if(current.getValue()<value){
                if (current.getValue()==value){//checking value of current node
                    System.out.println("element found at depth :"+depth);
                }
                current=current.getRight();
            }
            else {//left path
                if (current.getValue()==value){ //checking value of current node
                    System.out.println("element found at depth :"+depth);
                }
                current=current.getLeft();
            }
        }


        }

        public void remove(int value) {
            BinaryNode current = root;
            while (current != null) {
                //right path
                if (current.getValue() < value) {

                    BinaryNode afterCurrent = current.getRight();//afterCurrent is used reference node after current ....afternode is the node that to be deleted
                    if (afterCurrent.getValue() == value) {//checking value of current node
                        //checking if its a leaf or not
                        if (afterCurrent.getLeft() == null && afterCurrent.getRight() == null) {
                            System.out.println("item deleted :" + afterCurrent.getValue());
                            current.setRight(null);
                        }
                            else if(afterCurrent.getLeft() == null ^ afterCurrent.getRight() == null){//this becomes true only when 1 of the statement is true,ie..only one child
                            System.out.println("item deleted :" + afterCurrent.getValue());
                            if (afterCurrent.getLeft()!=null)//checking it has left node
                                current.setRight(afterCurrent.getLeft());//setting right node as afternode's left node

                            else
                                current.setRight(afterCurrent.getRight());//setting right node as afternode's right node

                    //TODO:: deletion for nodes having 1 child and 2 children
                        }
                    }
                        current = current.getRight();
                }else {//left path
                    BinaryNode afterCurrent = current.getLeft();//afterCurrent is used reference node after current .....afternode is the node that to be deleted
                    if (afterCurrent.getValue() == value) {//checking value of current node
                        //checking if its a leaf or not
                        if (afterCurrent.getLeft() == null && afterCurrent.getRight() == null) {
                            System.out.println("item deleted :" + afterCurrent.getValue());
                            current.setLeft(null); //setting left node as null
                        }
                        else if(afterCurrent.getLeft() == null ^ afterCurrent.getRight() == null){//this becomes true only when 1 of the statement is true,ie..only one child
                            System.out.println("item deleted :" + afterCurrent.getValue());
                            if (afterCurrent.getLeft()!=null)//checking it has left node
                            {current.setLeft(afterCurrent.getLeft());return; }//setting left node as afternode's left node

                            else
                            {current.setLeft(afterCurrent.getRight());return;}//setting left node as afternode's right node

                            //TODO:: deletion for nodes having 2 children
                        }
                    }
                        current = current.getLeft();
                }
            }
        }






    public static void main(String[] args) {
        BinarySearchTree tree= new BinarySearchTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);
        System.out.println(tree);
        tree.lookup(4);
        tree.remove(1);
        tree.remove(4);
        System.out.println(tree);
    }
}
