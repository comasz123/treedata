public class Main {
    public static void main(String[] args) {
        Node root = new Node(8);
        Tree tree = new Tree();

        tree.add(8);
        tree.add(9);
        tree.add(3);
        tree.add(4);
        System.out.println(tree);
        System.out.println("ma 4 " + tree.containsElement(4));
        System.out.println("minium: "+ tree.getMaximum());
        System.out.println("maximum: " + tree.getMinimum());


    }
}
