class Solution {
    public void mergeSort(int arr[], int l, int r) {
        if(l < r) {
            int mid = l + (r - l) / 2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
    }

    void merge(int arr[], int l, int mid, int r) {
        int n = mid - l + 1;
        int m = r - mid;

        int left[] = new int[n];
        int right[] = new int[m];

        for(int i = 0; i < n; i++) {
            left[i] = arr[l + i];
        }

        for(int j = 0; j < m; j++) {
            right[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i < n && j < m) {
            if(left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < n) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j < m) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}