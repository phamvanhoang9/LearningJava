
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(array, 7));
    }
}
