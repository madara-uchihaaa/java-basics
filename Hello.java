import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Hello {
    public static void main(String[] arguments) {

        // Set -> To store unique values
        Set<String> set = new HashSet<String>();
        // Hashset -> To store unique values with no order

        // TreeSet -> To store unique values with ascending order

        Set<Integer> treeSet = new TreeSet<Integer>();

        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(4);

        treeSet.forEach((s) -> System.out.println(s));

        set.add("Hello");
        set.add("World");
        set.add("Hello");
        set.add("World");

        set.forEach((s) -> System.out.println(s));
        System.out.println(set);
    }
}
