public class FindDuplicate {
     public static void findDuplicateCharacter(String str) {
        int charCount[] = new int[256];

        for(char c : str.toCharArray()) {
            charCount[c]++;
        }

        for(int i=0; i<charCount.length; i++) {
            if(charCount[i] > 1) {
                System.out.println((char) i + " occurs " + charCount[i] + " times.");
            }
        }
    }
    public static void main(String[] args) {
        String str = "programming";
        findDuplicateCharacter(str);
    }
}
