
import java.util.*;

public class Max_Min {

    // maximum element of the array
    public static int getLargest(int arr[]) {
        // create the valriable to store the -infinity = 0
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // minimum element of the array
    public static int getSmallest(int arr[]) {
        // create the valriable to store the +infinity
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    public static void main(String args[]) {
        int arr[] = {7, 3, 5, 1, 9, 3, 12, 2};
        System.out.println(getLargest(arr));
        System.out.println(getSmallest(arr));
    }
    
}
