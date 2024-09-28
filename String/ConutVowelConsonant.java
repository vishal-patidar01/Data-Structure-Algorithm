public class ConutVowelConsonant {
    public static void countVowelsConsonants(String str) {
        int vowel = 0;
        int consonant = 0;

        str = str.toLowerCase();
        for(char c : str.toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c=='u') {
                vowel++;
            }else if(c >= 'a' && c <='z') {
                consonant++;
            }
        }
        System.out.println("vowel : "+ vowel + ", consonant : "+consonant);
    }
    public static void main(String args[]) {
        String str = "vishal patidar";
        countVowelsConsonants(str);
    }
}
