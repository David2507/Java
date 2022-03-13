class QuickSort {

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                arr[i]+=arr[j]-(arr[j]=arr[i]);

            }
        }
        arr[i + 1]+=arr[high]-(arr[high]=arr[i + 1]);


        return i + 1;
    }

    static void qSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            qSort(arr, low, pi - 1);
            qSort(arr, pi + 1, high);
        }
    }

    public static void main(String args[]) {
        int n = 9;
        int arr[] = {4, 21, 6, 9, 5,10,157,0,87};
        qSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
} 