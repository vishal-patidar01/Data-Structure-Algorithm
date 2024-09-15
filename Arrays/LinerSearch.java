public class LinerSearch {
    public static int linearSearch(int arr[], int key) {
        // iterate all index of arr
        for(int i=0; i<arr.length; i++) {
            // chech i is a key
            if(arr[i] == key) {
                return i;
            }
        }
        // return -1 if key is not found
        return -1;
    }
    public static void main(String args[]) {
        // given array 
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // call the function
        int idx = linearSearch(arr, 12);

        // return the value
        if(idx == -1) {
            System.out.println(" key is not found");
        }else {
            System.out.println("key is found at a index is : "+ idx);
        }
    }
}
