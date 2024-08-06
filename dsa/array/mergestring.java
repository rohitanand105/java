package array;

public class mergestring {
    public static void main(String args[]) {
        String word1 = "abc";
        String word2 = "jkqrj";

        for (int i = 0; i < word1.length(); i++) {
            System.out.print(word1.charAt(i));
            int j = 0;
            for (j = ; j < word2.length();) {
                System.out.print(word2.charAt(j));
                j= j+1;
                break;
            }
           
        }
    }
}
