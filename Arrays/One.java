
public class One {
    public static void moveAllZerosToEnd(int arr[]) {
        int n = arr.length;
        int idx = 0;

        for(int i=0; i<n; i++) {
            if(arr[i] != 0) {
               arr[idx++] = arr[i];
               //System.out.println(" val : "+idx);
            }
        }
        while (idx < n) {
            arr[idx++] = 0;
           // System.out.println("zero : "+idx);
        }
 
    }

    public static int missingNumber(int arr[]) {
        int n = arr.length+1;
        int totalSum = n*(n+1)/2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        return totalSum - actualSum;
    }

    public static boolean checkArrIsSortd(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static int duplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return arr[j];
                }
            }
        }
        return -1;
    }
public static void main(String[] args) {
    // int arr[] = {0, 1, 0, 4, 0, 11, 0, 3, 12};
    // moveAllZerosToEnd(arr);

    // for(int i : arr) {
    //     System.out.print(i+" ");
    // }

    // int arr[] = {7, 2, 6, 3, 4, 8, 5};
    // System.out.println(missingNumber(arr));

    // int arr[] = {1, 2, 3, 4, 6, 5};
    // System.out.println(checkArrIsSortd(arr));
  
    int arr[] = {4, 1, 1, 3, 4, 2};
    int idx = duplicate(arr);
    if(idx == -1) {
        System.out.println("not any duplicate number");
    }else {
        System.out.println("duplicate number is : "+ idx);
    }
}
    
}