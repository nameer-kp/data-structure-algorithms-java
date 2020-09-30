package DataStructures.Trees;

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

    public BinaryNode getRoot() {
        return root;
    }

    public void setRoot(BinaryNode root) {
        this.root = root;
    }

    public void remove(int value) {
            BinaryNode parent = null;
            BinaryNode current = root;
            while (current != null) {
                if (value<current.getValue()){
                    parent=current;
                    current=current.getLeft();
                }
                else if (value>current.getValue()){
                    parent=current;
                    current=current.getRight();
                }
                else if (current.getValue()==value){
                    if(current.getRight()==null){ //Option 1 -only left child
                        if(parent==null){
                            this.root=current.getLeft();
                        }
                        if (current.getValue()<parent.getValue()){   ///checking if the current node lies on left or right of parent  and swapping them accordingly
                            parent.setLeft(current.getLeft());
                        }
                        else if(current.getValue()>parent.getValue()){
                            parent.setRight(current.getLeft());
                        }
                        break;
                    }
                    else if(current.getLeft()==null){ //Option 1 -only right child
                        if(parent==null){
                            this.root=current.getLeft();
                        }
                        if (current.getValue()<parent.getValue()){   ///checking if the current node lies on left or right of parent  and swapping them accordingly
                            parent.setLeft(current.getLeft());
                        }
                        else if(current.getValue()>parent.getValue()){
                            parent.setRight(current.getLeft());
                        }
                        break;
                    }
                    else if (current.getLeft()==null&&current.getRight()==null){ // option 2 --leaf node
                        if(parent==null){
                            this.root=null;
                        }
                        if (current.getValue()<parent.getValue()){   ///checking if the current node lies on left or right of parent  and swapping them accordingly
                            parent.setLeft(null);
                        }
                        else if(current.getValue()>parent.getValue()){
                            parent.setRight(null);

                    }
                        break;

                }
                    else {
                        BinaryNode replacementNode =current.getRight();
                        BinaryNode replacementNodeParent = null;
                        while(replacementNode.getLeft()!=null){
                            replacementNodeParent=replacementNode;
                            replacementNode=replacementNode.getLeft();
                        }
                        if (replacementNodeParent==null) { //replacement node as no left node
                            if (current.getValue() < parent.getValue()) {   ///checking if the current node lies on left or right of parent  and swapping them accordingly
                                parent.setLeft(replacementNode);
                            } else if (current.getValue() > parent.getValue()) {
                                parent.setRight(replacementNode);

                            }
                            break;
                        }
                            if(replacementNode.getRight()!=null){ //replace node as right child
                                replacementNodeParent.setLeft(replacementNode.getRight());
                                if (current.getValue() < parent.getValue()) {   ///checking if the current node lies on left or right of parent  and swapping them accordingly
                                    parent.getLeft().setValue(replacementNode.getValue());
                                } else if (current.getValue() > parent.getValue()) {
                                    parent.getRight().setValue(replacementNode.getValue());

                                }
                                break;
                            }
                            else { //repalcement node has children
                                replacementNodeParent.setLeft(null);
                                if (current.getValue() < parent.getValue()) {   ///checking if the current node lies on left or right of parent  and swapping them accordingly
                                    parent.getLeft().setValue(replacementNode.getValue());
                                } else if (current.getValue() > parent.getValue()) {
                                    parent.getRight().setValue(replacementNode.getValue());

                                }
 //TODO test all cases
                            }
                        }
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
        tree.insert(190);
        tree.insert(100);
        tree.insert(110);
        System.out.println(tree);
        tree.lookup(4);
        tree.remove(20);
        System.out.println(tree);
    }
}
