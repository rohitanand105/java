
public class palindrome {

    public static void main(String args[]) {
        String a = "radar";
        boolean isPalindrome = true;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                isPalindrome = false;
                // break;
            }

        }

        if (isPalindrome == true) {
            System.out.print("Palindrome word");
        } else {
            System.out.print("Not a palindrome word");
        }

    }

}
