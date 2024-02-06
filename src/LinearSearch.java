/**
 * Linear Search Algorithm:
 */

import java.util.List;

public class LinearSearch {

    public static int linearSearch(List<Object> arr, Object target) {
        /*
         * Linear search algorithm
         * - Time complexity: O(n)
         * - Space complexity: O(1)
         */
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Test cases
        assert linearSearch(List.of(1, 2, 3, 4, 5), 3) == 2;
        assert linearSearch(List.of(1, 2, 3, 4, 5), 6) == -1;
        assert linearSearch(List.of(1, 2, 3, 4, 5), 1) == 0;

        System.out.println("Linear search algorithm passed");
    }
}
