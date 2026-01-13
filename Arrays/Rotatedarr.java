public class Rotatedarr {

    public static void main(String[] args) {
        int[] arr = { 6, 7, 8, 1, 2, 3, 4, 5 };
        int target = 7;
        int index = searchInRot(arr, target);
        System.out.println(index);
    }

    static int searchInRot(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        int pivot = start;

        if (target >= arr[pivot] && target <= arr[arr.length - 1]) {
            return binarySearch(arr, pivot, arr.length - 1, target);
        } else {
            return binarySearch(arr, 0, pivot - 1, target);
        }
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
