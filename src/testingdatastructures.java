public class testingdatastructures {
    public static void main(String[] args) {
        // linklist linky = new linklist();
        // for(int i = 0; i < 11; i++) {
        //     linky.add(i);
        // }
        // linky.write();
        // System.out.println();
        // System.out.println(linky.get(3));
        // System.out.println();
        // linky.add(36,3);
        // linky.write();
        // System.out.println();
        // System.out.println();
        // System.out.println();
        // linky.remove(3);
        // linky.write();
        binarysearchtree tree = new binarysearchtree();
        tree.add(7);
        tree.add(4);
        tree.add(23);
        tree.add(14);
        tree.add(3);
        tree.add(15);
        tree.add(5);
        tree.add(17);
        tree.add(24);
        tree.add(18);
        tree.add(1);
        tree.add(2);
        tree.write();
        System.out.println(tree.contains(2));
        System.out.println(tree.contains(45));
        System.out.println();
        System.out.println();
        tree.remove(4);
        tree.remove(63);
        tree.remove(17);
        tree.write();
        System.out.println();
        System.out.println();
        tree.remove(18);
        tree.write();
    }
}
