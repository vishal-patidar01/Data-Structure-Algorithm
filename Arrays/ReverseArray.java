public class ReverseArray {
    public static void reverse(int arr[]) {
        // method 1 to reverse array
        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        reverse(arr);
    }
}
