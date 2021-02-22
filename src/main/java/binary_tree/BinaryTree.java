package binary_tree;

public class BinaryTree {
    private Node root;

    public void addNode(String data) {
        //TODO implement method
        if (root != null) {
            addToTree(root, data);
        }
        else {
            root = new Node(data);
        }
    }

    public boolean isContains(String data) {
        Node current = root;
        while (current != null) {
            int result = current.getData().compareTo(data);
            if (result > 0) {
                current = current.getLeft();
            }
            else if (result < 0) {
                current = current.getRight();
            }
            else {
                return true;
            }
        }
        return false;
    }

    public Node getRoot() {
        return root;
    }

    private void addToTree(Node node, String data) {
        if (isContains(data))
            return;
        if (data.compareTo(node.getData()) < 0) {
            if (node.getLeft() == null) {
                node.setLeft(new Node(data));
            }
            else {
                addToTree(node.getLeft(), data);
            }
        }
        else {
            if (node.getRight() == null) {
                node.setRight(new Node(data));
            }
            else {
                addToTree(node.getRight(), data);
            }
        }
    }
}
