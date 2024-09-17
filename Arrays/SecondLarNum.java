public class SecondLarNum {
    public static int secondLargest(int arr[]) {
        int lagest = Integer.MIN_VALUE;

        for(int i=0; i<=arr.length-1; i++) {
            if(lagest < arr[i]) {
                lagest = arr[i];
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 7, 5, 8};
        System.out.println(secondLargest(arr));
    }
}
