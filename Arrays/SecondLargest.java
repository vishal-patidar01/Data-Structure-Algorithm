public class SecondLargest {

    // method 1
    /* 
    public static void secondLargest(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

    }
    public static void printArr(int arr[]) {
        for (int i =  arr.length-1; i>=0; i--) {
            //System.out.print(arr[i]+" ");
            if(arr[i-1] < arr[i]) {
                System.out.println(arr[i-1]);
                return;
            }
            
        }
        System.out.println();
    }*/

    public static void secondLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element");
        } else{
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 5, 1, 8, 8};
        secondLargest(arr);
      
     }
}
