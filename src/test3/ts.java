package test3;

public class ts {

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 8}; // must be sorted for binary search
        int target = 7;

        int index = binarySearch(arr, target);

        if (index != -1)
            System.out.println("Target found at index: " + index);
        else
            System.out.println("Target not found");
    }
}
