package Recursion;

public class printIncOrder {
    public static void printIncOrder(int n) {
        if(n == 0) {
            return;
        }
        printIncOrder(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int  n = 10;
        printIncOrder(n);
    }
}
