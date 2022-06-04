public class Tree {
    Node root;

    private Node addRecursive(Node current, int element){
        if(current == null ) return new Node(element);
        if(element < current.value) current.left=addRecursive(current.left, element);
        else if (element > current.value) current.right = addRecursive(current.right, element);
        return current;
    }
    public void add(int value){
        this.root = addRecursive(root, value);
    }
    private boolean containsElementRecursive(Node current, int element){
        if(current == null) return false;
        if(element == current.value) return true;
        return element < current.value ? containsElementRecursive(current.left, element) :
                containsElementRecursive(current.right, element);
    }
    public boolean containsElement (int element){
        return containsElementRecursive(root, element);
    }
    private int findMaximum(Node root) {
        return root.left == null ? root.value : findMaximum(root.left);
    }
    private int findMinimum(Node root) {
        return root.right == null ? root.value : findMinimum(root.right);
    }
    public int getMaximum (){
        return findMaximum(root);
    }
    public int getMinimum () {
        return findMinimum(root);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "node=" + root +
                '}';
    }
}
