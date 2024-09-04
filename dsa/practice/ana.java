
public class ana {

    public static void main(String args[]) {
        String a = "listen", b = "silent";

        boolean isanagram = true;

        if (a.length() != b.length()) {
            System.out.print("Not anagram");
        } else {

            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < b.length(); j++) {
                    if (a.charAt(i) != b.charAt(j)) {
                        isanagram = false;
                        break;

                    }
                }
            }
            if (isanagram == true) {
                System.out.print("anagram available");
            } else {

                System.out.print("anagram not available");
            }
        }

    }

}
