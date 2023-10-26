public class QuickSortingExample {
    public static void main(String[] args) {
        int arr[] = {15, 20, 25, 1, 0, 7, 8, 111, 14, 7};
        int length = arr.length;
        QuickSortingExample qse = new QuickSortingExample();
        qse.quickSortArray(arr, 0, length - 1);
        qse.printArray(arr);
    }

    int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }

    void quickSortArray(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSortArray(arr, low, pi - 1);
            quickSortArray(arr, pi, high);
        }
    }

    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "  "); // Use print instead of println to print on the same line
        }
    }
}
