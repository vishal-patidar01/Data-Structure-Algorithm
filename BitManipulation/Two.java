package BitManipulation;

public class Two {
    public static int convertBinaryToDecimal(String n) {
        int res = 0;
        int p2 = 1;

        for(int i=n.length()-1; i>=0; i--) {
            if(n.charAt(i)=='1') {
                res += p2;
            }
            p2 = p2*2;
        }
        return res;
    
    }
    public static void main(String[] args) {
        String n = "110110";
        System.out.println(convertBinaryToDecimal(n));
    }
}
