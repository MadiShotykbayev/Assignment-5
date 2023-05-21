import java.util.ArrayList;
import java.util.List;

public class BST<K extends Comparable<K>, V> {
    private Node root;
    private class Node
    {
        private K key;
        private V value;
        private Node left, right;
        public Node(K key, V value)
        {
            this.key = key;
            this.value = value' '
        }
    }
    public void put(K key, V value) {
        root = putNode(root, key, value);
    }

    private Node putNode(Node node, K key, V value) {
        if (node == null) {
            return new Node(key, value);
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = putNode(node.left, key, value);
        } else if (cmp > 0) {
            node.right = putNode(node.right, key, value);
        } else {
            node.value = value;
        }

        return node;

    }

    public V get(K key) {
        Node node = getNode(root, key);
        if (node != null) {
            return node.value;
        }
        return null;
    }
    private Node getNode(Node node, K key) {
        if (node == null || key.compareTo(node.key) == 0)
        return node;


        if (key.compareTo(node.key) < 0) {
            return getNode(node.left, key);
        } else {
            return getNode(node.right, key);
        }
    }
    public void delete(K key) {
        root = deleteNode(root, key);
    }
    private Node deleteNode(Node node, K key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = deleteNode(node.left, key);
        } else if (cmp > 0) {
            node.right = deleteNode(node.right, key);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                Node temp = node;
                node = findMinNode(temp.right);
                node.right = deleteMinNode(temp.right);
                node.left = temp.left;
            }
        }
        return node;
    }
    private Node findMinNode(Node node) {
        if (node.left == null) {
            return node;
        }
        return findMinNode(node.left);
    }
    private Node deleteMinNode(Node node) {
        if (node.left == null) {
            return node.right;
        }
        node.left = deleteMinNode(node.left);
        return node;
        }
    public Iterable<K> iterator() {
        List<K> keys = new ArrayList<>();
        inorderTravelsal(root, keys);
        return keys;
    }
}
