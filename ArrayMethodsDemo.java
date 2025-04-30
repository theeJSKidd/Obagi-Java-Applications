import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayMethodsDemo {
    public static void main(String[] args) {
        // 1. toString
        int[] numbers = {5, 2, 9, 1};
        System.out.println("Original: " + Arrays.toString(numbers));

        // 2. sort
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));

        // 3. copyOf
        int[] copy = Arrays.copyOf(numbers, 6); // padded with zeros
        System.out.println("Copy: " + Arrays.toString(copy));

        // 4. copyOfRange
        int[] range = Arrays.copyOfRange(numbers, 1, 3);
        System.out.println("Copy of Range: " + Arrays.toString(range));

        // 5. equals
        int[] same = {1, 2, 5, 9};
        System.out.println("Equals: " + Arrays.equals(numbers, same));

        // 6. fill
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("Filled: " + Arrays.toString(filled));

        // 7. setAll
        Arrays.setAll(filled, i -> i * 10); // lambda: index * 10
        System.out.println("SetAll: " + Arrays.toString(filled));

        // 8. binarySearch (make sure it's sorted)
        int idx = Arrays.binarySearch(numbers, 5);
        System.out.println("Index of 5: " + idx);

        // 9. stream
        IntStream stream = Arrays.stream(numbers);
        System.out.print("Stream: ");
        stream.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 10. asList
        String[] names = {"Ana", "Bob", "Chloe"};
        List<String> nameList = Arrays.asList(names);
        System.out.println("List: " + nameList);

        // 11. deepToString
        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println("2D Array: " + Arrays.deepToString(matrix));

        // 12. deepEquals
        int[][] m1 = {{1, 2}, {3, 4}};
        int[][] m2 = {{1, 2}, {3, 4}};
        System.out.println("Deep Equals: " + Arrays.deepEquals(m1, m2));

        // 13. parallelSort
        int[] bigArray = {3, 6, 1, 8, 4, 2};
        Arrays.parallelSort(bigArray);
        System.out.println("Parallel Sorted: " + Arrays.toString(bigArray));
    }
}