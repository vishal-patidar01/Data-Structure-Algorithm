package Basics;
import java.util.*;

public class basic_01 {
    public static void graterOfThreeNum(int a, int b, int c) {
        if(a > b) {
            if(a > c) {
                System.out.println("a is grater than b and c");
            }else {
                System.out.println("c is grater than a and b");
            }
        } else if(b > c) {
            System.out.println("b is grater than a and c");
        }else {
            System.out.println("c is grater than a ans b");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        graterOfThreeNum(a, b, c);
    }
}
