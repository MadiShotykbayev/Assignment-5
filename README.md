# Assignment-5

Binary Search Tree (BST) Implementation in Java
This is a Java implementation of a Binary Search Tree (BST) data structure. A BST is a binary tree where each node has a key-value pair, and the keys are stored in a way that allows for efficient search, insertion, and deletion operations.

## BST Class
The BST class represents the Binary Search Tree. It uses a private inner class Node to represent each node in the tree. Each Node object contains a key-value pair, as well as references to its left and right child nodes.

## Constructor
- 'Node(K key, V value)': Constructs a new Node object with the specified key and value.
## Public Methods
- 'void put(K key, V value)': Inserts a new key-value pair into the BST. If the key already exists, the corresponding value is updated.
- 'V get(K key)': Retrieves the value associated with the specified key from the BST. If the key is not found, null is returned.
- 'void delete(K key)': Removes the key-value pair with the specified key from the BST, if it exists.
- 'Iterable<K> iterator()': Returns an iterable collection of keys in the BST. The keys are returned in ascending order based on their natural ordering.
- 'int size()': Returns the number of key-value pairs stored in the BST.
## Usage
Here's an example of how to use the BST class:

```java
public class Main {
public static void main(String[] args) {
BST<Integer, String> bst = new BST<>();

        bst.put(50, "Apple");
        bst.put(30, "Banana");
        bst.put(20, "Cherry");
        bst.put(40, "Date");
        bst.put(70, "Elderberry");
        bst.put(60, "Fig");
        bst.put(80, "Grape");

        System.out.println("Size of the BST: " + bst.size());

        System.out.println("Value for key 40: " + bst.get(40));

        bst.delete(30);

        System.out.println("Size of the BST after deletion: " + bst.size());

        System.out.println("Keys in ascending order:");
        for (Integer key : bst.iterator()) {
            System.out.println(key);
        }
    }
}
``` 

## Output:

```
Size of the BST: 7
Value for key 40: Date
Size of the BST after deletion: 6
Keys in ascending order:
20
40
50
60
70
80
``` 
In the example above, we create a BST object, insert key-value pairs, retrieve values by key, delete a key-value pair, and iterate over the keys in ascending order.