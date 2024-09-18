public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        boolean swapped;
        for(int turn=0; turn<n-1; turn++) {// outer loop
            swapped = false;
            for(int j=0; j<n-1-turn; j++) {// inner loop
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    // print the array

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) { // Time compl -> O(n^2) 
        int arr[] = {5, 4, 1, 3, 2};
        bubbleSort(arr);
        printArr(arr);

    }
}