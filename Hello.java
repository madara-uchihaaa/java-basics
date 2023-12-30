import java.util.List;
class Hello {
    public static void main(String[] arguments) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        Integer sum = list.stream()
            .filter(i -> i % 2 == 0)
            .map(i -> i * 2)
            .reduce(0, (a, b) -> a + b);

        System.out.println(sum);
    }
}
