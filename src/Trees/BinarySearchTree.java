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

                    BinaryNode temp = current.getRight();//temp is used reference node before deleting node
                    if (temp.getValue() == value) {//checking value of current node
                        //checking if its a leaf or not
                        if (temp.getLeft() == null && temp.getRight() == null) {
                            System.out.println("item deleted :" + temp.getValue());
                            current.setRight(null);
                        }
                            else if(temp.getLeft() == null ^ temp.getRight() == null){
                            System.out.println("item deleted :" + temp.getValue());
                            if (temp.getLeft()!=null)
                                current.setRight(temp.getLeft());
                            else
                                current.setRight(temp.getRight());

                    //TODO:: deletion for nodes having 1 child and 2 children
                        }
                    }
                        current = current.getRight();
                }else {//left path
                    BinaryNode temp = current.getLeft();//temp is used reference node before deleting node
                    if (temp.getValue() == value) {//checking value of current node
                        //checking if its a leaf or not
                        if (temp.getLeft() == null && temp.getRight() == null) {
                            System.out.println("item deleted :" + temp.getValue());
                            current.setLeft(null);
                        }
                        else if(temp.getLeft() == null ^ temp.getRight() == null){
                            System.out.println("item deleted :" + temp.getValue());
                            if (temp.getLeft()!=null)
                            {current.setLeft(temp.getLeft());return;}

                            else
                            {current.setLeft(temp.getRight());return;}

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
