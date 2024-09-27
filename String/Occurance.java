public class Occurance {
    public static int countOccuString(String str, char ch ) {
        int n = str.length();
        int count = 0;

        for(int i=0; i<n; i++) {
            if(str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "java Programming";
        char ch = 'a';
        int occu = countOccuString(str, ch);
        System.out.println("The character '" + ch + "' appears " + occu + " times.");

    }
}
