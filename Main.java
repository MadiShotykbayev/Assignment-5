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

        System.out.println("Value associated with key 40: " + bst.get(40));
        System.out.println("Value associated with key 45: " + bst.get(45));

        bst.delete(40);
        System.out.println("Value associated with key 40 after deletion " + bst.get(40));

        System.out.println("Keys in ascending order ");
        for (Integer key : bst.iterator()) {
            System.out.println(key);
        }

        bst = new BST<>();
        bst.put(5, "Five");
        bst.put(3, "Three");
        bst.put(7, "Seven");

        boolean exists = bst.consists(3);
        System.out.println(exists);

        exists = bst.consists(9);
        System.out.println(exists);
    }
}
