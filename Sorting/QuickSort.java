public class QuickSort {

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // Pivot is chosen as the last element
        int i = si-1;  

        for(int j=si; j<ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                //Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Place pivot at the right position by swapping
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        //Return the partition index
        return i;
    }

    public static void quickSort(int arr[], int si, int ei) {
        if(si >= ei) {
            return;
        }

        int pIdx = partition(arr, si, ei);

        // Recursively sort the sub-arrays
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx + 1, ei);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}
