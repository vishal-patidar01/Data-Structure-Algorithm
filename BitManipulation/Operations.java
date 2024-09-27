package BitManipulation;


// Get ith bit
// Set ith bit
// Clear ith bit


public class Operations {
    //get ith bit
    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;

        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // set ith Bit
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;

        return n|bitMask;
    }

    // Clear ith bit
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);

        return n&bitMask;
    }

    // update ith bit
    
    public static void main(String[] args) {
        // System.out.println(getIthBit(5, 2));
        // System.out.println(getIthBit(5, 1));
        // System.out.println(getIthBit(5, 0));

        // System.out.println(setIthBit(10, 2));
        // System.out.println(setIthBit(7, 2));
        // System.out.println(setIthBit(3, 2));

        System.out.println(clearIthBit(10, 1));
    }
}
