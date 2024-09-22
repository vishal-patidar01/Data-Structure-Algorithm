public class Revers {
    public static String revers(String str) {
        StringBuilder s = new StringBuilder(" ");
        String newStr = " ";
        for(int i=str.length()-1; i>=0; i--) {
            newStr += str.charAt(i);
        }

        return newStr;
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(revers(str));
    }
}
