package BitManipulation;

public class CheckANumber {
    public static void evenORodd(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        evenORodd(n);
        evenORodd(6);
        evenORodd(7);
        evenORodd(12);
        evenORodd(60);
    }
}
