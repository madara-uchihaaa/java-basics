import java.util.HashMap;
import java.util.Map;
class Hello {
    public static void main(String[] arguments) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        map.put("a", map.get("a") + 1);

        map.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        // HashTable vs HashMap

        // HashTable is synchronized, HashMap is not
        // HashTable does not allow null keys or values, HashMap does
    }
}
