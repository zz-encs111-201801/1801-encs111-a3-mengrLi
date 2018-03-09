package q03_quickSort;

public class Solution {
    public void quickSort(int[] arr) {
        quickSortRE(arr,0,arr.length-1);


    }
    private void quickSortRE(int arr[],int low,int high)
    {
        if (arr == null || arr.length == 0)
            return ;

        if (low >= high)
            return ;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];


        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }


        if (low < j)
            quickSortRE(arr, low, j);

        if (high > i)
            quickSortRE(arr, i, high);



    }




}
