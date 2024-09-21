package BitManipulation;

public class One {

    // Method 1 ---------

    // public static String convert2Binary(int n) {
    //     String res = " ";
    //     while (n > 0) {

    //         if (n % 2 == 1) {
    //             res = '1'+ res;
    //         }else {
    //             res = '0' + res;
    //         }
    //         n = n/2;
    //     }
        
    //     return res;

    // }

    // method 2 -----

    public static String convert2Binary(int n) {
        StringBuilder res = new StringBuilder();
        while (n > 0) {
            if (n%2 == 1) {
                res.append('1');
            }else {
                res.append('0');
            }
            n = n/2;
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        int n = 13;
        System.out.print("conver Decimal to Binary : ");
       // System.out.println(n + ": "+convert2Binary(n));
       System.out.println(convert2Binary(n));
    }
    
}
