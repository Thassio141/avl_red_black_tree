public class main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        // Inserção e impressão após cada inserção
        int[] keys = { 10, 20, 30, 40, 50, 25 };
        for (int key : keys) {
            tree.root = tree.insert(tree.root, key);
            System.out.println("Árvore após a inserção de " + key + ":");
            tree.printTreeWithBalanceFactor(tree.root);
            System.out.println("Pre-Ordem:");
            tree.preOrder(tree.root);
            System.out.println("\nIn-Ordem:");
            tree.inOrder(tree.root);
            System.out.println("\nPost-Ordem:");
            tree.postOrder(tree.root);
            System.out.println("\n--------------------------");
        }

        RedBlackTree t = new RedBlackTree();
        int[] arr = {1,4,6,3,22};
        for(int i=0;i<5;i++)
        {
            t.insert(arr[i]);
            System.out.println();
            t.inorderTraversal();
        }
        // you can check colour of any node by with its attribute node.colour
        t.printTreeInOrderWithColors();
    }
}
