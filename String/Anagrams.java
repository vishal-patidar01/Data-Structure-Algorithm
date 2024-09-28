public class Anagrams {

    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            System.out.println("is check");
            return false;
        }
        // char[] arr1 = str1.toCharArray();
        // char[] arr2 = str2.toCharArray();

        int freq1[] = new int[256];
        int freq2[] = new int[256];
        
        // for(int i=0; i<arr1.length; i++) {
        //     for(int j=0; j<arr2.length; j++) {
        //         if(arr1[i] != arr2[j]) {
        //             return false;
        //         }
        //     }
        // }


        for(int i=0; i<str1.length(); i++) {
            freq1[str1.charAt(i)]++;
            freq2[str2.charAt(i)]++;
        }

        for(int i=0; i<256; i++) {
            if(freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "listen";
        System.out.println(isAnagram(str1, str2));
    }
}
