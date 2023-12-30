import java.util.ArrayList;
import java.util.Collection;

class Hello {
    public static void main(String[] arguments) {
        // Different apis of ds
        // 1. Array
        // 2. ArrayList
        // 3. LinkedList
        // 4. Stack
        // 5. Queue
        // 6. PriorityQueue
        // 7. Deque
        // 8. HashSet
        // 9. LinkedHashSet
        // 10. TreeSet
        // 11. HashMap
        // 12. LinkedHashMap
        // 13. TreeMap
        // 14. HashTable
        // 15. WeakHashMap
        // 16. IdentityHashMap
        // 17. EnumMap
        // 18. PriorityQueue
        // ... and many more

        Collection<String> collection = new ArrayList<String>();

        collection.add("Hello");
        collection.add("World");
        collection.add("Rishabh");

        collection.forEach(item -> System.out.println("value->:" + item));

        System.out.println(collection);
    }
}
